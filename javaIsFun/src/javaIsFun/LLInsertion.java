package javaIsFun;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class LLInsertion {
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head=insert(head,2,7);
		print(head);
	}
	static Node insert(Node head, int pos, int data) {
		Node newNode=new Node(data);
		if(pos==1) {
			newNode.next=head;
			head=newNode;
			return head;
		}
		Node temp=head;
		for(int i=0;i<pos-2;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
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
