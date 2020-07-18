package javaIsFun;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class LLDeletion {
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head=delete(head,1);
		print(head);
	}
	static Node delete(Node head, int pos) {
		if(pos==1) {
			head=head.next;
			return head;
		}
		Node temp=head;
		for(int i=0;i<pos-2;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
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
