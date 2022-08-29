package Task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Main {
    @Test
    public void test1(){
        int[] sourceArray = {2, 1, 8, 5};
        int[] sortedArray = {1, 2, 5, 8};
        quickSort(sourceArray, 0, sourceArray.length-1);
        Assertions.assertArrayEquals(sortedArray, sourceArray);
    }

    @Test
    public void test2(){
        int[] sourceArray = {8, 1, 5, -5, 235, 47, -18, 46};
        int[] sortedArray = {-18, -5, 1, 5, 8, 46, 47, 235};
        quickSort(sourceArray, 0, sourceArray.length-1);
        Assertions.assertArrayEquals(sortedArray, sourceArray);
    }

    @Test
    public void test3(){
        int[] sourceArray = {6, 6, 2, 8, 6};
        int[] sortedArray = {2, 6, 6, 6, 8};
        quickSort(sourceArray, 0, sourceArray.length-1);
        Assertions.assertArrayEquals(sortedArray, sourceArray);
    }

    public static void quickSort(int[] a, int beginIndex, int endIndex){
        if (beginIndex < endIndex){
            int pivot = a[endIndex];
            int k = beginIndex - 1;
            for (int i=beginIndex; i<endIndex; i++){
                if (a[i] <= pivot){
                    k++;

                    int tmp = a[k];
                    a[k] = a[i];
                    a[i] = tmp;
                }
            }

            int tmp = a[k+1];
            a[k+1] = a[endIndex];
            a[endIndex] = tmp;
            int pi = k+1;

            quickSort(a, beginIndex, pi-1);
            quickSort(a, pi+1, endIndex);
        }
    }

    public static void main(String[] args) {
        int[] array2 = {5, 6, 3, 2, 5, 1, 4, 9};

        System.out.println("Source array:\n" + Arrays.toString(array2));

        quickSort(array2, 0, array2.length-1);

        System.out.println("Sorted array:\n" + Arrays.toString(array2));
    }
}
