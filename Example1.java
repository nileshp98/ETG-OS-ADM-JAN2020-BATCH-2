package com.sonata;

public class Example1 {

	public static void main(String[] args) {
		int a[]= {12,25,89};
		int max=a[0];
		for (int i=0;i<a.length-1;i++)
		{
			if (a[i]<a[i+1])
				max=a[i+1];
			else
				max=a[i];
			
		}
		System.out.println("Maximum number is:"+max);
	}

}
