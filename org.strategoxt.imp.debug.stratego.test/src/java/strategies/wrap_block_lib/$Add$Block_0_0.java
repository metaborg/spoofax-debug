package strategies.wrap_block_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") public class $Add$Block_0_0 extends Strategy 
{ 
  public static $Add$Block_0_0 instance = new $Add$Block_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2:
    { 
      IStrategoTerm a_0 = null;
      IStrategoTerm b_0 = null;
      if(term.getTermType() != IStrategoTerm.APPL || wrap_block._consIf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2;
      a_0 = term.getSubterm(0);
      b_0 = term.getSubterm(1);
      term = termFactory.makeAppl(wrap_block._consIf_2, new IStrategoTerm[]{a_0, termFactory.makeAppl(wrap_block._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(b_0, (IStrategoList)wrap_block_lib.constNil0)})});
      if(true)
        return term;
    }
    context.push("AddBlock_0_0");
    context.popOnFailure();
    return null;
  }
}