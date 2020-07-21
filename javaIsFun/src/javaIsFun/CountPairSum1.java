package javaIsFun;

import java.util.*;
import java.lang.*;
import java.io.*;

//O(m*n);

class CountPairSum1{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int arr1[]=new int[m];
		    int arr2[]=new int[n];
		    for(int i=0;i<m;i++){
		        arr1[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        arr2[i]=sc.nextInt();
		    }
		    int k=sc.nextInt();
		    int count=0;
		    for(int i=0;i<m;i++){
		        for(int j=0;j<n;j++){
		            if(arr1[i]+arr2[j]==k)
		                count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}