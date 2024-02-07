import java.util.Scanner;
public class Area_of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square : ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.print("Area of the square is : "+area);
    }
}
