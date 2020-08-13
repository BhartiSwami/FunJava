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
			int freqArr[]=new int[10];
			for(int i=0;i<n;i++) {
				freqArr[arr[i]]+=1;
				if(freqArr[arr[i]]>1) {
					System.out.print(arr[i]+" ");
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("-1");
			}
			System.out.println();
		}
	}
}
