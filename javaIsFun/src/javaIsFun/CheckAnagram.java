package javaIsFun;
import java.util.*;

public class CheckAnagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s1=sc.next();
			String s2=sc.next();
			if(Anagram(s1,s2)) 
				System.out.println("Yes these are Anagram");
			else
				System.out.println("Not a Anagram");
		}
	}
	static boolean Anagram(String s1,String s2) {
		int l1=s1.length();
		int l2=s2.length();
		if(l1!=l2)
			return false;
		else {
			int fr[]=new int[256];
			for(int i=0;i<l1;i++ ) {
				fr[s1.charAt(i)]++;
				fr[s2.charAt(i)]--;
			}
			for(int i=0;i<256;i++) {
				if(fr[i]!=0)
					return false;
			}
			return true;
		}
	}
}
