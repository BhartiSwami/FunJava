package javaIsFun;
import java.util.*;

public class GCD {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int min=Math.min(a, b);
			int m=0;
			for(int i=1;i<=min;i++) {
				if(a%i==0 && b%i==0) {
					m=i;
				}
			}
			System.out.println(m);
		}
	}
}
