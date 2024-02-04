/*Question 1 : Write a Java program to get a number from the user and print whether it is
positive or negative.*/
import java.util.Scanner;

public class Cdn_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int Num = sc.nextInt();
        if (Num > 0){
            System.out.print("The number is positive. ");
        }
        else {
            System.out.print("The number is Negative. ");
        }
    }
}
