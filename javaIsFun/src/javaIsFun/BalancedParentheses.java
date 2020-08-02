package javaIsFun;
import java.util.*;


public class BalancedParentheses {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t-->0) {
			String s=sc.nextLine();
			if(Check(s)) 
				System.out.println("Balanced!");
			else
				System.out.println("not Balanced!");
		}
	}
	static boolean Check(String s) {
		Stack<Character> st=new Stack<>();
		if(s.length()%2!=0)
			return false;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(' || c=='{' || c=='[') {
				st.push(c);
			}
			if(c==')' || c=='}' || c==']') {
				if(st.isEmpty()) {
					return false;
				}
				char ch=st.pop();
				if((c==')' && ch!='(') || (c=='}' && ch!='{') || (c==']' && ch!='['))
					return false;
			}
		}
		if(st.isEmpty())
			return true;
		return false;
	}
}
