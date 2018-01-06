import java.util.*;

public class Insertion_sort  {

    public static void main (String[] args)  {

        int[] a = {7, 9, 8, 4, 1, 2, 3, 4, 1, 6, 2, 2};
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j >= 1 && a[j] < a[j - 1]) {
                int swap = a[j];
                a[j] = a[j - 1];
                a[j - 1] = swap;
                j--;
            }
        }
        System.out.println("Sorted array is : ");
        for (int x : a)
            System.out.print(x + " ");
    }
}