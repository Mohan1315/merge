package SpaceTimeComplexity;

public class Linear { // Linear Time coplexit = O(n)
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};

        //Task print the array
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[0] = arr[0]+10; //O(1)

        //Total Time complexity= n + 1 = O(n+1) => O(n)
        System.out.println(arr[0]);  // T.C = O(1)

        //Total Time complexity= n + 1 +1 = O(n+2) => O(n)

        //copy the elements of one array to another array

        int [] newArr= new int[arr.length]; // space complexity = O(n)

        for (int i =0; i<arr.length; i++){  //T.c = O(n) and S.C = O(1)
            newArr[i] = arr[i];

        }
        for (int num : newArr){
            System.out.println(num);
        }
    }
}

/*
Linear Time Complexity : Time and space grows, It is directly proptional. If input increases time complexity will be increase;
Linear Time complexity : O(n)
*/
