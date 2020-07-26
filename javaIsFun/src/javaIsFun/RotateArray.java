package javaIsFun;

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    Rotate(arr,k,n);
		}
	}
    static void Rotate(int arr[],int d,int n){
        d=d%n;
        int k,j,temp;
        int gcd=GCD(d,n);
        for(int i=0;i<gcd;i++){
            temp=arr[i];
            j=i;
            while(true){
                k=j+d;
                if(k>=n){
                k=k-n;}
                if(k==i)
                break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
        pprint(arr,n);
    }
    static void pprint(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    static int GCD(int a,int b){
        if(b==0)
        return a;
        return GCD(b,a%b);
    }
    
}