package com.demo;

public class Array_Demo {

	public static void single_D() {
		
		int a[] = {0,101,202,303,404,505};
		System.out.println("Any one of the array value");
		System.out.println(a[1]);
		System.out.println("-----------------------");
		
		System.out.println("For Loop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------------------------");
		
		System.out.println("ForEach or Enhanced Loop ");
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public static void double_D() {
		
		String b[][] = {
			
				{"Name","Age"},
				{"DOB","Address"},
				{"Phone","Mobile"},
				{"Id","Password"}
		};
		System.out.println("--------------------------");
		System.out.println("Any one of the array value");
		System.out.println(b[1][1]);
		System.out.println("-----------------------");
		
		System.out.println("Nested For Loop");
		System.out.println("--------------------------");
		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j < b.length-2; j++) {
				
				System.out.println(b[i][j]);
			}
		}
	}
	
	public static void main(String [] args) {
	
		single_D();
		double_D();
	}
}
