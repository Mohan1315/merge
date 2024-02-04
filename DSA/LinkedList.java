public class LinkedList {
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
    public  static int size;
    public void addFirst(int data){
        //step-1 create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null){
            tail=head=newNode;

            return;
        }
        //step-2 newNode.next=head;
        newNode.next=head;
        //step-3 head = newNode
        head = newNode;
    }
    public void addLast(int data){
        //step-1 create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null){
            tail=head=newNode;
            return;
        }
        //step-2 newNode.next=head;
        tail.next=newNode;
        //step-3 head = newNode
        tail = newNode;
    }

    //add at index via method
    public void add(int index, int data){
        if (index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i=0;
        Node temp = head;
        while (i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next = newNode;
    }

    public  int removeFirst(){
        if (size == 0){
            System.out.println("the linked list is empty");

            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head=tail=null;
            size=0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public void print(){
        Node temp = head;
        if (head == null){
            System.out.println("The linked List is empty");
            return;
        }
        while (temp != null){
            System.out.print(temp.data+ " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.addFirst(1);
//        ll.addLast(2);
//        ll.addLast(3);
        ll.add(0,1);
        ll.add(1,2);
        ll.add(2,3);
        ll.add(1,4);
        System.out.println(ll.removeFirst());
        ll.print();
    }
}
