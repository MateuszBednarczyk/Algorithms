package org.matthew;

public class BinarySearch {
    int[] array = {1, 2, 3, 4};
    int low = 0;
    int high = array.length - 1;
    int mid;
    int guess;
    int item = 1;

    public int algorithm() {

        while (low <= high) {
            mid = low + high;
            guess = array[mid];

            if (guess < item) {
                low = mid + 1;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return 0;
    }
}
