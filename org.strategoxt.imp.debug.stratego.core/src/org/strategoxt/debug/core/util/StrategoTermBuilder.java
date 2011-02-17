package org.strategoxt.debug.core.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoInt;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoReal;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTuple;
import org.spoofax.terms.TermFactory;
import org.strategoxt.debug.core.control.EventProfiler;

import com.sun.jdi.ArrayReference;
import com.sun.jdi.Field;
import com.sun.jdi.InterfaceType;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.Type;
import com.sun.jdi.Value;

/**
 * Now fails because of the new-terms implementation.
 * TODO: fix using interfaces...
 * @author rlindeman
 *
 */
public class StrategoTermBuilder {
	
	private TermFactory f = new TermFactory();
	
	public StrategoTermBuilder()
	{
		
	}
	
	/**
	 * The given Value should be a String object. The method returns the string contents.
	 * @param value
	 * @return
	 */
	public String buildString(Value value)
	{
		// value should be a string
		String s = value.toString();
		// strip surrounding quotes
		s = s.substring(1, s.length()-1);
		return s;
	}
	
	public int buildInt(Value value)
	{
		// value should be an int
		String s = value.toString();
		int i = Integer.parseInt(s);
		return i;
	}
	
	public double buildDouble(Value value)
	{
		// value should be an double
		String s = value.toString();
		double d = Double.parseDouble(s);
		return d;
	}
	
	public IStrategoReal buildStrategoReal(Value value)
	{
        ObjectReference obj = (ObjectReference) value; // instance of org.strategoxt.lang.terms.StrategoString
        ReferenceType refType = obj.referenceType(); // class org.strategoxt.lang.terms.StrategoString
        
        Field valueField = refType.fieldByName("value");
        Value valueValue = obj.getValue(valueField); // double/real
        
        double double_value = -1.0;
        
        double_value = buildDouble(valueValue);
        IStrategoReal strategoReal = f.makeReal(double_value);
		return strategoReal;
	}
	
	public IStrategoInt buildStrategoInt(Value value)
	{
        ObjectReference obj = (ObjectReference) value; // instance of org.strategoxt.lang.terms.StrategoInt
        ReferenceType refType = obj.referenceType(); // class org.strategoxt.lang.terms.StrategoString
        
        Field valueField = refType.fieldByName("value");
        Value valueValue = obj.getValue(valueField); // int
        
        int int_value = -1;
        
        int_value = buildInt(valueValue);
        IStrategoInt strategoInt = f.makeInt(int_value);
		return strategoInt;		
	}

	
	public IStrategoString buildStrategoString(Value value)
	{
        ObjectReference obj = (ObjectReference) value; // instance of org.strategoxt.lang.terms.StrategoString
        ReferenceType refType = obj.referenceType(); // class org.strategoxt.lang.terms.StrategoString
        
        Field valueField = refType.fieldByName("value");
        Value valueValue = obj.getValue(valueField); // string
        
        //Field storageTypeField = refType.fieldByName("storageType");
        //Value storageTypeValue = obj.getValue(storageTypeField); // int
        
		String string_value = "";
		//IStrategoList annotations = null;
		//int storageType = -1;
		
		string_value = buildString(valueValue);
		//storageType = buildInt(storageTypeValue);
		//StrategoString strategoString = new StrategoString(string_value, annotations, storageType);
		IStrategoString strategoString = f.makeString(string_value);
		return strategoString;
	}
	
	
	public IStrategoTuple buildStrategoTuple(Value value)
	{
        ObjectReference obj = (ObjectReference) value; // instance of org.strategoxt.lang.terms.StrategoTuple
        ReferenceType refType = obj.referenceType(); // class org.strategoxt.lang.terms.StrategoTuple
        
        Field kidsField = refType.fieldByName("kids");
        Value kidsValue = obj.getValue(kidsField); // org.spoofax.interpreter.terms.IStrategoTerm
        
		IStrategoTerm[] terms = null;
		
		terms = buildStrategoTermArray(kidsValue);
		
		IStrategoTuple strategoTuple = f.makeTuple(terms, null);
		return strategoTuple;
	}
	
	public IStrategoAppl buildStrategoAppl(Value value)
	{
		EventProfiler.instance.startMark("BUILD");
        ObjectReference obj = (ObjectReference) value; // instance of org.strategoxt.lang.terms.StrategoAppl
        ReferenceType refType = obj.referenceType(); // class org.strategoxt.lang.terms.StrategoAppl
        
        EventProfiler.instance.subMark("BUILD", "B-1");
        
        Field ctorField = refType.fieldByName("ctor");
        Value ctorValue = obj.getValue(ctorField); // org.strategoxt.lang.terms.StrategoConstructor
        
        EventProfiler.instance.subMark("BUILD", "B-2");
        
        Field kidsField = refType.fieldByName("kids");
        Value kidsValue = obj.getValue(kidsField); // org.spoofax.interpreter.terms.IStrategoTerm[]
        
        IStrategoConstructor ctr = null;
        IStrategoList kids = null;
        
        EventProfiler.instance.subMark("BUILD", "B-3");
        
        ctr = buildStrategoConstructor(ctorValue);
        
        EventProfiler.instance.subMark("BUILD", "B-4");
        
        kids = buildStrategoList(kidsValue);
    
        EventProfiler.instance.subMark("BUILD", "B-5");
        
		IStrategoAppl strategoAppl = f.makeAppl(ctr, kids);
		
        EventProfiler.instance.subMark("BUILD", "B-6");
        
        return strategoAppl;
	}
	
	public IStrategoList buildStrategoList(Value value) 
	{
		// instance of org.spoofax.interpreter.terms.IStrategoTerm[]
		// ArrayReference
		if (value instanceof ArrayReference)
		{
	    	ArrayReference arrayRef = (ArrayReference) value;
	    	
	    	Collection<IStrategoTerm> terms = null;
	    	
	    	terms = new ArrayList<IStrategoTerm>();
	    	if (arrayRef.length() > 0)
	    	{
				for (Iterator<Value> it = arrayRef.getValues().iterator(); it.hasNext(); ) 
				{
					Value elementValue = it.next();
					IStrategoTerm term = null;
					term = buildIStrategoTerm(elementValue);
					// build IStrategoTerm
					terms.add(term);
				}
	    	}
			IStrategoList strategoList = f.makeList(terms);
			return strategoList;
		} else if (value instanceof ObjectReference)
		{
	        ObjectReference obj = (ObjectReference) value; // instance of org.strategoxt.lang.terms.StrategoAppl
	        ReferenceType refType = obj.referenceType(); // class org.strategoxt.lang.terms.StrategoAppl
	        
	        // head is an IStrategoTerm
	        // tail is an IStrategoList
	        Field headField = refType.fieldByName("head");
	        Value headValue = obj.getValue(headField); // org.strategoxt.lang.terms.StrategoConstructor
	        
	        Field tailField = refType.fieldByName("tail");
	        Value tailValue = obj.getValue(tailField); // org.spoofax.interpreter.terms.IStrategoTerm[]
	        
	        IStrategoTerm head = null;
	        IStrategoList tail = null;

	        if (headValue == null)
	        {
	        	return TermFactory.EMPTY_LIST;
	        }
	        else
	        {
		        head = buildIStrategoTerm(headValue);
		        tail = buildStrategoList(tailValue);
		        IStrategoList strategoList = f.makeListCons(head, tail, null);
		        return strategoList;
	        }
		}
		else
		{
			System.err.println("Value cannot be converted to a list: " + value.type());
			throw new RuntimeException("Value cannot be converted to a list: " + value.type());
			//return null;
		}
	}
	
	public IStrategoTerm[] buildStrategoTermArray(Value value)
	{
    	ArrayReference arrayRef = (ArrayReference) value;
    	
    	List<IStrategoTerm> terms = null;
    	
    	terms = new ArrayList<IStrategoTerm>();
    	if (arrayRef.length() > 0)
    	{
    		for (Iterator<Value> it = arrayRef.getValues().iterator(); it.hasNext(); ) 
    		{
    			Value elementValue = it.next();
    			IStrategoTerm term = null;
    			term = buildIStrategoTerm(elementValue);
    			// build IStrategoTerm
    			terms.add(term);
    		}
    	}

		IStrategoTerm[] termArray = new IStrategoTerm[terms.size()];
		for(int i = 0; i < termArray.length; i++)
		{
			termArray[i] = terms.get(i);
		}
		return termArray;
	}
	
	public IStrategoTerm buildIStrategoTerm(Value value)
	{
		// dispatch to correct builder
		Type t = value.type();
		String type = t.name(); // TODO: work with interfaces instead of the internal implementations
		if (t instanceof com.sun.jdi.ClassType)
		{
			com.sun.jdi.ClassType ct = (com.sun.jdi.ClassType) t;
			for(InterfaceType it : ct.allInterfaces())
			{
				String n = it.name();
				
				if (n.equals("org.spoofax.interpreter.terms.IStrategoTerm"))
				{
					// value implements IStrategoTerm!
				}
				it.implementors();
			}
		}
		if ("org.strategoxt.lang.terms.StrategoString".equals(type))
		{
			return buildStrategoString(value);
		}
		else if ("org.strategoxt.lang.terms.StrategoInt".equals(type))
		{
			return buildStrategoInt(value);
		}
		else if ("org.strategoxt.lang.terms.StrategoReal".equals(type))
		{
			return buildStrategoReal(value);
		}
		else if ("org.strategoxt.lang.terms.StrategoTuple".equals(type))
		{
			return buildStrategoTuple(value);
		}
		else if ("org.strategoxt.lang.terms.StrategoList".equals(type))
		{
			return buildStrategoList(value);
		}
		else if ("org.strategoxt.lang.terms.StrategoAppl".equals(type))
		{
			return buildStrategoAppl(value);
		}
		// org.spoofax.interpreter.library.ssl.StrategoHashMap
		else
		{
			System.err.println("Missing type " + type);
			throw new RuntimeException("Missing type " + type);
		}
		//return null;
	}

	public IStrategoConstructor buildStrategoConstructor(Value value)
	{
        ObjectReference obj = (ObjectReference) value; // instance of org.strategoxt.lang.terms.StrategoConstructor
        ReferenceType refType = obj.referenceType(); // class org.strategoxt.lang.terms.StrategoConstructor
        
        Field nameField = refType.fieldByName("name");
        Value nameValue = obj.getValue(nameField); // String
        
        Field arityField = refType.fieldByName("arity");
        Value arityValue = obj.getValue(arityField); // int
        
		String name = "";
		int arity = -1;
		
		name = buildString(nameValue);
		arity = buildInt(arityValue);
		
		IStrategoConstructor strategoConstructor = f.makeConstructor(name, arity);
		return strategoConstructor;
	}
	
	/**
	 * The given IStrategoTerm should be a list, all items in the list are converted to a String[].
	 * @param term
	 * @return
	 */
	public String[] convertToStringArray(IStrategoTerm term)
	{
		if (term instanceof IStrategoList)
		{
			IStrategoList list = (IStrategoList) term;
			int size = list.size();
			String[] items = new String[size];
			for(int i = 0; i < size; i++)
			{
				items[i] = list.getSubterm(i).toString();
				//items[i] = list.get(i).toString();
			}
			return items;
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Converts a Collection<String> to a IStrategoList containing IStrategoString's.
	 * @param collection
	 * @return
	 */
	public IStrategoList convertToIStrategoList(Collection<String> collection)
	{
		TermFactory factory = new TermFactory();
		Collection<IStrategoTerm> terms = new ArrayList<IStrategoTerm>();
		for(String item : collection)
		{
			IStrategoTerm t = factory.makeString(item);
			terms.add(t);
		}
		IStrategoList list = f.makeList(terms);
		return list;
	}

}
