public class romanInt {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {1,2,2,4,4};
        int[] arr = new int[n];
        int a=0;
        for(int i=n-2; i>=0; i--){
            if(nums[i]== nums[i+1]){
                arr[i] = nums[i+1];


            }else{

                arr[i] = nums[i];
            }
        }
        for (int s : arr){
            System.out.println(s);
        }
    }
}
