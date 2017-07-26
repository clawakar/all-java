package edu.algo.search;
import java.util.Arrays;

/**
 * Created by kkumar1 on 6/26/17.
 */
public class Sorter {

    static int[] array= {5,9,2,9,3,27,4,2,11};

    public static void main(String[] args) {
       printArray(sortUsingQuickSort(array));
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+",");
    }

    public static int[] bubbleSort(int[] arr) {
        int intArr[] = Arrays.copyOf(arr, arr.length);
        for(int index =0 ; index < (intArr.length-1); index++) {

            for(int ind=index+1; ind < intArr.length; ind++) {
                if(intArr[index] > intArr[ind]) {
                    int temp = intArr[index];
                    intArr[index] = intArr[ind];
                    intArr[ind] = temp;
                }
            }
        }
        return intArr;
    }

    public static int[] heapSort(int[] arr) {
        int intArr[] = Arrays.copyOf(arr, arr.length);
        for(int index = intArr.length ; index > 0; index--) {
            heapify(intArr, index);
        }
        return intArr;
    }

    private static void heapify(int[] arr, int n){
        for(int i=(n/2) -1; i >= 0; i--) {
            int left = 2*(i+1)-1;
            int right = 2*(i+1);
            if(arr[i] < arr[left]) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
            }
            if(right< n && arr[i] < arr[right]) {
                    int temp = arr[i];
                    arr[i] = arr[right];
                    arr[right] = temp;
            }
        }
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1]=temp;
    }

    public static int[] sortUsingQuickSort(int arr[]){
        int intArr[] = Arrays.copyOf(arr, arr.length);
        quicksort(intArr, 0, intArr.length-1);
        return intArr;
    }

    private static void quicksort(int[] arr, int low, int high){
        if(low < high) {
            int q = partition(arr, low,high);
            System.out.println("q:"+q);
            //quicksort(arr, low, q);
            //quicksort(arr, q+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i,j,pivot,temp;
        pivot=arr[low];
        i=low; j=high;

        while(true) {
            while(arr[i] < pivot && arr[i]!=pivot){
                i++;
            }
            while(arr[j] > pivot && arr[j]!=pivot){
                j--;
            }
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else
            {
                System.out.println();
                return j;
            }
        }
    }

}
