package com.aspire.java.methods;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class NonStaticMethodsSameClass 
{
	public static void main(String[]args)
	{
		System.out.println("Main method starts");
		NonstaticMethodSameClass object=new NonStaticMethodSameclass();
		
		object.method11();
		object.method12();
		object.method12();
		
		System.out.println("Main method ends");
		
		
		
		
	}

}
