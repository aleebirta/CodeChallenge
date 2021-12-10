package strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copyOfArr1 = Arrays.copyOf(arr, arr.length);
        Integer[] copyOfArr2 = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copyOfArr1);
        displaySorted(new MergeSort(), copyOfArr2);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}