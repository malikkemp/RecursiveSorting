import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main

{ // Begin Main Class

    public static void main(String[] args) throws Exception
    { // Begin main method

        System.out.println("\nThis Program will give you the total time in seconds it takes each Sorting Algorithm to run.\n");
        ChooseSortMethod();

    }  // End main method

    //***********************************************************************************************************

    public static void ChooseSortMethod() throws Exception {
        //initialize variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a sorting method: ");
        System.out.println("1: Merge\n2: Quick\n3: Insertion\n4: Bubble\n5: Selection");
        String input = scanner.nextLine();

        //switch case to take user input and choose a sorting method
        switch (parseInt(input)) {
            case 1:
                MergeSort();
                java.awt.Toolkit.getDefaultToolkit().beep();
                ChooseSortMethod();
                break;
            case 2:
                QuickSort();
                java.awt.Toolkit.getDefaultToolkit().beep();
                ChooseSortMethod();
                break;
            case 3:
                InsertionSort();
                java.awt.Toolkit.getDefaultToolkit().beep();
                ChooseSortMethod();
                break;
            case 4:
                BubbleSort();
                java.awt.Toolkit.getDefaultToolkit().beep();
                ChooseSortMethod();
                break;
            case 5:
                SelectionSort();
                java.awt.Toolkit.getDefaultToolkit().beep();
                ChooseSortMethod();
                break;
            default:
                System.out.println("Invalid selection, Please try again\n---------------------------------");
                ChooseSortMethod();
        }
    }

    //***********************************************************************************************************

    public static void MergeSort () throws Exception
    {  // Begin MegaMergeSortDemo ()


        //labeling mergesort
        System.out.println("MergeSort times");

        //Getting input from user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input an Array size: ");
        int size = scanner.nextInt();
        System.out.print("How many times would you like this Algorithm to run?: ");
        int amount = scanner.nextInt();

        //calling for loop to create and sort entire array 100 times
        for(int j = 0; j < amount; j++) {

            //initializing trueStartTime
            long trueStartTime = 0;

            for (int k = 1; k <= 100; k++) { // Begin for (int k = 1; k<= 100; k++)


                int[] a = new int[size];
                int[] temp = new int[a.length];  // empty temporary array, the same size and type as a[]

                // fill the array with random integers
                for (int i = 0; i < a.length; i++) {  // Begin for (int k = 1; k<= 100; k++)

                    a[i] = (int) (Math.random() * 100000 + 1);

                }  // End for (int k = 1; k<= 100; k++)

                // write the array to a data file
                // WARNING the text file will be 5.7 MB for 1 million items
                writeLines(a, "BeforeMergeSort.txt");

                // get the start time in nanoseconds
                long startTime = System.nanoTime();

                //call mergesort to sort the entire array
                mergeSort(a, temp, 0, (a.length - 1));

                // get the end time in nanoseconds
                long endTime = System.nanoTime();

                //calculating trueStartTime
                trueStartTime = (trueStartTime + (endTime - startTime));

                // calculate elapsed time in nanoseconds
                long duration = endTime - startTime;

                //only open this up if you want the time it takes for each individual sort
                //code:
                // print the elapsed time in seconds   (nanoseconds / 1 billion)
                //System.out.printf("%12.8f %n", (double)duration/1000000000) ;

                // write the sorted array to a data file
                // WARNING the file will be 5.7 MB for 1 million items
                writeLines(a, "AfterMergeSort.txt");

            } // Begin for (int k = 1; k<= 100; k++)


            //prints the total time elapsed for full sort
            System.out.println((double) trueStartTime / 1000000000);
        }




    }// End MegaMergeSortDemo () main()

    //*******************************************************************************************************

    public static void mergeSort(int[] a, int[] temp, int low, int high)
    { // Begin mergeSort(int[] a, int[] temp, int low, int high)

        //  low is the low index of the part of the array to be sorted
        //  high is the high index of the part of the array to be sorted

        int mid;  // the middle of the array – last item in low half

        // if high > low then there is more than one item in the list to be sorted
        if (high > low)
        {  // Begin if (high > low)

            // split into two halves and mergeSort each part

            // find middle (last element in low half)
            mid = (low+high)/2;
            mergeSort(a, temp, low, mid );
            mergeSort(a, temp, mid+1, high);

            // merge the two halves back together, sorting while merging
            merge(a, temp, low, mid, high);

        } // End if (high > low)

        return;

    }// Begin mergeSort(int[] a, int[] temp, int low, int high)

    //*******************************************************************************************************

    public static void QuickSort() throws Exception {
        //start quick sort demo

        //labelling quick sort
        System.out.println("QuickSort Times");

        //Getting input from user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input an Array size: ");
        int size = scanner.nextInt();
        System.out.print("How many times would you like this Algorithm to run?: ");
        int amount = scanner.nextInt();


        //calling for loop to create and sort entire array 100 times
        for(int j = 0; j < amount; j++) {

            //initializing trueStartTime
            long trueStartTime = 0;

            for (int k = 1; k <= 100; k++) { // Begin for (int k = 1; k<= 100; k++)

                //int size = 1000000;     // change this number to change the size of the random array
                int[] a = new int[size];
                int[] temp = new int[a.length];  // empty temporary array, the same size and type as a[]

                // fill the array with random integers
                for (int i = 0; i < a.length; i++) {  // Begin for (int k = 1; k<= 100; k++)

                    a[i] = (int) (Math.random() * 100000 + 1);

                }  // End for (int k = 1; k<= 100; k++)

                // write the array to a data file
                // WARNING the text file will be 5.7 MB for 1 million items
                writeLines(a, "BeforeQuickSort.txt");

                // get the start time in nanoseconds
                long startTime = System.nanoTime();

                //call quicksort to sort the entire array
                quickSort(a, 0, (a.length - 1));

                // get the end time in nanoseconds
                long endTime = System.nanoTime();

                //calculating trueStartTime
                trueStartTime = (trueStartTime + (endTime - startTime));

                // calculate elapsed time in nanoseconds
                long duration = endTime - startTime;

                //only open this up if you want the time it takes for each individual sort
                //code:
                // print the elapsed time in seconds   (nanoseconds / 1 billion)
                //System.out.printf("%12.8f %n", (double)duration/1000000000) ;

                //writeLines(a,"test");

                // write the sorted array to a data file
                // WARNING the file will be 5.7 MB for 1 million items
                writeLines(a, "AfterQuickSort.txt");

            } // Begin for (int k = 1; k<= 100; k++)

            //prints the total time elapsed for full sort
            System.out.println((double) trueStartTime / 1000000000);
        }

    }

    //******************************************************************************************************

    // the recursive quicksort method, which calls the partition method
    public static void quickSort(int[] a, int startIndex, int endIndex)
    {  // Start quickSort(int[] a, int startIndex, int endIndex)

        int pivotIndex;      // the index of pivot returned by the quicksort partition

        // if the set has more than one element, then partition
        if (startIndex < endIndex)
        {  // Start if (startIndex < endIndex)

            // partition and return the pivotIndex
            pivotIndex = partition(a, startIndex, endIndex);
            // quicksort the low set
            quickSort(a, startIndex, pivotIndex - 1);
            // quicksort the high set
            quickSort(a, pivotIndex + 1, endIndex);

        } // Start if (startIndex < endIndex)

    } // End quickSort(int[] a, int startIndex, int endIndex)


    //***********************************************************************************************

    public static void InsertionSort() throws Exception{

        //labeling
        System.out.println("InsertionSort times");


        //Getting input from user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input an Array size: ");
        int size = scanner.nextInt();
        System.out.print("How many times would you like this Algorithm to run?: ");
        int amount = scanner.nextInt();

        //calling for loop to create and sort entire array 100 times
        for(int l = 0; l < amount; l++) {

            //initializing trueStartTime
            long trueStartTime = 0;

            for (int k = 1; k <= 100; k++) { // Begin for (int k = 1; k<= 100; k++)

                //int size = 1000000;     // change this number to change the size of the random array
                int[] a = new int[size];
                int[] temp = new int[a.length];  // empty temporary array, the same size and type as a[]

                // fill the array with random integers
                for (int i = 0; i < a.length; i++) {  // Begin for (int k = 1; k<= 100; k++)

                    a[i] = (int) (Math.random() * 100000 + 1);

                }  // End for (int k = 1; k<= 100; k++)

                // write the array to a data file
                // WARNING the text file will be 5.7 MB for 1 million items
                writeLines(a, "BeforeInsertionSort.txt");

                // get the start time in nanoseconds
                long startTime = System.nanoTime();

                //call mergesort to sort the entire array
                insertionSort(a);

                // get the end time in nanoseconds
                long endTime = System.nanoTime();

                //calculating trueStartTime
                trueStartTime = (trueStartTime + (endTime - startTime));

                // calculate elapsed time in nanoseconds
                long duration = endTime - startTime;

                //only open this up if you want the time it takes for each individual sort
                //code:
                // print the elapsed time in seconds   (nanoseconds / 1 billion)
                //System.out.printf("%12.8f %n", (double)duration/1000000000) ;

                // write the sorted array to a data file
                // WARNING the file will be 5.7 MB for 1 million items
                writeLines(a, "AfterInsertionSort.txt");
            }

            //prints the total time elapsed for full sort
            System.out.println((double) trueStartTime / 1000000000);
        }

    }//End InsertionSort

    //***********************************************************************************************

    public static void insertionSort(int arr[]){ //algorithm to be called by InsertionSort
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

        /* Move elements of arr[0..i-1], that are
           greater than key, to one position ahead
           of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    //***********************************************************************************************

    public static void BubbleSort() throws Exception{

        //labeling
        System.out.println("BubbleSort times");

        //Getting input from user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input an Array size: ");
        int size = scanner.nextInt();
        System.out.print("How many times would you like this Algorithm to run?: ");
        int amount = scanner.nextInt();

        //calling for loop to create and sort entire array 100 times
        for(int l = 0; l < amount; l++) {

            //initializing trueStartTime
            long trueStartTime = 0;

            for (int k = 1; k <= 100; k++) { // Begin for (int k = 1; k<= 100; k++)

                //int size = 1000000;     // change this number to change the size of the random array
                int[] a = new int[size];
                int[] temp = new int[a.length];  // empty temporary array, the same size and type as a[]

                // fill the array with random integers
                for (int i = 0; i < a.length; i++) {  // Begin for (int k = 1; k<= 100; k++)

                    a[i] = (int) (Math.random() * 100000 + 1);

                }  // End for (int k = 1; k<= 100; k++)

                // write the array to a data file
                // WARNING the text file will be 5.7 MB for 1 million items
                writeLines(a, "BeforeBubbleSort.txt");

                // get the start time in nanoseconds
                long startTime = System.nanoTime();

                //call mergesort to sort the entire array
                bubbleSort(a);

                // get the end time in nanoseconds
                long endTime = System.nanoTime();

                //calculating trueStartTime
                trueStartTime = (trueStartTime + (endTime - startTime));

                // calculate elapsed time in nanoseconds
                long duration = endTime - startTime;

                //only open this up if you want the time it takes for each individual sort
                //code:
                // print the elapsed time in seconds   (nanoseconds / 1 billion)
                //System.out.printf("%12.8f %n", (double)duration/1000000000) ;

                // write the sorted array to a data file
                // WARNING the file will be 5.7 MB for 1 million items
                writeLines(a, "AfterBubbleSort.txt");
            }

            //prints the total time elapsed for full sort
            System.out.println((double) trueStartTime / 1000000000);
        }
    }

    //***********************************************************************************************

    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    //***********************************************************************************************

    public static void SelectionSort() throws Exception{

        //labeling mergesort
        System.out.println("SelectionSort times");

        //Getting input from user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input an Array size: ");
        int size = scanner.nextInt();
        System.out.print("How many times would you like this Algorithm to run?: ");
        int amount = scanner.nextInt();

        //calling for loop to create and sort entire array 100 times
        for(int j = 0; j< amount; j++) {


            //initializing trueStartTime
            long trueStartTime = 0;

            for (int k = 1; k <= 100; k++) { // Begin for (int k = 1; k<= 100; k++)

                //int size = 1000000;     // change this number to change the size of the random array
                int[] a = new int[size];
                int[] temp = new int[a.length];  // empty temporary array, the same size and type as a[]

                // fill the array with random integers
                for (int i = 0; i < a.length; i++) {  // Begin for (int k = 1; k<= 100; k++)

                    a[i] = (int) (Math.random() * 100000 + 1);

                }  // End for (int k = 1; k<= 100; k++)

                // write the array to a data file
                // WARNING the text file will be 5.7 MB for 1 million items
                writeLines(a, "BeforeSelectionSort.txt");

                // get the start time in nanoseconds
                long startTime = System.nanoTime();

                //call mergesort to sort the entire array
                selectionSort(a);

                // get the end time in nanoseconds
                long endTime = System.nanoTime();

                //calculating trueStartTime
                trueStartTime = (trueStartTime + (endTime - startTime));

                // calculate elapsed time in nanoseconds
                long duration = endTime - startTime;

                //only open this up if you want the time it takes for each individual sort
                //code:
                // print the elapsed time in seconds   (nanoseconds / 1 billion)
                //System.out.printf("%12.8f %n", (double)duration/1000000000) ;

                // write the sorted array to a data file
                // WARNING the file will be 5.7 MB for 1 million items
                writeLines(a, "AfterSelectionSort.txt");
            }

            //prints the total time elapsed for full sort
            System.out.println((double) trueStartTime / 1000000000);
        }
    }

    //***********************************************************************************************

    public static void selectionSort(int arr[]){
        {
            int n = arr.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }


    /* This method merges the two halves of the set being sorted back together.
     * the low half goes from a[low] to a[mid]
     * the high half goes from a[mid+1] to a[high]
     * (High and low only refer to index numbers, not the values in the array.)
     *
     * The work of sorting occurs as the two halves are merged back into one
     * sorted set.
     *
     * This version of mergesort copies the set to be sorted into the same
     * locations in a temporary array, then sorts them as it puts them back.
     * Some versions of mergesort sort into the temporary array then copy it back.
     */

    public static void merge(int[] a, int[] temp, int low, int mid, int high)
    { // End merge(int[] a, int[] temp, int low, int mid, int high)

        //  low is the low index of the part of the array to be sorted
        //  high is the high index of the part of the array to be sorted
        //  mid is the middle of the array – last item in low half

        // copy the two sets from a[] to the same locations in the temporary array

        for (int i = low; i <= high; i++)
        {  // Begin for (int i = low; i <= high; i++)

            temp[i] = a[i];

        }  // End for (int i = low; i <= high; i++)


        //set up necessary pointers
        int lowP = low;         // pointer to current item in low half
        int highP = mid + 1;    // pointer to current item in high half
        int aP = low;           // pointer to where each item will be put back in a[]

        // while the pointers have not yet reached the end of either half)

        while ((lowP <= mid) && (highP <= high))
        { // Begin  while ((lowP <= mid) && (highP <= high))

            // if current item in low half <= current item in high half

            if (temp[lowP] <= temp[highP])
            {  // Begin if (temp[lowP] <= temp[highP])

                // move item at lowP back to array a and increment low pointer
                a[aP] = temp[lowP];
                lowP++;

            }  // Begin if (temp[lowP] <= temp[highP])
            else

            {  // Begin else (temp[lowP] <= temp[highP])

                // move item at highP back to array a and increment high pointer
                a[aP] = temp[highP];
                highP++;

            } // End else (temp[lowP] <= temp[highP])

            // increment pointer for location in original array
            aP++;

        } // end while ((lowP <= mid) && (highP <= high))


        /* When the while loop is done, either the low half or the high half is done
         * We now simply move back everything in the half not yet done.
         * Remember, each half is already in order itself.
         */
        // if lowP has reached end of low half, then low half is done, move rest of high half
        if (lowP > mid)
            // Begin if (lowP > mid)

            for (int i = highP; i <= high; i++)
            {  // Begin for (int i = highP; i <= high; i++)

                a[aP] = temp[i];
                aP++;

            } // End for (int i = highP; i <= high; i++)

        else // high half is done, move rest of low half
            // Begin else  (lowP > mid)

            for (int i = lowP; i <= mid; i++)
            {  // Begin  for (int i = lowP; i <= mid; i++)

                a[aP] = temp[i];
                aP++;

            }// End for (int i = lowP; i <= mid; i++)

        return;
    } // end merge()
    // **********************************************************************************************

    /* This method writes an int array to a text data file.
     * The first parameter is the array. The second parameter
     * is the file name.
     */
    public static void writeLines(int[] a, String fileName) throws Exception
    {  // Begin writeLines(int[] a, String fileName)

        // create a File class object with the given file name
        java.io.File out = new java.io.File(fileName);
        // Create a PrintWriter output stream and link it to the File object
        java.io.PrintWriter outfile = new java.io.PrintWriter(out);

        // write the elements of an int array, separated by spaces
        for (int i = 0; i < a.length; i++)
        {	// Begin for (int i = 0; i < a.length; i++)

            outfile.print(a[i] + " ");

        }   // End for (int i = 0; i < a.length; i++)

        // print a newline at the end of the list of integers

        outfile.println();

        outfile.close();

    } // End writeLines(int[] a, String fileName) throws Exception

    //*************************************************************************************************



    //*******************************************************************************************************

    // This method performs quicksort partitioning on a set of elements in an array.
    public static int partition(int[] a, int startIndex, int endIndex)
    { // Start partition(int[] a, int startIndex, int endIndex)


        int pivotIndex;             // the index of the chosen pivot element
        int pivot;                  // the value of the chosen pivot
        int midIndex = startIndex;  // boundary element between high and low sets

        // select the center element in the set as the pivot by integer averaging
        pivotIndex = (startIndex + endIndex) / 2;
        pivot = a[pivotIndex];

        // put the pivot at the end of the set so it is out of the way
        swap(a, pivotIndex, endIndex);

        // iterate the set, up to but not including last element
        for (int i = startIndex; i < endIndex; i++)
        { // Start for (int i = startIndex; i < endIndex; i++)

            // if a[i] is less than the pivot
            if (a[i] < pivot)
            {  // Start if (a[i] < pivot)


                // put a[i] in the low half and increment current Index
                swap(a, i, midIndex);
                midIndex = midIndex + 1;

            }  // End if (a[i] < pivot)

        } // End for (int i = startIndex; i < endIndex; i++)

        // partitioning complete -- move pivot from end to middle
        swap(a, midIndex, endIndex);

        // return index of pivot
        return midIndex;
    }
    //*****************************************************************************************************

    // This method swaps two elements in an integer array
    public static void swap(int[] a, int first, int second)
    {  // Begin swap(int[] a, int first, int second)

        int c;  // a catalyst variable used for the swap

        c = a[first];
        a[first] = a[second];
        a[second] = c;

    }//End swap method

    //******************************************************************************************************


}//End RecursiveSorting