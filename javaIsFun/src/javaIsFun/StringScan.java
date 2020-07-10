package javaIsFun;
import java.util.*;

public class StringScan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give an Integer Input");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("You Entred!");
		System.out.println(a);
		System.out.println("Enter a Double type Input");
		double b=Double.parseDouble(sc.nextLine());
		System.out.println("You Entred!");
		System.out.println(b);
		System.out.println("Enter a String type Input");
		String c=sc.nextLine();
		System.out.println("You Entred!");
		System.out.println(c);
		System.out.println("Give a Boolean Type Input");
		boolean d=Boolean.parseBoolean(sc.nextLine());
		System.out.println("You Entred!");
		System.out.println(d);
	}
}


/*we use the parse method here because in case of nextLine() function it doesn't wait for scanning and directly executes
the next statement*/