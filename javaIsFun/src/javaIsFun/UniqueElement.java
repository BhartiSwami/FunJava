package javaIsFun;
import java.util.*;
import java.lang.*;
import java.io.*;

class UniqueElement {
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
		    for(int i=0;i<n;i++){
		        int count=0;
		        for(int j=0;j<n;j++){
		            if(arr[i]==arr[j]){
		                count++;
		            }
		        }
		        if(count!=k ||count==0){
		            System.out.println(arr[i]);
		            break;
		        }
		    }
		}
	}
}