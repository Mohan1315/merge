package SpaceTimeComplexity;

public class Log { //O(logn)
    public static void main(String[] args) {
        //Binary search is best Example of log n time complexity
        int[] arr = new int[]{2, 4,6,8,9, 10,12,14,16,18, 20, 40, 60};
        // Task is to find 40 in given array and print the index of the 40



        // To find the execution time

        var startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) { // this is not optimal way and T.C = O(n)
            if (arr[i] == 40) {
                System.out.println(i);
                break;
            }
        }

        var endTime = System.nanoTime();
        System.out.println("Time taken by Linear time complexity "+(endTime-startTime));

        //optimal solution to find the 40 and print the index
        int start = 0;
        int end = arr.length - 1;

        startTime = System.nanoTime();

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == 40) {
                System.out.println("found 40 at index " + mid);
                break;
            } else if (arr[mid] < 40) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }

        endTime = System.nanoTime();
        System.out.println("Time taken by Logn time complexity "+(endTime-startTime));




    }
}

/*
A Book of 500 hundered pages a best example of the Log time complexity. when we want open a page number like 380 so we
open half book then we get a random page thats will be less than 380 or greater than if it is less then we move forward
and if it is greater then we move bacward. after moving we get our specific page number.

Note : O(logn) is better than O(n)
*/
