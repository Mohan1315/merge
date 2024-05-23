public class Check {
    void fact(int n){
        System.out.println(n);
    }
    void factorial(int n){
        if (n == 1) {
            System.out.println(n);
        }
        else{
            factorial(n-1);
            fact(n);
        }
    }
    public static void main(String[] args) {
        Check Q = new Check();
        Q.factorial(5);
    }
}
