package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] expectedSortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.

        int[] actualSoredArray = sort.selectionSort(unSortedArray);
        try {
            Assert.assertEquals(expectedSortedArray, actualSoredArray, "Array is not sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        int[] actualSortedArray1 = sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray1, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        int[] actualSoredArray2 = sort.mergeSort(unSortedArray, 0, unSortedArray.length - 1);
        try {
            Assert.assertEquals(expectedSortedArray, actualSoredArray2, "Array is not sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        int[] actualSoredArray3 = sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(expectedSortedArray, actualSoredArray3, "Array is not sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        int[] actualSoredArray4 = sort.heapSort(unSortedArray);
        try {
            Assert.assertEquals(expectedSortedArray, actualSoredArray4, "Array is not sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //int[]actualSoredArray5 = sort.bucketSort(unSortedArray,1000);
        int[] actualSoredArray5 = sort.bucketSort(unSortedArray, 1000);
        try {
            Assert.assertEquals(expectedSortedArray, actualSoredArray5, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }


        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        int[] actualSoredArray6 = sort.shellSort(unSortedArray);
        try {
            Assert.assertEquals(expectedSortedArray, actualSoredArray6, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //Now implement Unit test for rest of the soring algorithm...................below
        System.out.println("Passed");

    }
}
