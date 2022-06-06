package com.aspire.java.methods;

   import com.aspire.java.DifferentPackMethods.diffPackStaticMethod;
public class StaticMethodFromSameClass
{
	public static void main(String[]args)
	{
		System.out.println("Main method starts");
		method2();
		method1();
		method2();
		
		
		DifferentClass.method3();
		DifferentClass.method2();
		DifferentClass.method4();
		DifferentClass.method3();
		
		
		DiffPackstaticMethod.method5();
		DiffPackstaticMethod.method6();
		DiffPackstaticMethod.method2();
		DiffPackstaticMethod.method5();
		
		System.out.println("Main method ends");
	}
	public static void method1()
	{
		System.out.println("Running static method-1 from same class");
	}
	public static void method2()
	{
		System.out.println("Running static method-2 from same class");
	}

}
