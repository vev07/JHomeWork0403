package CombSort;

import java.sql.Array;
import java.util.Arrays;

public class ArrayCombSort {
    public static void comboSort(int[]arr) {
        int gap = arr.length;
        boolean isSort = false;
        while (isSort || gap != 1) {
            if (gap > 1) {
                gap = gap * 10 / 13;
            } else {
                gap = 1;
            }
            isSort = true;
            for (int i = gap; i < arr.length; i++) {
                if (arr[i - gap] > arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - gap];
                    arr[i - gap] = tmp;
                    isSort = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {12,355,23,76,23,98,3,78,4};
        comboSort(num);
        System.out.println(Arrays.toString(num));
    }
}
