package com.pojo;

public class Pojo_B {

	public static void main(String[]args) 
	{
		Pojo_A p =new Pojo_A();
		
		String name= p.getName();
		
		System.out.println("Before getter:" +name);
		
		p.setName("James");
		
		String name2 = p.getName();
		
		System.out.println("After Setters:" +name2);
		
	}
}
