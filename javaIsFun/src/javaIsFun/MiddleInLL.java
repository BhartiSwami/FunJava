package javaIsFun;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}

public class MiddleInLL {
	Node head;
	void insert(int data) {-
		Node new_node=new Node(data);
		if(head==null)
			head=new_node;
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new_node;
		}
	}
	
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
		}
	}
	void middle() {
		int len=0;
		Node temp=head;
		while(temp!=null) {
			len++;
			temp=temp.next;
		}
		System.out.println("Length ="+" "+len);
		int m=len/2;
		temp=head;
		for(int i=0;i<m;i++) {
			temp=temp.next;
		}
		System.out.println("Middle element is ="+" "+temp.data);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MiddleInLL ob=new MiddleInLL();
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				ob.insert(sc.nextInt());
			}
			ob.print();
			ob.middle();
			ob.print();
		}
	}

}
