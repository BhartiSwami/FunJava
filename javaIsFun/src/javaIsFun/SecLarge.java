package javaIsFun;
import java.util.*;

public class SecLarge {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);                             
		int t=sc.nextInt();                                      //No. of test cases
		while(t-->0) {
			int count=0;
			int n=sc.nextInt();                                  // size of array
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();                             //taking array elements as input
			}
			Arrays.sort(arr);
			if(areSame(arr))
				System.out.println("0");
			else
				System.out.println(arr[n-2]);
		}
	}
	static boolean areSame(int arr[]) {
		int first=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=first)
				return false;
		}
		return true;
	}
//	static boolean Check_Same(int arr[],int n) {
//		int flag=0;
//		for(int i=0;i<n-1;i++) {
//			if(arr[i]==arr[i+1])
//				flag=1;
//			else 
//				flag=0;
//		}
//		return flag;
//	}
}
