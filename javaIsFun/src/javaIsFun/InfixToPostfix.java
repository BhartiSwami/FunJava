package javaIsFun;
import java.util.*;

class Stack{
	private char arr[];
	private int top,m;
	public Stack() {
	}
	public Stack(int size) {
		m=size;
		arr=new char[m];
		top=-1;
	}
	public void push(char data) {
		if(top<arr.length) {
			arr[++top]=data;
		}
		else {
			System.out.println("data can't be pushed due to stack overflow");
		}
	}
	public char pop() {
		if(top==-1) {
			System.out.println("data can't be poped out as there is no element in the Stack");
			return '!';
		}
		else
			return arr[top--];
	}
	public char peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return (top==-1);
	}
}
public class InfixToPostfix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter the Infix");
		String s=sc.nextLine();
		System.out.println(infixtopostfix(s));
	}
	static String infixtopostfix(String s) {
		String res="";
		int len=s.length();
		Stack st=new Stack(len);
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				res=res+c;
			}
			else {
				while(!st.isEmpty() && precedence(st.peek())>=precedence(c)) {
					res=res+st.pop();
				}
				st.push(c);
			}
		}
		while(!st.isEmpty()) {
			res=res+st.pop();
		}
		return res;
	}
	static int precedence(char c) {
		if(c=='+' || c=='-')
			return 1;
		if(c=='/' ||c=='*')
			return 2;
		if(c=='$')
			return 3;
		return 0;
	}
}
