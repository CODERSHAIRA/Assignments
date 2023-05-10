package com.java.assignments;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]= new int[N];
		for(int i=0; i<N; i++) {
			
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<N; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		int k=0;
		int m=N-1;
		int max=arr[m];
		int min=arr[k];
		for(int i=0; i<N; i++) {
			if(i%2==0) {
				System.out.print(max +" ");
				max=arr[m-1];
				m--;
			}
			else {
				System.out.print(min +" ");
				min=arr[k+1];
				k++;
			}
		}
		sc.close();
	}

}
