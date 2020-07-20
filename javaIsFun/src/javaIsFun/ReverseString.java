package javaIsFun;
import java.util.*;


public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			char[] arr=s.toCharArray();
			int len=s.length();
			int l=0;
			int r=len-1;
			while(l<r) {
				char temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
				l++;
				r--;
			}
			System.out.print(new String(arr));
		}
	}
}
