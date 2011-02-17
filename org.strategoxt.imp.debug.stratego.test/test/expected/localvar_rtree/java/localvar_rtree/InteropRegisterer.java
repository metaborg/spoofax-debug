package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("unused") public class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
{ 
  @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    register(context, compiledContext, context.getVarScope());
  }

  @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
  { 
    registerLazy(context, compiledContext, classLoader, context.getVarScope());
  }

  private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("localvar_rtree");
    localvar_rtree.init(compiledContext);
    varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
    varScope.addSVar("execute_0_0", new InteropSDefT(execute_0_0.instance, context));
    varScope.addSVar("match_comments_0_0", new InteropSDefT(match_comments_0_0.instance, context));
    varScope.addSVar("find_functions_0_0", new InteropSDefT(find_functions_0_0.instance, context));
    varScope.addSVar("find_comments_0_0", new InteropSDefT(find_comments_0_0.instance, context));
    varScope.addSVar("match_f_and_c_0_0", new InteropSDefT(match_f_and_c_0_0.instance, context));
    varScope.addSVar("try_find_comment_by_name_0_1", new InteropSDefT(try_find_comment_by_name_0_1.instance, context));
    varScope.addSVar("find_comment_match_0_1", new InteropSDefT(find_comment_match_0_1.instance, context));
    varScope.addSVar("get_function_name_0_0", new InteropSDefT(get_function_name_0_0.instance, context));
    varScope.addSVar("find_comment_by_name_0_1", new InteropSDefT(find_comment_by_name_0_1.instance, context));
    varScope.addSVar("is_empty_0_0", new InteropSDefT(is_empty_0_0.instance, context));
    varScope.addSVar("first_0_0", new InteropSDefT(first_0_0.instance, context));
    varScope.addSVar("build_c_0_0", new InteropSDefT(build_c_0_0.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("localvar_rtree");
    localvar_rtree.init(compiledContext);
    varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "localvar_rtree.main_0_0", context));
    varScope.addSVar("execute_0_0", new InteropSDefT(classLoader, "localvar_rtree.execute_0_0", context));
    varScope.addSVar("match_comments_0_0", new InteropSDefT(classLoader, "localvar_rtree.match_comments_0_0", context));
    varScope.addSVar("find_functions_0_0", new InteropSDefT(classLoader, "localvar_rtree.find_functions_0_0", context));
    varScope.addSVar("find_comments_0_0", new InteropSDefT(classLoader, "localvar_rtree.find_comments_0_0", context));
    varScope.addSVar("match_f_and_c_0_0", new InteropSDefT(classLoader, "localvar_rtree.match_f_and_c_0_0", context));
    varScope.addSVar("try_find_comment_by_name_0_1", new InteropSDefT(classLoader, "localvar_rtree.try_find_comment_by_name_0_1", context));
    varScope.addSVar("find_comment_match_0_1", new InteropSDefT(classLoader, "localvar_rtree.find_comment_match_0_1", context));
    varScope.addSVar("get_function_name_0_0", new InteropSDefT(classLoader, "localvar_rtree.get_function_name_0_0", context));
    varScope.addSVar("find_comment_by_name_0_1", new InteropSDefT(classLoader, "localvar_rtree.find_comment_by_name_0_1", context));
    varScope.addSVar("is_empty_0_0", new InteropSDefT(classLoader, "localvar_rtree.is_empty_0_0", context));
    varScope.addSVar("first_0_0", new InteropSDefT(classLoader, "localvar_rtree.first_0_0", context));
    varScope.addSVar("build_c_0_0", new InteropSDefT(classLoader, "localvar_rtree.build_c_0_0", context));
  }
}