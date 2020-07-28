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

public class InsertionLL {
	Node head;
	 void insert(int data) {
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
		}
		else {
			Node t=head;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=temp;
		}
	}
	 void print() {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		InsertionLL ll=new InsertionLL();
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				ll.insert(sc.nextInt());
			}
			ll.print();
		}
	}
}
