public class SelectionSort {

        public static void main(String[] args) {
            int sel_arr[] = {9,5,4,3,2,1};
            int size = sel_arr.length;
            int i = 0;

            for (i = 0;  i< size; i++) {
                int min_index =i;
                for (int j = i+1; j < size; j++) {
                    if (sel_arr[j]< sel_arr[min_index]){
                        min_index=j;
                    }
                }
                int temp = sel_arr[min_index];
                sel_arr[min_index]=sel_arr[i];
                sel_arr[i]=temp;
                for (int pr2 : sel_arr){
                    System.out.print(pr2+" ");
                }
                System.out.println();
            }
            for (int pr : sel_arr){
                System.out.print(pr+" ");
            }

        }
}
