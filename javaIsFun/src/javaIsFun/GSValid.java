package javaIsFun;
import java.util.*;


public class GSValid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			for(int i=y;i<=z;i++) {
				int b=x*i;
				if(check(i,b)) {
					System.out.println("Invalid!");
					
				}
				else
					System.out.println("valid!");
					
			}
		}
		
	}
	static boolean check(int n,int b) {
		while(b!=0) {
			
		if(n==b)
			return true;
		else {
			int k=n%10;
			b=b/10;
			check(n,k);
		}
		}
		return false;
		}
}
