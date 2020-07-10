package javaIsFun;
import java.util.*;

public class ScannerImplementation {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int a=sc.nextInt();
		System.out.println("a="+" "+a);
		System.out.println("Enter a Double value");
		Double b=sc.nextDouble();
		System.out.println("b="+" "+b);
		System.out.println("Enter a Bool value");
		Boolean c=sc.nextBoolean();
	    System.out.println("c="+" "+c);
	    System.out.println("Enter a String");
		String d = sc.next(); 
		System.out.println("d="+" "+d);
	}
}
