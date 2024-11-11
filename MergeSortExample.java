package practicals;

import java.util.*; 
 
public class MergeSortExample { 
 
    public static void Merge(int arr[], int left, int mid, int right) {         
        int n1 = mid - left + 1; 
        int n2 = right - mid; 
 
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
 
        for (int i = 0; i < n1; i++) { 
            L[i] = arr[left + i]; 
        }         for (int j = 0; j < n2; j++) { 
            R[j] = arr[mid + 1 + j]; 
        } 
 
        int i = 0, j = 0;         
        int k = left;         
        while (i < n1 && j < n2) {             
            if (L[i] <= R[j]) {                 
                arr[k] = L[i];                 
                i++;             
            } 
            else {                 
                arr[k] = R[j];                 
                j++;             
            }             
            k++; 
        } 
 
        while (i < n1) {             
            arr[k] = L[i];             
            i++;             
            k++; 
        } 
 
        while (j < n2) {             
            arr[k] = R[j];             
            j++;             
            k++; 
        } 
    } 
 
    public static void MergeSort(int arr[], int left, int right) {         
        if (left < right) { 
            int mid = left + (right - left) / 2; 
 
            MergeSort(arr, left, mid);             
            MergeSort(arr, mid + 1, right); 
 
            Merge(arr, left, mid, right); 
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
 
            int size = 100; 
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
            MergeSort(arr, 0, arr.length - 1); 
            long endTime = System.nanoTime(); 
 
            Display(arr); 
            long duration = endTime - startTime; 
 
            System.out.println("Start : " + startTime); 
            System.out.println("End : " + endTime); 
            System.out.println("Time : " + duration + " nano seconds"); 
        } 
    } } 

