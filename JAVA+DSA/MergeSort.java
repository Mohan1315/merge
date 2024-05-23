public class MergeSort {
   void merge(int arr[],int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1 ; ++i) {
            left[i] = arr[i+l];
        }
        for (int j = 0; j < n2; ++j) {
            right[j] = arr[j+m+1];
        }
        int i=0, j=0, k=l;
        while (i<n1 && j<n2){
            if (left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    void Sort(int arr[], int l, int r){
        int m = l+r/2;
        if (l < r) {
            Sort(arr,l,m);
            Sort(arr,l,m);
            merge(arr,l,m,r);
        }
    }
    static void pr(int arr[]){
       for(int pr1: arr){
           System.out.print(arr);
       }
    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int arr[] = {12,15,17,11,3,2,7};
        sort.Sort(arr, 0,arr.length-1);
        for (int pr: arr){
            System.out.println(pr);
        }

    }
}
