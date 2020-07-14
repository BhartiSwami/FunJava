package javaIsFun;
import java.util.*;

public class BubbleSort {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		arr=bubbleSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static int[] bubbleSort(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
