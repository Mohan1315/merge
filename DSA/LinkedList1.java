import java.util.Scanner;
public class LinkedList1 {
   public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head==null){
         head=tail=newNode;
         return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head=tail=newNode;
            return;
        }
        tail.next= newNode;
        tail = newNode;
    }
    Node reverseList(Node node){
        Node next = null;
        Node curr = node;
        Node prev = null;
        while (curr!=null){
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    public void print(Node head){
        Node temp = head;
        if (temp == null) {
            System.out.println("Linked list not exist");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList1 ll =  new LinkedList1();
//        ll.addFirst(10);
//        ll.addFirst(20);
//        ll.addFirst(30);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print(head);
        System.out.println();
        head = ll.reverseList(head);
        ll.print(head);

    }
}
