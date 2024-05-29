package MyArrays;

public class MyArray {
    int[] items;
    int currentIndex;
    public MyArray(int InitialSize){
        this.items = new int[InitialSize];
        this.currentIndex = 0;
    }

    void insert(int value){
        if (currentIndex==items.length){
            int[] temp = new int[items.length*2];
            for (int i = 0; i < currentIndex; i++) {
                temp[i] = items[i];
            }
            items=temp;


        }
        this.items[currentIndex] = value;
        currentIndex++;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i <currentIndex ; i++) {
            str.append(items[i]+" ");
        }
        str.append("\b]");

        return str.toString();
    }

    int indexOf(int value){
        for (int i = 0; i <currentIndex ; i++) {
            if (this.items[i]==value)
                return i;
        }
        return -1;
    }
    void reverse(){
        int i=0;
        int j=currentIndex-1;
        while (i<j){
            int temp;
            temp=items[i];
            items[i]=items[j];
            items[j] =temp;
            i++;
            j--;
        }
    }
    void removeAt(int index){
        for (int i = index; i <currentIndex-1; i++) {
            this.items[i]=this.items[i+1];
        }
        currentIndex--;
        this.items[currentIndex]=0;
    }
    int min(){
        int min=items[0];
        for (int i = 0; i < currentIndex; i++) {
            if (items[i]<min) {
                min=items[i];
            }
        }
        return min;
    }
    int max(){
        int max=items[0];
        for (int i = 0; i < currentIndex; i++) {
            if (items[i]>max) {
                max=items[i];
            }
        }
        return max;
    }
    void remove(int val){
        removeAt(indexOf(val));
    }

}



