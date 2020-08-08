package javaIsFun;
import java.util.*;

	class SubarraySum  {
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
		         int curr_sum = arr[0], start = 0, flag=0,i; 
	        for (i = 1; i <= n; i++) { 
	            while(curr_sum > sum ) { 
	                curr_sum = curr_sum - arr[start]; 
	                start++; 
	            } 
	            if (curr_sum == sum) { 
	                int p = i;
	                start+=1;
	                flag=1;
	                System.out.println(start + " " + p); 
	                break; 
	            } 
	            if (i < n) 
	                curr_sum = curr_sum + arr[i]; 
	        }
	        if(flag==0)
	            System.out.println("-1");
		    }
		}
	}
}