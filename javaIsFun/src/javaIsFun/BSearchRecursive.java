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
			
			BSearch(arr,n);
		}
	}
	static void BSearch(int arr[], int n) {
		int k=sc.nextInt();
		int start=0;
		int end=n-1;
		if(BSAlgo(arr,k,start,end)) 
			System.out.println("Element Found!");
		else
			System.out.println("Element NOT Found!");
		
	}
	static boolean BSAlgo(int arr[],int k,int start,int end) {
		while(start<end) {
		int mid=(start+end)/2;
		if(arr[mid]==k) {
			return true;
		}
		else if(k>arr[mid]) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}
	}
		return false;
	}
}
