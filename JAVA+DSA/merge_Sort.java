
public class merge_Sort {
    public void mergeSort(int arr[], int left, int right){
        int mid;

        if (right>left){
            mid = left + (right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public void merge(int arr[],int l,int mid,int r){
        //find the size of the both array
        int n1 = mid-l+1;
        int n2 = r-mid;
        int Left[] = new int[n1];
        int Right[] = new int[n2];

        for (int i = 0; i < n1 ; i++) {
            Left[i] = arr[l+i];
        }
        for (int j = 0; j < n2 ; j++) {
            Right[j] = arr[mid+1+j];
        }
        int i=0, j=0;
        int k = l;
        while (i<n1 && j<n2 ){
            if ( Left[i]<= Right[j]) {
                arr[k] = Left[i];
                i++;
            }else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        // add reamaining element
        while (i<n1){
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = Right[j];
            j++;
            k++;
        }


       int fun(int n){
            int m=0;
            for(int i=1; i<=n; i*=2){
                for (int j = 0; j < i; j++) {
                    m+=1;

                }
            }

        }
    }
    public static void main(String args[]){
        int arr[] = {54,26,93,17,77,31,44,55};
        merge_Sort obj = new merge_Sort();
        obj.mergeSort(arr,0,7);
        for (int pr : arr){
            System.out.println(pr);
        }
    }
}
