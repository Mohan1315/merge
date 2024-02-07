import java.util.Scanner;
public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        while (i<n){
            arr[i] = sc.nextInt();
            i++;
        }
        int size = arr.length-1;
        while(size>=0) {
            System.out.print(arr[size]+ " ");
            size--;
        }
    }
}
