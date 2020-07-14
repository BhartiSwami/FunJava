package javaIsFun;
import java.util.*;

public class ArrayInsertion {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			arr1[i]=arr[i];
		}
		int index=sc.nextInt();
		int value=sc.nextInt();
		if(index<0) {
			System.out.println("invalid index");
		}
		for(int i=n-1;i>=index;i--)
		{
			arr1[i+1]=arr1[i];
		}
		arr1[index]=value;
		for(int i=0;i<n+1;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
