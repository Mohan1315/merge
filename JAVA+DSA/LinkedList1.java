import java.util.Scanner;
public class LinkedList1 {
   public class Node{
       Node prev;
       int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node prev;
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
    void insert(int data){

        Node newNode = new Node(data);
        if (head == null) {
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next=null;

        }
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
    boolean isPlalindrome(){
        Node temp1 = head;
        Node temp2 = tail;
        int flag =0;
        while (temp1.next!=null && temp2.prev!=null){

            if (temp1.data != temp2.data) {
                flag = 0;
            }
            else {
                flag =1;
            }

            temp1 = temp1.next;
            temp2 = temp2.prev;
        }
        if (flag == 1) {
            return true;
        }
        else {
            return false;
        }

    }

    public void print(){
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
    void print1(){
        Node temp = tail;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList1 ll =  new LinkedList1();
//        ll.addFirst(10);
//        ll.addFirst(20);
//        ll.addFirst(30);
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.print(head);
        ll.insert(1);
        ll.insert(2);
        ll.insert(2);
        ll.insert(1);

//        System.out.println();
//        head = ll.reverseList(head);
        ll.print1();
        System.out.println();
        System.out.println(ll.isPlalindrome());
//        System.out.println(tail.prev.data);

    }
}
