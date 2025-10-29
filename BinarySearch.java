package chapter_7;

public class BinarySearch {
    /** Use binary search to find the key in the list */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low, key not found
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};
        int index = binarySearch(numbers, 7);
        System.out.println("Index of 7: " + index);
    }

}
