package edu.algo.search;

import edu.algo.common.Algorithm;

/**
 * Created by kkumar1 on 6/26/17.
 */
public class Searcher {

    static int[] array= {5,9,2,9,3,27,4,2};
    static int item =4;

    static int[] sortedArr = {2,2,3,4,5,9,9,27};

    public static void main(String[] args) {
        System.out.println("Result:" + biSearch(sortedArr, item));
    }

    public static int biSearch(int arr[], int item) {
        return  binarySearch(arr, item, 0, arr.length-1);
    }

    private static int binarySearch(int arr[], int item, int low, int high ) {
        if(low > high) return  -1;
        int mid = high - low / 2;
        int midElem = arr[mid];
        return  (midElem == item) ? mid : (midElem < item) ?  binarySearch(arr, item, mid+1, high) : binarySearch(arr, item, low, mid-1);
    }

}
