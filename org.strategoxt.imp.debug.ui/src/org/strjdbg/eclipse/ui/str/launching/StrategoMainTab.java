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
	 * Checkbox, true if the stratego program needs to be recompiled before every launch.
	 */
	private Button fProgramRecompile;
	
	/**
	 * The name of the Project the stratego program is in.
	 */
	private Text fProjectText;

	/**
	 * Browse button
	 */
	private Button fProgramButton;

	
	
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
		
		createProjectControl(font, comp);
		
		createVerticalSpacer(comp, 3);
		
		createProgramControl(font, comp);
		
		createVerticalSpacer(comp, 3);
		
		createArgumentsControl(font, comp);
		
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

	private void createArgumentsControl(Font font, Composite comp) {
		// arguments
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

	private void createProjectControl(Font font, Composite comp) {
		Label projectLabel = new Label(comp, SWT.NONE);
		projectLabel.setText("Project:");
		GridData gdProject= new GridData(GridData.BEGINNING);
		projectLabel.setLayoutData(gdProject);
		projectLabel.setFont(font);
		
		fProjectText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		
		gdProject = new GridData(GridData.FILL_HORIZONTAL);
		fProjectText.setLayoutData(gdProject);
		fProjectText.setFont(font);
		fProjectText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
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
			// eclipse project the stratego program is in
			String project = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROJECT, (String) null);
			if (project != null)
			{
				fProjectText.setText(project);
			}
			
			// stratego program
			String program = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, (String)null);
			if (program != null) {
				fProgramText.setText(program);
			}
			
			// stratego program arguments
			List argumentsList = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_ARGUMENTS, (List)null);
			if (argumentsList != null) {
				String flatString = CollectionUtils.join(argumentsList, Text.DELIMITER);
				fProgramArgumentsText.setText(flatString);
			}
			
			// recompile stratego program before each launch
			boolean recompileSelected = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_RECOMPILE, (boolean) true);
			fProgramRecompile.setSelection(recompileSelected);
			
		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
		}
	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// project name
		String project = fProjectText.getText().trim();
		if (project.length() == 0) {
			project = null;
		}
		configuration.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROJECT, project);
		
		// program location
		String program = fProgramText.getText().trim();
		if (program.length() == 0) {
			program = null;
		}
		configuration.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, program);
		
		// arguments
		String arguments = fProgramArgumentsText.getText().trim();
		if (arguments.length() == 0) {
			arguments = null;
		}
		String[] argumentsArray = new String[0];
		if (arguments != null)
		{
			argumentsArray = arguments.split(Text.DELIMITER);
		}
		List<String> argumentsList = Arrays.asList(argumentsArray);
		configuration.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_ARGUMENTS, argumentsList);
		
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
			IFile file = (IFile) files[0];
			fProgramText.setText(file.getFullPath().toString());
		}
		
	}

}
