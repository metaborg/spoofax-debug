package org.strategoxt.imp.debug.stratego.runtime;

import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.services.MetaFileLanguageValidator;

public class StrjdbgruntimelibValidator extends MetaFileLanguageValidator 
{ 
  @Override public Descriptor getDescriptor()
  { 
    return StrjdbgruntimelibParseController.getDescriptor();
  }
}