package com.niit.upload;
import java.io.*;
import java.util.Scanner;
public class Upload {
	
	
	    public static void main(String[]args) throws IOException
	    {
	        int length,number, i, j = 0;
	        int arr[][] = new int[2][2];
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the length ");
	        length = scan.nextInt();
	     do{
	        	System.out.println("Enter number of photos to upload");
		        number = scan.nextInt();
		        System.out.println("Enter the dimension");
	        for(i =0;i<2;i++){
	            for(j=0;j<2;j++){
	            	 
	                arr[i][j] = scan.nextInt();
	                if(arr[i][j]<length)
	   	    	 {
	   	    		 System.out.println("Upload another"+arr[i][j]); 
	   	    	 }
	                else if(arr[i][j]==length)
	                {
		   	    		 System.out.println("Accepted"+arr[i][j]); 
		   	    	 }	
	                else if(arr[i][j]>length)
	                {
		   	    		 System.out.print	("Crop it"+arr[i][j]); 
		   	    	 }	
	            }
	        }
	        
	        
	    }while(((number<3)&&(number>0)));
	     scan.close();
	}
}

