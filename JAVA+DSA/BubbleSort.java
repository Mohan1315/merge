class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {13,26,32,10,35};
        int n = arr.length; // n is the size of the array
// turns represent the number of phases in the sorting
        for (int turns = 0; turns < n-1; turns++) {
            //loop for comparing current value to next value
            for (int j = 0; j < n-1-turns; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap the value if current value is less then next value
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        //for each loop to print the array
        for(int pr : arr){
            System.out.print(pr+" ");
        }
    }
}