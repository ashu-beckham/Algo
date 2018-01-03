import java.util.Scanner;

public class Selection_sort  {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = in.nextInt();
        System.out.println("Enter the Array Elements : \n");
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Your Sorted Array is : \n");
        for (int x : a)
            System.out.print(x + " ");
    }
}
