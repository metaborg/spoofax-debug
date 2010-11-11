package strategies.wrap_block_pp_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

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
    compiledContext.registerComponent("wrap_block_pp_lib");
    wrap_block_pp_lib.init(compiledContext);
    varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
    varScope.addSVar("add_block_0_0", new InteropSDefT(add_block_0_0.instance, context));
    varScope.addSVar("AddBlock_0_0", new InteropSDefT($Add$Block_0_0.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("wrap_block_pp_lib");
    wrap_block_pp_lib.init(compiledContext);
    varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "strategies.wrap_block_pp_lib.main_0_0", context));
    varScope.addSVar("add_block_0_0", new InteropSDefT(classLoader, "strategies.wrap_block_pp_lib.add_block_0_0", context));
    varScope.addSVar("AddBlock_0_0", new InteropSDefT(classLoader, "strategies.wrap_block_pp_lib.$Add$Block_0_0", context));
  }
}