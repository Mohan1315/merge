import java.util.Scanner;
public class ArrayDupli {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i=0; i<n; i++){
//            arr[i]= sc.nextInt();
//        }
////        System.out.print(arr[0]+" ");
////        for (int i = 0; i < n-1; i++) {
////            if (arr[i]!=arr[i+1]){
////                System.out.print(arr[i+1]+ " ");
////            }
////        }
//        int k = arr[0];
//        for(int i=0; i<n-1; i++){
//            if(arr[i]!= arr[i+1]){
//                k = arr[i+1];
//
//            }
//        }
        int[] nums = {3,2,6,1,4};
        int len = nums.length;
        int sum,total;
        sum=total=nums[0]+nums[1];
        int count =1;


        for(int i=2; i<len-1; i++){
            for(int j=i+1; j<len; j++){

                sum = nums[i] + nums[j];

                if(total==sum ){
                    nums[j] =0;
                    count++;


                }

            }
        }
        System.out.println(count);
    }
}
