public class BinarySearch {

    int[] search(int[] arr, int key) {

        int mid = arr.length / 2;

        if (key == arr[mid])
            return mid;

        else if (key > mid) {
            int[] rightHalf = new int[(arr.length - mid)];
            for (int i = 0, j = arr[mid + 1]; i < rightHalf.length; i++, j++) {
                rightHalf[i] = arr[j];
            }
            return search(rightHalf, key);
        } 

        else if (key < mid) {
            int[] leftHalf = new int[mid];
            for (int i = 0; i < leftHalf.length; i++) {
                leftHalf[i] = arr[i];
            }
            return search(leftHalf, key);
        } 

    }

}