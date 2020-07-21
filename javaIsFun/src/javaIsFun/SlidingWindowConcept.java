package javaIsFun;
import java.util.*;

//CODE FOR FINDING MAXIMUM SUM OF SUBARRAY OK SIZE K

public class SlidingWindowConcept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<k;i++) {
				sum=sum+arr[i];
			}
			int max=sum;
			for(int i=0;i<n-k;i++) {
				sum=sum-arr[i]+arr[i+k];
				if(sum>max)
					max=sum;
			}
			System.out.println(max);
		}
	}
}
