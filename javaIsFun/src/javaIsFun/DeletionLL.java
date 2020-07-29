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

public class DeletionLL {
	Node head;
	void Insert(int data) {
		Node new_node=new Node(data);
		if(head==null) {
			head=new_node;
		}
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
	}
		
	void delete(int pos) {
		Node temp=head;
		int len=0;
		if(pos==1) {
			head=head.next;
			return;
		}
		while(temp!=null) {
			temp=temp.next;
			len++;
		}
		Node ran=head;
		for(int i=1;i<pos-1;i++) {
			ran=ran.next;
		}
		ran.next=ran.next.next;
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
		DeletionLL obj=new DeletionLL();
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				obj.Insert(sc.nextInt());
			}
			obj.print();
			obj.delete(sc.nextInt());
			obj.print();
		}
	}
}
