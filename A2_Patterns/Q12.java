package test;

import java.util.*;
public class Assign2
{
    public static void main(String[] args)
    {   
    	Scanner sc = new Scanner(System.in);
    	 int n= sc.nextInt();
         int a=0;
         int b=1;
         int c=0;
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(c+" ");
                 c=a+b;
                 a=b;
                 b=c;
             }
             System.out.println();
         }
     }
 }

    	
