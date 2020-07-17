package javaIsFun;
import java.util.*;

public class gcd1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		gcd1 g=new gcd1();
		int t =sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(g.GCD1(a,b));
		}
	}
	public int GCD1(int a,int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return a;
		if(a>b)
			return GCD1(a-b,b);
		else
			return GCD1(a,b-a);
	}
}
