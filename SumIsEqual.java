package com.java.arraybasics;

import java.util.Scanner;

public class SumIsEqual {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		int specifiedNumber=6;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]+a[j]==specifiedNumber) {
					System.out.println(a[i]+" + "+a[j]+" = "+specifiedNumber);
				}
			}
		}
	}

}
