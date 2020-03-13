package com.sonata;

public class Example5 {

	public static void main(String[] args) {
		int arr[]= {10,15,20,25,30};
		for (int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==25)
			{
				System.out.println("Number found");
				System.exit(0);
			}
		}
		System.out.println("Number not found");
	}

}
