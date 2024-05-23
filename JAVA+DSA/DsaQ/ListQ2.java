package DsaQ;

public class ListQ2 {
	class Node{
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	Node tail;
	void add(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	void removeDup() {
		Node curr=head;
		
		while(curr!=null) {
			Node temp = curr;
			while(temp!=null && temp.data==curr.data) {
				temp = temp.next;
			}
			curr.next=temp;
			curr = curr.next;
		}
		}
	
	public static void main(String args[]) {
		ListQ2 ll = new ListQ2();
		ll.add(1);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(3);
		ll.removeDup();
		ll.print();
	}
}
