package SpaceTimeComplexity;

public class Quad { // T.C = O(n^2)
    public static void main(String[] args) {
        int[] arr = new int[] {3,4,5,10,0, 5, 6, 25,90};
        int target = 10;
        // find pairs whose sum is target = 10

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println("pair "+arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
