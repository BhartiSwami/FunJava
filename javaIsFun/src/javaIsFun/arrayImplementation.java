package javaIsFun;
import java.util.*;

public class arrayImplementation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of your array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Now Enter the Array Elements!");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("You Entred!");
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
