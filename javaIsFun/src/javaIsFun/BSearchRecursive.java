package javaIsFun;
import java.util.*;

public class BSearchRecursive {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			int start=0;
			int end=n-1;
			BSearch(arr,k,start,end);
		}
	}
	static void BSearch(int arr[], int k,int start,int end) {
		int found=0;
		while(start<=end) {
		int mid=(start+end)/2;
		if(arr[mid]==k) {
			found=1;
			System.out.println("Element Found!");
			return;
			}
		else if(arr[mid]>k)
		{
			end=mid-1;
		}
		else {
			start=mid+1;
		}
		}
		if(found==0) {
			System.out.println("Element NOT Found");
		}
	}
	
}
