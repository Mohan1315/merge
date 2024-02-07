import java.util.Scanner;
public class Simple_bill_generate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the Pencil : ");
        float pencil_price = sc.nextFloat();
        System.out.println("Enter the cost of the Pen : ");
        float pen_price = sc.nextFloat();
        System.out.println("Enter the cost of the Eraser : ");
        float eraser_price = sc.nextFloat();
        float Total_cost = pencil_price+pen_price+eraser_price;
        System.out.print("The total cost of the product is : "+ Total_cost);
    }
}
