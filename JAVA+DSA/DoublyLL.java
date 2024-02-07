import java.util.*;
public class DoublyLL {
    class Node {
        Node next;
        Node prev;
        int data;
        Node(int d){
            data = d;
            next=null;
            prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head=tail=newNode;
        }
        else{
            newNode.prev= tail;
            tail.next=newNode;
            tail= newNode;
        }
    }
    void anticlkRotate(int n){

        int count = 1;

        Node temp = head;

        while (count!=n) {
           tail.next = temp;
           tail = temp;
           temp = temp.next;
           head = temp.next;
            count++;
        }
        temp.next = null;

    }
    void print(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLL list = new DoublyLL();
//        int n = sc.nextInt();
//        while (n!=0){
//            list.add(n);
//            n= sc.nextInt();
//        }
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        int x = sc.nextInt();
//        System.out.println(n);
        list.anticlkRotate(3);
        list.print();
    }
}
