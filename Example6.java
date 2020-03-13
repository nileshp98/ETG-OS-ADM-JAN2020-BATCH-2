package com.sonata;

public class Example6 {

	public static void main(String[] args) {
			int a[]= {10,20,30,40,50};
			int j=a.length;
			int rev[]=new int[a.length];
			for(int i=0;i<a.length;i++)
			{
				rev[j-1]=a[i];
				j--;
			}
			for(int x:rev)
				System.out.println(x);
	}

}
