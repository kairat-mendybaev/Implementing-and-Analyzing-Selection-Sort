import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testRandomArray() {
        int[] randomArray = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        SelectionSort.selectionSort(randomArray);
        assertArrayEquals(expected, randomArray, "The array should be sorted in ascending order.");
    }

    @Test
    public void testAlreadySortedArray() {
        int[] sortedArray = {10, 20, 30, 40, 50};
        int[] expected = {10, 20, 30, 40, 50};
        SelectionSort.selectionSort(sortedArray);
        assertArrayEquals(expected, sortedArray, "The already sorted array should remain unchanged.");
    }

    @Test
    public void testDescendingOrderArray() {
        int[] descendingArray = {50, 40, 30, 20, 10};
        int[] expected = {10, 20, 30, 40, 50};
        SelectionSort.selectionSort(descendingArray);
        assertArrayEquals(expected, descendingArray, "The array should be sorted in ascending order.");
    }

    @Test
    public void testAllElementsSameArray() {
        int[] sameElementsArray = {5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5};
        SelectionSort.selectionSort(sameElementsArray);
        assertArrayEquals(expected, sameElementsArray, "The array of all same elements should remain unchanged.");
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        int[] expected = {};
        SelectionSort.selectionSort(emptyArray);
        assertArrayEquals(expected, emptyArray, "An empty array should remain unchanged.");
    }

    @Test
    public void testSingleElementArray() {
        int[] singleElementArray = {1};
        int[] expected = {1};
        SelectionSort.selectionSort(singleElementArray);
        assertArrayEquals(expected, singleElementArray, "A single element array should remain unchanged.");
    }
}
