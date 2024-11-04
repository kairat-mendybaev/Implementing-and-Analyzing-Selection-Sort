public class SelectionSort {

    public static void selectionSort(int[] array) {
        // Loop through each element of the array except the last one
        for (int i = 0; i < array.length - 1; i++) {
            // Assume the current position contains the smallest number
            int minIndex = i;

            // Check the rest of the array for a smaller number
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Update the index of the smallest number
                }
            }

            // Swap the smallest number found
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(testArray);

        selectionSort(testArray);

        System.out.println("Sorted array:");
        printArray(testArray);
    }
}
