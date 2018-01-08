import java.util.*;

public class MergeSort  {
    public static void main (String[] args) {
        int[] a = {4, 5, 3, 2, 1, 6, 7, 89, 10};
        mergeSort(a);
        System.out.println("Sorted array is : \n");
        for (int x : a)
            System.out.print(x + " ");
    }
    static void mergeSort(int[] a) {
        int n = a.length;
        if (n<2)
            return;
        int mid = n / 2;
        int[] b = new int[mid];
        int[] c = new int[n - mid];
        for (int i = 0; i < mid; i++)
            b[i] = a[i];
        for (int i = mid; i < n; i++)
            c[i - mid] = a[i];
        mergeSort(b);
        mergeSort(c);
        merge(a, b, c);
    }
    static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (j < b.length && k < c.length) {
            if (b[j] < c[k]) {
                a[i++] = b[j++];
            } else
                a[i++] = c[k++];
        }
        while (j < b.length)
            a[i++] = b[j++];
        while (k < c.length)
            a[i++] = c[k++];
    }
}
