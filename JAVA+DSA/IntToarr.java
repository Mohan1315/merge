public class IntToarr {
    public static void isPalindrome(int num){
        int number = num;
        int count = 0;
        int remainder =0;
        int n = number;
        int flag = 0;

        while (n!=0){
            n /=10;
            count++;
        }
        int[] arr= new int[count];
//        System.out.println(count);
        for (int i = count-1; i >=0 ; i--) {
            remainder = number%10;
            number = number/10;
            arr[i] = remainder;

        }
        int size = count;
        for (int j=0; j<count; j++){
            System.out.println(arr[j]);
            if (arr[j]==arr[size-1]){
                flag = 1;
            }
            else{
                flag = 0;
            }
            size--;

//            System.out.println(arr[j]);

        }
        if (flag == 1) {
            System.out.println("is Palindrome");
        }
        else {
            System.out.println("not Palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome(1000021);

    }

}
