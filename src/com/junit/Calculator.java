package com.junit;

public class Calculator {
	public double addition(double operand_1,double operand_2)
	{
		
		return operand_1+operand_2; /* calculating the addition of two numbers */
	}
	public  double multiplication(double operand_1,double operand_2)
	{
		return operand_1*operand_2; /* calculating the Multiplication of two numbers */
	}
	public  double division(double operand_1,double operand_2)
	{
		if(operand_2==0)
		{
			/* throwing an error statement when operand_2 is zero */
			throw new IllegalArgumentException("Number cannot be divided by 0");
		}
		else
			return operand_1/operand_2; /* calculating the Division of two numbers */
	
	}
	
	

}
