package test;

import java.util.*;
public class Assign2
{
    public static void main(String[] args)
    {   
     try (Scanner sc = new Scanner(System.in))
    	        { int n= sc.nextInt();
    	            int d=1;
    	            for(int i=1;i<=n;i++)
    	            {
    	                for(int j=1;j<=i;j++)
    	                {
    	                    System.out.print(d+++"  ");
    	                }
    	                System.out.println();
    	            }
    	        }
    	    }
    	}
