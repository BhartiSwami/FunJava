package javaIsFun;

import java.util.*;
import java.lang.*;
import java.io.*;

class Chocolate {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int min=Integer.MAX_VALUE;
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]<min)
		            min=arr[i];
		    }
		    System.out.println(min);
		}
	}
}