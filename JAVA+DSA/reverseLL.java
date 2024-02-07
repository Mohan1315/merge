import java.util.*;
public class reverseLL {
    class Node{
        Node next;
        public Node prev;

        int data;
        Node(int d){
          data = d;
          next = null;
        }
    }
    public Node head;
    public Node tail;
    void add(int d){
        Node newNode = new Node(d);

        if (head==null){
          head=tail=newNode;
        }
        else{
            newNode.prev = tail;
            tail.next=newNode;
            tail=newNode;

        }

    }
    void print(){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseLL list = new reverseLL();
        int n = sc.nextInt();
        while (n!=0){
            list.add(n);
            n=sc.nextInt();
        }
//        list.add(1);
        list.print();

    }

}
