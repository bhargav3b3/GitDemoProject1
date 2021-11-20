package com.FirstGitHubProj.group1;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the 2 number to add");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("the sum of two number is: "+(a+b));
	sc.close();

	}

}
