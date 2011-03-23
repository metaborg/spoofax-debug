package org.strategoxt.imp.debug.ui.str.launching;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;

public class HybridInterpreterTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public HybridInterpreterTabGroup() {
		// TODO Auto-generated constructor stub
	}

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[] {
				//new StrategoMainTab(), // TODO: implement HybridInterpreter tab
				new SourceLookupTab(), // was sourcelookuptab
				new CommonTab()
		});
	}

}
