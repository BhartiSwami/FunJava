package javaIsFun;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class SearchInLL {
	Node head;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SearchInLL obj=new SearchInLL();
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				obj.insert(sc.nextInt());
			}
			obj.print();
			obj.search(sc.nextInt());
		}
	
	}
	void search(int data) {
		int found=0;
		Node temp=head;
		while(temp!=null) {
			if(temp.data==data) {
				found=1;
				break;
			}
			temp=temp.next;
		}
		if(found==1) {
			System.out.println("Elemenet found!");
		}
		else {
			System.out.println("Element not Found!");
		}
	}
	void insert(int data) {
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
			temp=temp.next;
		}
	}
}
