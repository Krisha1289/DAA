import java.util.Random;
import java.util.Scanner; 
public class SelectionSortExample {     
    public static void SelectionSort(int arr[]) {         
        for (int i = 0; i < arr.length - 1; i++) {             
            int Min = i;             
            for (int j = i + 1; j < arr.length; j++) {                 
                if (arr[Min] > arr[j]) { 
                    Min = j; 
                } 
            } 
            int temp = arr[Min];             
            arr[Min] = arr[i];             
            arr[i] = temp; 
        }     
    } 
 
    public static void Display(int arr[]) {         
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println(); 
    } 
 
    public static void main(String[] args) { 
        try (Scanner sc = new Scanner(System.in)) {  // Automatically closes the Scanner at the end 
            System.out.println("case:"); 
            System.out.println("1. Best"); 
            System.out.println("2. Average");             
            System.out.println("3. Worst");             
            int choice = sc.nextInt(); 
 
            int size = 1000; 
            int arr[] = new int[size]; 
 
            switch (choice) {                 
                case 1: 
                    for (int i = 0; i < size; i++) {                         
                        arr[i] = i + 1; 
                    } 
                    System.out.println("Best Case:"); 
                    break;                 
                    case 2: 
                    Random rand = new Random();                     
                    for (int i = 0; i < size; i++) {                         
                        arr[i] = rand.nextInt(10001); 
                    } 
                    System.out.println("Average Case:");                     
                    break;                 
                    case 3: 
                    for (int i = 0; i < size; i++) {                         
                        arr[i] = size - i; 
                    } 
                    System.out.println("Worst Case:");                     
                    break;                 
                    default: 
                    System.out.println("Invalid choice!");                     
                    return; 
            } 
 
            Display(arr); 
 
            long startTime = System.nanoTime();             
            SelectionSort(arr); 
            long endTime = System.nanoTime(); 
 
            Display(arr); 
            long duration = endTime - startTime; 
 
            System.out.println("Start : " + startTime); 
            System.out.println("End : " + endTime); 
            System.out.println("Time : " + duration + " nano seconds"); 
        } 
    } 
} 
