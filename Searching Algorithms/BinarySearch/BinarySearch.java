import java.util.*;

public class BinarySearch  {
    public static void main (String[] args) {
        int[] a = {4, 5, 3, 2, 1, 6, 7, 89, 10};
        Arrays.sort(a); //Array should be sorted.
        int ind = binarySearch(a, 89);
        if (ind == -1)
            System.out.println("Element not found!!!!");
        else
            System.out.println("index of 89 in sorted array is : " + ind);

    }
    static int binarySearch(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a[mid] == x)
                return mid;
            if (a[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}

