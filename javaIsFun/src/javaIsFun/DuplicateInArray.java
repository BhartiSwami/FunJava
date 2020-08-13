package javaIsFun;
import java.util.*;

public class DuplicateInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int flag=0;
			Arrays.sort(arr);
			for(int i=0;i<n-1;i++) {
				if(arr[i]==arr[i+1]) {
					flag=1;
					System.out.print(arr[i]+" ");
				}
			}
			if(flag==0) {
				System.out.println("-1");
			}
			System.out.println();
		}
	}
}
