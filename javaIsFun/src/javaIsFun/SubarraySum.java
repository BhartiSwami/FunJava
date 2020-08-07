package javaIsFun;
import java.util.*;


class SubarraySum {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int sum=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        int flag=0;
	        int l=0;
	        int r=0;
	        int current_sum=arr[0];
	        while(l<n && r<n){
	            if(current_sum==sum){
	                flag=1;
	                l+=1;
	                r+=1;
	                System.out.println(l+" "+r);
	                break;
	            }
	            if(current_sum<sum){
	                if(r<n-1){
	                current_sum+=arr[++r];
	                }
	            }
	            if(current_sum>sum){
	                current_sum-=arr[l++];
	            }
	        }
	        if(flag==0){
	            System.out.println("-1");
	        }
	    }
	}
}