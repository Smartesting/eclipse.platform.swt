/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.examples.browser.demos.views;

import org.eclipse.ui.part.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.action.*;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;

public class BrowserDemoView extends ViewPart {
	Action pawnAction;
	Action editAction;
	Composite parent;
	
	public BrowserDemoView() {
	}
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayout(new FillLayout());
		TabFolder folder = new TabFolder(parent, SWT.NONE);
		TabItem item = new TabItem(folder, SWT.NONE);
		PawnTab pawnTab = new PawnTab(item);
		
		item = new TabItem(folder, SWT.NONE);
		EditorTab editorTab = new EditorTab(item);
	}
	
	private void showMessage(String message) {
		MessageDialog.openInformation(
			parent.getShell(),
			"Browser Demo",
			message);
	}
	public void setFocus() {
	}
	

}