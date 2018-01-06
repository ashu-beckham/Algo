import java.util.*;

public class Linear_search  {
    public static void main (String[] args)  {
        int[] a = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 10};
        int indx = linear_search(a, 5);
        if (indx == -1)
            System.out.println("Element not Found!");
        else
            System.out.println("5 is located at index: " + indx);
    }
    static int linear_search(int[] a, int x) {
        //returns the index where the element x is located in array a. Returns -1 when not found.
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }
}

