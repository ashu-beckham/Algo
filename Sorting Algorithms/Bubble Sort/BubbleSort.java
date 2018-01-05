import java.util.Scanner;

public class BubbleSort  {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = in.nextInt();
        System.out.println("Enter the Array Elements : \n");
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.println("Your Sorted Array is : \n");
        for (int x : a)
            System.out.print(x + " ");
    }
}

