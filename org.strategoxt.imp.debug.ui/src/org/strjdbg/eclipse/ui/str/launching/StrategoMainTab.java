package org.strjdbg.eclipse.ui.str.launching;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.strjdbg.eclipse.core.str.launching.CollectionUtils;
import org.strjdbg.eclipse.core.str.launching.IStrategoConstants;

public class StrategoMainTab extends AbstractLaunchConfigurationTab {

	
	/**
	 * The location of the Stratego program
	 */
	private Text fProgramText;
	
	/**
	 * The arguments for the Stratego program
	 */
	private Text fProgramArgumentsText;  // multi-line textbox, every argument should be placed on a line
	
	/**
	 * The extra arguments used when compiling the Stratego program (for example "-I" specifications)
	 */
	private Text fCompileArgumentsText; // multi-line textbox, every argument should be placed on a line
	
	/**
	 * Checkbox, true if the stratego program needs to be recompiled before every launch.
	 */
	private Button fProgramRecompile;

	/**
	 * Browse button
	 */
	private Button fProgramButton;

	
	/*
	 * GUI: 
	Program arguments:	| multiline textbox			|
	Compile arguments:	| multiline textbox			|
	CB Re-compile before each run
	 */
	
	
	/**
	 * Creates the top level control for this launch configuration tab under the given parent composite. 
	 * This method is called once on tab creation, after setLaunchConfigurationDialog  is called. 
	 */
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		GridLayout topLayout = new GridLayout();
		topLayout.verticalSpacing = 0;
		topLayout.numColumns = 3;
		comp.setLayout(topLayout);
		comp.setFont(font);
		
		createVerticalSpacer(comp, 3);
		
		createProgramControl(font, comp);
		
		createVerticalSpacer(comp, 3);
		
		createArgumentsControl(font, comp);
		
		createVerticalSpacer(comp, 3);

		createCompileArgumentsControl(font, comp);
		
		createVerticalSpacer(comp, 3);

		createRecompileControl(comp);

	}

	private void createRecompileControl(Composite comp) {
		// compile
		fProgramRecompile = new Button(comp, SWT.CHECK);
		fProgramRecompile.setText("Re-compile before each run");
		GridData gdRecompile = new GridData(GridData.BEGINNING);
		gdRecompile.horizontalSpan = 3;
		fProgramRecompile.setLayoutData(gdRecompile);
		fProgramRecompile.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				//boolean isSelected = recompileButton.getSelection();
				updateLaunchConfigurationDialog();
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	private void createCompileArgumentsControl(Font font, Composite comp)
	{
		Label compileArgumentsLabel = new Label(comp, SWT.NONE);
		compileArgumentsLabel.setText("Compile arguments:");
		GridData gdArg = new GridData(GridData.BEGINNING);
		compileArgumentsLabel.setLayoutData(gdArg);
		compileArgumentsLabel.setFont(font);
		
		fCompileArgumentsText = new Text(comp, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL); // a multi line text box, every argument should be placed on its own line
		gdArg = new GridData(GridData.FILL_HORIZONTAL);
		gdArg.horizontalSpan = 2;
		gdArg.verticalSpan = 5;
		fCompileArgumentsText.setLayoutData(gdArg);
		fCompileArgumentsText.setFont(font);
		fCompileArgumentsText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
	}

	private void createArgumentsControl(Font font, Composite comp) {
		// runtime arguments
		Label programArgumentsLabel = new Label(comp, SWT.NONE);
		programArgumentsLabel.setText("Program arguments:");
		GridData gdArg = new GridData(GridData.BEGINNING);
		programArgumentsLabel.setLayoutData(gdArg);
		programArgumentsLabel.setFont(font);
		
		fProgramArgumentsText = new Text(comp, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL); // a multi line text box, every argument should be placed on its own line
		gdArg = new GridData(GridData.FILL_HORIZONTAL);
		gdArg.horizontalSpan = 2;
		gdArg.verticalSpan = 5;
		fProgramArgumentsText.setLayoutData(gdArg);
		fProgramArgumentsText.setFont(font);
		fProgramArgumentsText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
	}

	private void createProgramControl(Font font, Composite comp) {
		// program location
		Label programLabel = new Label(comp, SWT.NONE);
		programLabel.setText("&Program:");
		GridData gdProg = new GridData(GridData.BEGINNING);
		programLabel.setLayoutData(gdProg);
		programLabel.setFont(font);
		
		fProgramText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		
		gdProg = new GridData(GridData.FILL_HORIZONTAL);
		fProgramText.setLayoutData(gdProg);
		fProgramText.setFont(font);
		fProgramText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		
		// browse button
		fProgramButton = createPushButton(comp, "&Browse...", null); //$NON-NLS-1$
		fProgramButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				browseStrategoFiles();
			}
		});
	}

	public String getName() {
		return "Main";
	}

	/**
	 * Initialize the SWT components on the Tab using the launch configuration.
	 */
	@SuppressWarnings("unchecked")
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
		
			// stratego program
			String program = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, (String)null);
			if (program != null) {
				fProgramText.setText(program);
			}
			
			// stratego program arguments
			List runtimeArgumentsList = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_ARGUMENTS, (List)null);
			if (runtimeArgumentsList != null) {
				String flatString = CollectionUtils.join(runtimeArgumentsList, Text.DELIMITER);
				fProgramArgumentsText.setText(flatString);
			}
			
			// compile stratego program arguments
			List compileArgumentsList = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_COMPILE_ARGUMENTS, (List)null);
			if (compileArgumentsList != null) {
				String flatString = CollectionUtils.join(compileArgumentsList, Text.DELIMITER);
				fCompileArgumentsText.setText(flatString);
			}
			
			// recompile stratego program before each launch
			boolean recompileSelected = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_RECOMPILE, (boolean) true);
			fProgramRecompile.setSelection(recompileSelected);
			
		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
		}
	}

	/**
	 * Apply the configuration changes.
	 */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
	
		// program location
		String program = fProgramText.getText().trim();
		if (program.length() == 0) {
			program = null;
		}
		configuration.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, program);
		
		// runtime arguments
		String runtimeArguments = fProgramArgumentsText.getText().trim();
		if (runtimeArguments.length() == 0) {
			runtimeArguments = null;
		}
		String[] runtimeArgumentsArray = new String[0];
		if (runtimeArguments != null)
		{
			runtimeArgumentsArray = runtimeArguments.split(Text.DELIMITER);
		}
		List<String> runtimeArgumentsList = Arrays.asList(runtimeArgumentsArray);
		configuration.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_ARGUMENTS, runtimeArgumentsList);
		
		// runtime arguments
		String compileArguments = fCompileArgumentsText.getText().trim();
		if (compileArguments.length() == 0) {
			compileArguments = null;
		}
		String[] compileArgumentsArray = new String[0];
		if (compileArguments != null)
		{
			compileArgumentsArray = compileArguments.split(Text.DELIMITER);
		}
		List<String> compileArgumentsList = Arrays.asList(compileArgumentsArray);
		configuration.setAttribute(IStrategoConstants.ATTR_STRATEGO_COMPILE_ARGUMENTS, compileArgumentsList);
		
		// recompile
		boolean reCompileSelected = fProgramRecompile.getSelection();
		configuration.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_RECOMPILE, reCompileSelected);
	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {		
	}
	
	/**
	 * Open a resource chooser to select a PDA program 
	 */
	protected void browseStrategoFiles() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		dialog.setTitle("Stratego Program");
		dialog.setMessage("Select Stratego Program");
		// TODO: single select
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			if (files != null && files.length > 0)
			{
				IFile file = (IFile) files[0];
				fProgramText.setText(file.getFullPath().toString());
			}

		}
		
	}
	


}
