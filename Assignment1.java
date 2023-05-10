package com.java.assignments;

public class Assignment1 {

	public static void main(String[] args) {

		int a = 1;

        int b=1;

        for (int i = 1; i <= 10; i++) 

       {

           if(i%2==0){

               b=a+i-1;

               for (int j = 1; j <= i; j++)

               {

                   System.out.print(b+" ");

                   b--;

                   a++;

               }

           }

           else{

               b=a;

               for (int j = 1; j <= i; j++)

               {

                   System.out.print(b+" ");

                   b++;

                   a++;

               }

           }

           System.out.println();

       }

		
	}

}
