package com;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==j) && (i%2==0) &&  (j%2==0))
             {
	           System.out.print( "1 ");
             }
				else if((i+j==6) && (i%2==0) && (j%2==0))
				{
					System.out.print("1 ");
				}	
				else if((i+j==4)||(i+j==8))
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("* ");
				}
			}	
				System.out.println();
				}
			}
}


