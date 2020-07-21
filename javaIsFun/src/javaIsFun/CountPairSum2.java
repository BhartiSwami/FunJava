package javaIsFun;

import java.util.*;
import java.lang.*;
import java.io.*;



class CountPairSum2 {
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
		    int l=0,r=n-1,count=0;
		    while(l<m && r>=0){
		        if(arr1[l]+arr2[r]==k){
		            count++;
		            l++;
		            r--;
		        }
		        else if(arr1[l]+arr2[r]>k){
		            r--;
		        }
		        else
		            l++;
		    }
		    System.out.println(count);
		}
	}
}
