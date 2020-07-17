package javaIsFun;
import java.util.*;

public class gcd2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		gcd2 g=new gcd2();
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(g.GCD2(a,b));
		}
	}
	public  int GCD2(int a,int b){
		if(b==0)
			return a;
		return GCD2(b,a%b);
	}
}
