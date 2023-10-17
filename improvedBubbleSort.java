package bubbleSort;

import java.util.Arrays;

/**
 * improvedBubbleSort
 */
public class improvedBubbleSort {

    
    public static void main(String[] args) {
        int arr[] = { 5, 4, -3, 0, 1 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[]) {
        boolean swapped;
        // for each step max element is at the last index
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // swap the elements if the element is smaller than the previous element
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                swapped = true;
            }

            if (! swapped)
            {
                break;
            }

        }
    }
    
}