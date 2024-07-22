import java.util.*;

/**
 * bubblesort
 */
public class bubblesort {
    static void Bubblesort(int[] a) {
        int n = a.length;
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    k = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = k;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter" + n + "integer");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("array before sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Bubblesort(a);
        System.out.println("array after sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("\ntime in milliseconds:" + timeTaken);
    }

}