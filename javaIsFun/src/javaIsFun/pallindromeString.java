package javaIsFun;
import java.util.*;


public class pallindromeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			int len=s.length();
			int l=0;
			int r=len-1;
			int pal=0;
			while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				pal=1;
				break;
			}
			l++;
			r--;
			}
			if(pal==1) {
				System.out.println("String is not a pallindrome");
				
			}
			else {
				System.out.println("Given String is a pallindrome");
			}
		}
	}
}
