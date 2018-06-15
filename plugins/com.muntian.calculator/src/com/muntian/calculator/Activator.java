package com.muntian.calculator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.muntian.calculator.ui.MainPanel;

public class Activator implements BundleActivator {

	private static final String TITLE_OF_APP = "SWT Calculator";

	private static Display display;
	private static Shell shell;

	static {
		display = new Display();
		shell = new Shell(display, SWT.CLOSE | SWT.TITLE | SWT.MIN);
	}

	@Override
	public void start(BundleContext context) throws Exception {
		shell.setText(TITLE_OF_APP);

		GridLayout gridLayout = new GridLayout();
		shell.setLayout(gridLayout);

		MainPanel mainPanel = MainPanel.getInstance();

		shell.setLocation(750, 200);
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}
	
	public static Shell getShell() {
		return shell;
	}

}
