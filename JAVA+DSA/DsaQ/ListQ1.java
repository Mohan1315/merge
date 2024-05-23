package DsaQ;

public class ListQ1 {
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next=null;
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
			tail.next = newNode;
			tail = newNode;
		}
	}
		
	void print() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
	}
	void merge(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		while(temp1!=null && temp2!=null) {
			if(temp1.data<temp2.data) {
				add(temp1.data);
				temp1 = temp1.next;
			}
			else {
				add(temp2.data);
				temp2=temp2.next;
			}
		}
		while(temp1!=null) {
			add(temp1.data);
			temp1=temp1.next;
		}
		while(temp2!=null) {
			add(temp2.data);
			temp2=temp2.next;
		}
		
	}
	

	

	public static void main(String[] args) {
		ListQ1 obj = new ListQ1();
		ListQ1 obj1 = new ListQ1();
		ListQ1 obj2 = new ListQ1();
		
		obj1.add(1);
		obj1.add(3);
		obj1.add(5);
		obj2.add(2);
		obj2.add(4);
		obj2.add(6);
//		obj1.print();
//		obj2.print();
//		merge(obj1.head, obj2.head);
		obj.merge(obj1.head, obj2.head);
		obj.print();
		

	}

}
