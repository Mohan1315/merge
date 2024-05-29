package SpaceTimeComplexity;

public class Constant {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        // add 10 to first element of the array
        arr[0]=arr[0]+10; //Time complexity = O(1)

        // no additional space will be use because already takie an spce by array

        System.out.println(arr[0]); //T.C = O(1)

        //1 + 1 + = O(2) == O(1) Contant Time complexity

        int num = arr[arr.length-1]; //int = 4bytes -> 1 bytes = 32bit

        //O(4) = O(1) // constant space compexity
        // constant always denoted by O(1)

    }
}
