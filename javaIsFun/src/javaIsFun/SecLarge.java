package javaIsFun;
import java.util.*;

public class SecLarge {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=5;                                 
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();                             
			}
			Arrays.sort(arr);                                    
			if(areSame(arr))                                     
				System.out.println("0");
			else
				checkTestCase(arr,n);
		}
	static boolean areSame(int arr[]) {                          
		int first=arr[0];
		for(int i=0;i<5;i++) {
			if(arr[i]!=first)
				return false;
		}
		return true;
	}
	static void checkTestCase(int arr[],int n) {
		if(n>1 && arr[n-1]!=arr[n-2]) 
			System.out.println(arr[n-2]);
		else
		checkTestCase(arr,n-1);
	}
}
