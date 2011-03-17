/*******************************************************************************
 *  Copyright (c) 2000, 2007 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.debug.testplugin;

import org.eclipse.debug.core.DebugEvent;

/**
 * Wait for the specified event with the specified from the specified element.
 */
@SuppressWarnings("rawtypes")
public class DebugElementKindEventDetailWaiter extends DebugElementKindEventWaiter {

	protected int fDetail;

	/**
	 * Constructor
	 * @param eventKind
	 * @param elementClass
	 * @param detail
	 */
	public DebugElementKindEventDetailWaiter(int eventKind, Class elementClass, int detail) {
		super(eventKind, elementClass);
		fDetail = detail;
	}
	
	/**
	 * @see org.eclipse.jdt.debug.testplugin.DebugElementKindEventWaiter#accept(org.eclipse.debug.core.DebugEvent)
	 */
	public boolean accept(DebugEvent event) {
		return super.accept(event) && fDetail == event.getDetail();
	}
	
}
