package sortingAlgo;
public class BubbleSort {

    public static void bubblesort(int[] arr){
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            for (int j=0;j<n-i-1; j++){
                if (arr[j]>arr[j+1]){   // '>' for ascending ,'<' for descending
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] data = {64,34,25,12,22,11,90};

        System.out.println("unsorted array");
        for(int i : data){
            System.out.print(i + " ");
        }

        bubblesort(data);
        System.out.println("\nSorted Array (Ascending)");
        for (int i: data){
            System.out.print(i+" ");
        }
    }
}
