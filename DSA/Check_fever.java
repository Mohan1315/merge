/*
Question 2 : Finish the following code so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever
 */

public class Check_fever {
    public static void main(String[] args) {
        double temp = 103.5;
        if (temp > 100){
            System.out.print("You have fever.");
        }
        else {
            System.out.print("You don't have fever");
        }
    }
}
