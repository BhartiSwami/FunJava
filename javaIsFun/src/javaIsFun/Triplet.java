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
            for(int i=n-1;i>=0;i--){
                int l=0;
                int r=i-1;
                while(l<r){
                    if(arr[i]==arr[l]+arr[r]){
                        count++;
                        flag=1;
                        l++;
                        r--;
                    }
                    else if(arr[i]>arr[l]+arr[r]){
                        l++;
                    }
                    else{
                        r--;
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