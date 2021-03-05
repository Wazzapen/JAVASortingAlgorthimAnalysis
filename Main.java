import java.util.*;
import java.io.*;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input  = new Scanner(System.in);


        Boolean quit = false;
        while (!quit) {

            System.out.println("1.Call Bubble sort function:");
            System.out.println("2.Call Quicksort function:");
            System.out.println("3.Call Selection Sort function:");
            System.out.println("4.Call Heap sort function:");
            System.out.println("5.Call Insertion Sort function:");
            System.out.println("6.Call Merge Sort function:");
            System.out.println("7.Exit:");
            System.out.println("Choose an option:");

            int option = input.nextInt();
            switch(option) {
                case 1 :
                    long t1 = System.nanoTime();
                    long t1a = System.nanoTime();

                    try {
                        FileWriter writer = new FileWriter("Bubble.txt");
                        Random rand = new Random();
                        int[] numbers;
                        //int[] num;
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("How many values do you want to pass into the array: ");
                        int n = 0;
                        if (scanner.hasNextInt()) {
                            n = scanner.nextInt();
                            scanner.nextLine();
                        }
                        numbers = new int[n];
                        long ta = (System.nanoTime() - t1a) / 1000000;
                        System.out.println("Elapsed time = " + ta + " ms");

                        int i;
                        for (i = 0; i < numbers.length; i++) {
                            numbers[i] = (int) (Math.random() * 1000000 + 1);
                            writer.write(numbers[i] + " ");
                        }

                        System.out.println("Unsorted List");
                        System.out.println(Arrays.toString(numbers));

                        bubbleSort(numbers);
                        System.out.println("Sorted List");
                        System.out.println(Arrays.toString(numbers));
                        long t = (System.nanoTime() - t1) / 1000000;
                        System.out.println("Elapsed time = " + t + " ms");
                        writer.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2 :
                    long t2 = System.nanoTime();
                    long t2a = System.nanoTime();

                    try{
                        FileWriter writer = new FileWriter("Quicksort.txt");
                        Random rands = new Random();
                        int[] numbers;
                        //int[] num;
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("How many values do you want to pass into the array: ");
                        int n = 0;
                        if (scanner.hasNextInt()) {
                            n = scanner.nextInt();
                            scanner.nextLine();
                        }
                        numbers = new int[n];
                        long ta = (System.nanoTime() - t2a) / 1000000;
                        System.out.println("Elapsed time = " + ta + " ms");

                        for(int i=0;i<numbers.length;i++)
                        {
                            numbers[i] = (int)(Math.random() * 100000+ 1) ;
                            writer.write(numbers[i] + " ");
                        }

                        int q = numbers.length;
                        System.out.println("Unsorted List");
                        System.out.println(Arrays.toString(numbers));

                        quickSort(numbers,0, q-1);
                        System.out.println("Sorted List");
                        System.out.println(Arrays.toString(numbers));
                        long t = (System.nanoTime() - t2) / 1000000;
                        System.out.println("Elapsed time = " + t + " ms");
                        writer.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3 :
                    long t3 = System.nanoTime();

                    try{
                        FileWriter writer = new FileWriter("Selection.txt");
                        Random rand = new Random();
                        int[] numbers;
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("How many values do you want to pass into the array: ");
                        int n = 0;
                        if (scanner.hasNextInt()) {
                            n = scanner.nextInt();
                            scanner.nextLine();
                        }
                        numbers = new int[n];
                        for(int i=0;i<numbers.length;i++)
                        {
                            numbers[i] = (int)(Math.random() * 100000 + 1) ;
                            writer.write(numbers[i] + " ");
                        }

                        System.out.println("Unsorted List");
                        System.out.println(Arrays.toString(numbers));

                        selection(numbers);
                        System.out.println("Sorted List");
                        System.out.println(Arrays.toString(numbers));
                        long t = (System.nanoTime() - t3) / 1000000;
                        System.out.println("Elapsed time = " + t + " ms");
                        writer.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 4:
                    long t4 = System.nanoTime();

                    try{
                        FileWriter writer = new FileWriter("Heap.txt");
                        Random rand = new Random();
                        int[] numbers;
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("How many values do you want to pass into the array: ");
                        int n = 0;
                        if (scanner.hasNextInt()) {
                            n = scanner.nextInt();
                            scanner.nextLine();
                        }
                        numbers = new int[n];
                        for(int i=0;i<numbers.length;i++)
                        {
                            numbers[i] = (int)(Math.random() * 1000 + 1) ;
                            writer.write(numbers[i] + " ");
                        }

                        System.out.println("Unsorted List");
                        System.out.println(Arrays.toString(numbers));

                        heapsort(numbers);
                        System.out.println("Sorted List");
                        System.out.println(Arrays.toString(numbers));
                        long t = (System.nanoTime() - t4) / 1000000;
                        System.out.println("Elapsed time = " + t + " ms");
                        writer.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 5:
                    long t5 = System.nanoTime();

                    try{
                        FileWriter writer = new FileWriter("Insertion sort.txt");
                        Random rands = new Random();
                        int[] numbers;
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("How many values do you want to pass into the array: ");
                        int n = 0;
                        if (scanner.hasNextInt()) {
                            n = scanner.nextInt();
                            scanner.nextLine();
                        }
                        numbers = new int[n];
                        for(int i=0;i<numbers.length;i++)
                        {
                            numbers[i] = (int)(Math.random() * 100000+ 1) ;
                            writer.write(numbers[i] + " ");
                        }


                        System.out.println("Unsorted List");
                        System.out.println(Arrays.toString(numbers));

                        insertionsort(numbers);
                        System.out.println("Sorted List");
                        System.out.println(Arrays.toString(numbers));
                        long t = (System.nanoTime() - t5) / 1000000;
                        System.out.println("Elapsed time = " + t + " ms");
                        writer.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    long t6 = System.nanoTime();

                    try{
                        FileWriter writer = new FileWriter("Mergesort.txt");
                        Random rands = new Random();
                        int[] numbers;
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("How many values do you want to pass into the array: ");
                        int n = 0;
                        if (scanner.hasNextInt()) {
                            n = scanner.nextInt();
                            scanner.nextLine();
                        }
                        numbers = new int[n];
                        for(int i=0;i<numbers.length;i++)
                        {
                            numbers[i] = (int)(Math.random() * 100000 + 1) ;
                            writer.write(numbers[i] + "-");
                        }

                        System.out.println("Unsorted List");
                        System.out.println(Arrays.toString(numbers));

                        mergesort(numbers,0, numbers.length - 1);
                        System.out.println("Sorted List");
                        System.out.println(Arrays.toString(numbers));
                        long t = (System.nanoTime() - t6) / 1000000;
                        System.out.println("Elapsed time = " + t + " ms");
                        writer.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    quit = true;
                    break;
                default :
                    System.out.println("Invalid Option");
            }
        }

    }


    public static void bubbleSort(int numbers[])
    {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (numbers[j] > numbers[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
    }

    public static int partition(int numbers[], int low, int high)
    {
        int pivot = numbers[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (numbers[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;




            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = numbers[i+1];
        numbers[i+1] = numbers[high];
        numbers[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    public static void quickSort(int numbers[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(numbers, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(numbers, low, pi-1);
            quickSort(numbers, pi+1, high);
        }
    }




    public static void selection(int numbers[])
    {
        int n = numbers.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void heapsort(int numbers[])
    {
        int n = numbers.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(numbers, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = numbers[0];
            numbers[0] = numbers[i];
            numbers[i] = temp;

            // call max heapify on the reduced heap
            heapify(numbers, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    public static void heapify(int numbers[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && numbers[l] > numbers[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && numbers[r] > numbers[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = numbers[i];
            numbers[i] = numbers[largest];
            numbers[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(numbers, n, largest);
        }
    }

    /*Function to sort array using insertion sort*/
    public static void insertionsort(int numbers[])
    {
        int n = numbers.length;
        for (int i=1; i<n; ++i)
        {
            int key = numbers[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && numbers[j] > key)
            {
                numbers[j+1] = numbers[j];
                j = j-1;
            }
            numbers[j+1] = key;
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static void merge(int numbers[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = numbers[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = numbers[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                numbers[k] = L[i];
                i++;
            }
            else {
                numbers[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            numbers[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            numbers[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void mergesort(int numbers[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            mergesort(numbers, l, m);
            mergesort(numbers, m + 1, r);

            // Merge the sorted halves
            merge(numbers, l, m, r);
        }
    }

}



