import java.util.*;
public class LinkedList_removeDuplicate {
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
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void rmDuplicate(){
        if (head==null){
            return;
        }
        Node temp = head;
        while (temp.next != null){
            if (temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else {
                temp=temp.next;
            }
        }
    }
    public void print(){
        Node temp= head;
        if (head == null){
            System.out.println("The linked List is empty");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList_removeDuplicate ll = new LinkedList_removeDuplicate();
        int n=0;
        int data;
        while (n>=0){
            data= sc.nextInt();
            ll.add(data);
            n=data;
            if (n == 0) {
                break;
            }
        }
        ll.print();
        System.out.println();
        ll.rmDuplicate();
        ll.print();


    }
}
