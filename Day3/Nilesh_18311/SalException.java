package com.sonata.Assign3;

public class SalException {
	
	public static void main(String []args) throws CustomException
	{
		double sal=15000;
		if(12*sal<100000)
		{
			

			throw new CustomException("Salary is less than 100000");
		}
		else
		{
			System.out.println("Salary is good");
		}
	}

}
