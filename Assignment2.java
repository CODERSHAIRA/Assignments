package com.java.assignments;

public class Assignment2 {

	public static void main(String[] args) {

		for(int i=5; i>=0; i--) {
			for(int k=0; k<5-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				if(i%2==0 && j%2==0) {
					System.out.print("$ ");
				}
				else if(i%2==0 && j%2!=0) {
					System.out.print("% ");
				}
				else if(i%2!=0 && j%2==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		
	}

}
