import java.util.Scanner;

public class StarPattern {
    void invertedPattern2(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void HalfPyramidPatter(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void CharPattern(int n){
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    void invertedPattern1(int n){
        int c = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            c--;
        }
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        StarPattern obj = new StarPattern();
//        obj.invertedPattern1(n);
//        obj.HalfPyramidPatter(n);
//        obj.CharPattern(n);
        System.out.println(obj.sum(5,10));
        System.out.println(obj.sum(5.0F, 10.0F));
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
