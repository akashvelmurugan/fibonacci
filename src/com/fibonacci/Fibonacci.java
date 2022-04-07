package com.fibonacci;

import java.util.LinkedList;

public class Fibonacci {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		int firstValue = 0;
		int secondValue = 1;
		int result = 0;

		while(linkedList.size()<10) {
			result=firstValue+secondValue;
			int counter = 0;
			for (int j = 2; j < result; j++) {
				if(result%j==0) {
					counter ++;
				}
			}
			if (counter==0) {
				linkedList.add(result);
			}
			firstValue = secondValue;
			secondValue = result;
		}
		System.out.println(linkedList);
	}
}



















