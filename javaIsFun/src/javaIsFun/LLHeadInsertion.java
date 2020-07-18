package javaIsFun;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class LLHeadInsertion {
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head=insert(head);
		print(head);
	}
	static Node insert(Node head) {
		Node newNode=new Node(6);
		newNode.next=head;
		head=newNode;
		return head;
	}
	static void print(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
}
