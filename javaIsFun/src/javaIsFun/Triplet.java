package javaIsFun;

import java.util.*;
import java.lang.*;
import java.io.*;

class Triplet  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=0,flag=0;
            for(int i=0;i<n-2;i++) {
            	for(int j=i+1;j<n-1;j++) {
            		for(int k=j+1;k<n;k++) {
            			if(arr[i]+arr[j]==arr[k]) {
            				flag=1;
            				count++;
            			}
            		}
            	}
            }
            if(flag==0)
            System.out.println("-1");
            else
            System.out.println(count);
        }
    }
}