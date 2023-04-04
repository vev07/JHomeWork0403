import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {13,245,45,22,311,7,11,78};
        int[] arr2 = {13,245,45,22,311,7,11,78,4,45,65,8,89,99};
        int[] arr3 = {13,245,45,22,311,7,11,78,4,45,65,8,89,99};
        String[] str = {"Yevhen", "Iryn", "Karyna", "Zlata"};

        sort(arr);
        System.out.println(Arrays.toString(arr));
        sort(arr2,1,6);
        System.out.println(Arrays.toString(arr2) + " - Sort with index from to ");
        System.out.println(binarySearch(arr3,99 ) + " - binarySearch with key");
        System.out.println(binarySearch(arr3,0,2,3 ) + " - binarySearch with index from to and key");
        sort(str);
        System.out.println(Arrays.toString(str) + " - sort String");
        int indexOfKey = binarySearch(str, "Yevhen");
        System.out.println(indexOfKey);
        System.out.println(Arrays.equals(arr2, arr3) + " - equals int[]a and int[]b");
        //Arrays.fill(arr, 13); //Num put into arr[]
        int[]arr4 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr4) + " - copy int[]");
        int[]arr5 = Arrays.copyOfRange(arr,2,5);
        System.out.println(Arrays.toString(arr5) + " - copyOfRange from to");
        List<String> A = Arrays.asList(str);
        System.out.println(A);
        A.set(0,"!!!Iryna");
        System.out.println(Arrays.toString(str) + " if you chang value in index of List with method asList  String[]");

    }
}
