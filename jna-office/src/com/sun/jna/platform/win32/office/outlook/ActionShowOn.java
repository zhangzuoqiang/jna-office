/* Copyright (c) 2013 Ian Darby, All Rights Reserved
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.  
 */

package com.sun.jna.platform.win32.office.outlook;

/**
 * Identifies where an Action is displayed as an available action. Type-safe
 * representation of the Outlook model olActionShowOn enum.
 * 
 * @author Ian Darby
 * 
 * @see {@link Action}
 * @see {@link AbstractEnum}
 */
public class ActionShowOn extends AbstractEnum {
	
	/**
	 * Indicates that the action will not be displayed on the menu or toolbar.
	 */
	public final static ActionShowOn	olDontShow		= new ActionShowOn(0, "olDontShow");  
	
	/**
	 * Indicates that the action will be displayed as an available action on the
	 * menu.
	 */
	public final static ActionShowOn	olMenu			= new ActionShowOn(1, "olMenu");  
	
	/**
	 * Indicates that the action will be displayed as an available action on the
	 * menu and the toolbar.
	 */
	public final static ActionShowOn	olMenuAndToolbar = new ActionShowOn(2, "olMenuAndToolbar");  

	/**
	 * One and only constructor. Scope is private to prevent the creation of
	 * anything other than the built-in constant instances.
	 * 
	 * @param typ
	 *            numeric value used to represent the enum in external storage.
	 * 
	 * @param name
	 *            constant name given to the enum.
	 * 
	 * @see {@link Action}
	 */
	private ActionShowOn(int typ, String name) {
		super((short) typ, name);
	}

	/**
	 * Converts an external storage numeric representation in to one of the
	 * built-in constant objects. Unrecognised external values cause a
	 * {@link RuntimeException} to be thrown.
	 * 
	 * @param style
	 *            external numeric representation.
	 * 
	 * @return one of the built-in constant objects that represents the enum in
	 *         a type-safe way.
	 */
	public static ActionShowOn parse(short style) {
		
		switch(style) {
		
		case 0:
			return olDontShow;
			
		case 1:
			return olMenu;
		
		case 2:
			return olMenuAndToolbar;
			
		default:
			throw new RuntimeException("ActionShowOn Enum: " + style + " not recognised.");
		}
	}
}
