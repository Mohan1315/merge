import java.util.Scanner;
public class Avg_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0,num;
        for (int i = 0; i < N; i++) {
            num = sc.nextInt();
            sum=sum+num;
        }
        System.out.println(sum/N);
    }
}
