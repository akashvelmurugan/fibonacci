package com.fibonacci;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//int number=scanner.nextInt();
		
		for (int i = 1; i < 10; i++) {
			int counter =0;
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					counter++;
				}
			}
			if (counter == 0) {
				System.out.println(i);
			}
		}
		
		boolean condition = true;
		int array[]= new int[10];
		
		while (condition) {
			
			
		}
		
	}
}



























