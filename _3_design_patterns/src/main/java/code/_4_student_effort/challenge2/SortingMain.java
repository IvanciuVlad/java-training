package code._4_student_effort.challenge2;


import java.util.Arrays;

public class SortingMain {

    static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy01OfArr);
        System.out.println();
        displaySorted(new MergeSort(), copy02OfArr);
    }
}
