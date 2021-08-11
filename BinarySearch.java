public class BinarySearch {

    int search(int[] arr, int key) {

        int left = 0,
            right = arr.length - 1;
        
        while (left <= right) {

            int middle = (left + right) / 2;

            if (key < arr[middle])
                right = middle - 1;
            
            else if (key > arr[middle])
                left = middle + 1;
            
            else  
                return middle;
        }

        return -1;

    }
}