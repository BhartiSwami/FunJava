/*Given an array A of size n of integers in the range from 1 to n, we need to find the inverse permutation of that array.
Inverse Permutation is a permutation which you will get by inserting position of an element at the position specified by 
the element value in the array. For better understanding, consider the following example:
Suppose we found element 4 at position 3 in an array, then in reverse permutation, we insert 3
 (position of element 4 in the array) in position 4 (element value).*/


package javaIsFun;
import java.util.*;

public class InversePermutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n+1];
			for(int i=1;i<=n;i++) {
				arr[i]=sc.nextInt();
			}
			int arr1[]=new int[n+1];
			
			for(int i=1;i<=n;i++) {
				int j=arr[i];
				arr1[j]=i;
			}
			for(int i=1;i<=n;i++) {
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
		}
	}
}
