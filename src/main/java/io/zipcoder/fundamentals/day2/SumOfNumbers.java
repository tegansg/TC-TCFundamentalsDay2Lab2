package io.zipcoder.fundamentals.day2;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args){
    	
    	SumOfNumbers sumOfNumbers = new SumOfNumbers();
    	sumOfNumbers.askForNumber();

    }
    
    public void askForNumber(){
    	SumOfNumbers sumOfNumbers = new SumOfNumbers();
    	
    	Scanner in = new Scanner(System.in);
    	System.out.print("Pick a number...");
    	
    	try 
    	{
        	int num = in.nextInt();
        	int sumOfNum = sumOfNumbers.sumUpToNumber(num);
    		String output = String.format("Sum of one to %d is %d", num, sumOfNum);
        	System.out.print(output);
   
    	} catch(Exception e) {
    		System.out.print("That's not a number silly.");
    	}
    		
    	
    	in.close();      
    	
    }
    
    private Integer sumUpToNumber(int n)
    {
    	int sumOfNum = 0;
    	
    	for(int i=1; i<=n; i++)
    	{
    		sumOfNum += i;
    	}
    	return sumOfNum;
    }
}
