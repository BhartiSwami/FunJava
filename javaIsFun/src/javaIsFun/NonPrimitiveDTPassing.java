package javaIsFun;
import java.util.*;

public class NonPrimitiveDTPassing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of your array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements!");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("You entred!");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		Fun(arr);
		System.out.println();
		System.out.println("Array List after calling Fun Function");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");                             /*We passes non-primitive data types as reference so it directly
		                                                               changes the value in heap so our array got updated automatically*/
		}                                                                        
		System.out.println();
	}
	static void Fun(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]+=10;
		}
		System.out.println();
		System.out.println("Output of array by Fun function");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
