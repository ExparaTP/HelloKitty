package com.expara.hellokitty;

import java.util.Scanner;

public class HelloKitty {
	public static void main (String[] args) {
		String s;

		//Prints "Hello Kitty" in the terminal window.
		System.out.println("Hello Kitty");
		
		//Input the animal
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Animal");
		s = in.nextLine();
		System.out.println("Hello " +s);

	}
}
