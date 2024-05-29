package MyArrays;

public class Main {
    public static void main(String[] args) {
        MyArray arr = new MyArray(2);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(6);

        System.out.println(arr);
        arr.reverse();
        arr.removeAt(2);
        arr.remove(5);
        System.out.println(arr);
        System.out.println(arr.max());
    }
}
