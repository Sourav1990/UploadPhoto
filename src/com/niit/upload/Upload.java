package com.niit.upload;
import java.io.*;
import java.util.Scanner;
public class Upload {
	
	
	    public static void main(String[]args) throws IOException
	    {
	        int length,number, i, j ;
	        
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the length ");
	        length = scan.nextInt();
	        
	        
	     do{
	    	 System.out.println("Enter the number of photos to upload ");
		        number=scan.nextInt();	
		        
		        for(int h=1;h<=number;h++)
		           {
		        	System.out.println("Enter the length and breadth");
		        i=scan.nextInt();
		        j=scan.nextInt();
	    	if((i<length || j<length) ||(i<length && j<length))
	    		System.out.println("Upload another");
	    	else if((i>length || j>length) ||(i>length && j>length))
	    		System.out.println("Crop it");
	    	else if((i==length && j==length))
	    		System.out.println("Accepted");
	    	else
	    		System.out.println("Out of Range");
		           }scan.close();
	}while(!((number<10)&&(number>0)));
} 
}

