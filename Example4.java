package com.sonata;

public class Example4 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for( int x : a)
		{
			sum+=x;
		}
		System.out.println(sum);
	}

}
