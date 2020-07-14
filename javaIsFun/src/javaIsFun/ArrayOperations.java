package javaIsFun;
import java.util.*;

public class ArrayOperations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
//			InsertElement(arr,n);
//			DeleteElement(arr,n);
//			LinearSearch(arr,n);
			BinarySearch(arr,n);
		}
	}
	static void InsertElement(int arr[],int n) {
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
		int ele=sc.nextInt();
		if(pos<0 || pos>n) {
			System.out.println("Kindly give a valid input");
		}
		else {
		int arr1[]=new int[n+1];
		for(int i=0;i<n;i++) {
			arr1[i]=arr[i];
		}
		for(int i=n-1;i>=pos;i--) {
			arr1[i+1]=arr1[i];
		}
		arr1[pos]=ele;
		print(arr1);
		}
		
	}
	static void DeleteElement(int arr[],int n) {
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
		if(pos<0 || pos>n-1) {
			System.out.println("Kindly Give a valid Input!");
		}
		else {
		for(int i=pos;i<n-1;i++){
			arr[i]=arr[i+1];
		}
		n--;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		}
	}
	static void LinearSearch(int arr[],int n) {
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		int found=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				System.out.println(ele+" "+"Found at index"+" "+ i);
				found=1;
			}
		}
		if(found==0) {
			System.out.println("Element not found!");
		}
	}
	static void BinarySearch(int arr[],int n) {
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		int start=0;
		int end=n-1;		
		int found=0;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==ele) {
				found=1;
				break;
			}
			else if(ele>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		if(found==1)
			System.out.println("Element Found!");
		else
			System.out.println("Element Not Found!");
	}
	static void Sort(int arr[],int n) {
		
	}
	static void BubbleSort(int arr[],int n) {
		
	}
	static void SelectionSort(int arr[],int n) {
		
	}
	static void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
