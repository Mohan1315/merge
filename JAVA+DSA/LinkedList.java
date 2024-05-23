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
//    void selectionSort()
//    {
//        Node temp = head;
//
//        // Traverse the List
//        while (temp) {
//            Node min = temp;
//            Node r = temp.next;
//
//            // Traverse the unsorted sublist
//            while (r) {
//                if (min.data > r.data)
//                    min = r;
//
//                r = r.next;
//            }
//
//            // Swap Data
//            int x = temp.data;
//            temp.data = min.data;
//            min.data = x;
//            temp = temp.next;
//        }
//    }
    void Selection(int n){
        Node temp1 = head;
        Node temp2 = temp1.next;
        Node min = head;
        int count = 0;
        while (temp1.next!= null){
            min = temp1;
            temp2 = temp1.next;
            while (temp2!=null){
                if (temp2.data< min.data){
                    min=temp2;

                }
                temp2=temp2.next;
            }
            int tempo = temp1.data;
            temp1.data = min.data;
            min.data = tempo;
            count++;
            temp1=temp1.next;
            if (count==n){
                Node Pr = head;
                while (Pr!=null){
                    System.out.print(Pr.data+" ");
                    Pr = Pr.next;
                }
            }
        }
    }

// This code is contributed by shivanisinghss2110


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
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(8);
        ll.addLast(2);

//        ll.add(0,5);
//        ll.add(1,4);
//        ll.add(2,6);
//        ll.add(1,3);
//        System.out.println(ll.removeFirst());
        ll.print();
        ll.Selection(5);
//        ll.print();

    }
}
