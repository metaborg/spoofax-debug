package dynamic;

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
    compiledContext.registerComponent("dynamic");
    dynamic.init(compiledContext);
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
    varScope.addSVar("get_current_name_0_0", new InteropSDefT(get_current_name_0_0.instance, context));
    varScope.addSVar("aux_get_current_name_0_2", new InteropSDefT(aux_get_current_name_0_2.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("dynamic");
    dynamic.init(compiledContext);
    varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "dynamic.main_0_0", context));
    varScope.addSVar("execute_0_0", new InteropSDefT(classLoader, "dynamic.execute_0_0", context));
    varScope.addSVar("match_comments_0_0", new InteropSDefT(classLoader, "dynamic.match_comments_0_0", context));
    varScope.addSVar("find_functions_0_0", new InteropSDefT(classLoader, "dynamic.find_functions_0_0", context));
    varScope.addSVar("find_comments_0_0", new InteropSDefT(classLoader, "dynamic.find_comments_0_0", context));
    varScope.addSVar("match_f_and_c_0_0", new InteropSDefT(classLoader, "dynamic.match_f_and_c_0_0", context));
    varScope.addSVar("try_find_comment_by_name_0_1", new InteropSDefT(classLoader, "dynamic.try_find_comment_by_name_0_1", context));
    varScope.addSVar("find_comment_match_0_1", new InteropSDefT(classLoader, "dynamic.find_comment_match_0_1", context));
    varScope.addSVar("get_function_name_0_0", new InteropSDefT(classLoader, "dynamic.get_function_name_0_0", context));
    varScope.addSVar("find_comment_by_name_0_1", new InteropSDefT(classLoader, "dynamic.find_comment_by_name_0_1", context));
    varScope.addSVar("is_empty_0_0", new InteropSDefT(classLoader, "dynamic.is_empty_0_0", context));
    varScope.addSVar("first_0_0", new InteropSDefT(classLoader, "dynamic.first_0_0", context));
    varScope.addSVar("build_c_0_0", new InteropSDefT(classLoader, "dynamic.build_c_0_0", context));
    varScope.addSVar("get_current_name_0_0", new InteropSDefT(classLoader, "dynamic.get_current_name_0_0", context));
    varScope.addSVar("aux_get_current_name_0_2", new InteropSDefT(classLoader, "dynamic.aux_get_current_name_0_2", context));
  }
}