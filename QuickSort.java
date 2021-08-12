import java.util.*;
/**
 * Quick Sorts a list of integers
 */
public class QuickSort {
    int[] sort(int[] list) {
        quickSort(list, 0, list.length - 1);
        return list;
    }

    private void quickSort(int[] list, int low, int high) {
        if (low < high+1) {
            int p = partition(list, low, high);
            quickSort(list, low, p - 1);
            quickSort(list, p + 1, high);
        }
    }

    private void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    private int partition(int[] list, int low, int high) {
        swap(list, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++)
            if (list[i] < list[low]) 
                swap(list, i, border++);
            
        swap(list, low, border - 1);
        return border - 1;
    }
}