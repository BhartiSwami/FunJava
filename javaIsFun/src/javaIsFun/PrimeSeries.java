package javaIsFun;
import java.util.*;

public class PrimeSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			System.out.print("2"+" ");
			for(int i=3;i<=n;i+=2) {
				int flag=0;
				for(int j=2;j*j<i;j++) {
					if(i%j==0)
						flag=1;
				}
				if(flag==0){
					System.out.print(i+" ");
				}
			}
		}
	}
}
