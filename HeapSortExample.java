package practicals;

import java.util.*; 
 
public class HeapSortExample { 
 
    public static void Heapify(int arr[], int n, int i) {         
        int largest = i;         
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 
 
        if (left < n && arr[left] > arr[largest]) {             
            largest = left; 
        } 
 
        if (right < n && arr[right] > arr[largest]) {             
            largest = right; 
        } 
 
        if (largest != i) {             
            int temp = arr[i];             
            arr[i] = arr[largest]; 
            arr[largest] = temp; 
 
            Heapify(arr, n, largest); 
        }     
    } 
 
    public static void HeapSort(int arr[]) {         
        int n = arr.length; 
 
        for (int i = n / 2 - 1; i >= 0; i--) { 
            Heapify(arr, n, i); 
        } 
 
        for (int i = n - 1; i > 0; i--) {             
            int temp = arr[0];             
            arr[0] = arr[i]; 
            arr[i] = temp; 
 
            Heapify(arr, i, 0); 
        }     
    } 
 
    public static void Display(int arr[]) { 
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println(); 
    } 
 
    public static void main(String[] args) {         
        try (Scanner sc = new Scanner(System.in)) { 
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
            HeapSort(arr); 
            long endTime = System.nanoTime(); 
 
            Display(arr); 
            long duration = endTime - startTime; 
 
            System.out.println("Start : " + startTime); 
            System.out.println("End : " + endTime); 
            System.out.println("Time : " + duration + " nano seconds"); 
        } 
    } } 
