package javaIsFun;
import java.util.*;

class SubarraySum {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int s=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	       int flag=0;
	        for(int i=0;i<n;i++){
	            int sum=0;
	           for(int j=i;j<n;j++){
	               sum=sum+arr[j];
	               if(sum==s){
	                   i=i+1;
	                   j=j+1;
	                  System.out.println(i+" "+j);
	                  flag=1;
	                  break;
	               }
	           }
	           if(flag==1)
	           break;
	        }
	        if(flag==0){
	            System.out.println("-1");
	        }
	    }
	}
}