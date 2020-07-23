package javaIsFun;
import java.util.*;

class Height{
	int feet;
	int inches;
	public Height(int feet,int inches) {
		this.feet=feet;
		this.inches=inches;
	}
}

public class MaximumInStructArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			Height arr[]=new Height[n];
			for(int i=0;i<n;i++) {
				int feet=sc.nextInt();
				int inches=sc.nextInt();
				arr[i]=new Height(feet,inches);
			}
			GfG gfg=new GfG();
			int max=gfg.findMax(arr,n);
			System.out.println(max);
		}
	}
}


class GfG
{
    public static int findMax(Height arr[], int n)
   {
       int max=Integer.MIN_VALUE;
       int arr1[]=new int[n];
       for(int i=0;i<n;i++){
           arr1[i]=arr[i].feet*12 + arr[i].inches;
           if(arr1[i]>max){
               max=arr1[i];
           }
       }
       return max;
   }
    
}
