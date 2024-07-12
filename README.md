# Benchmark Recursive Sorting
This is a benchmarking application you can use to test one of five sorting algorithms. 
The output will tell you how long in seconds it took for an algorithm to sort an array of a 
size given by the user. This was made to test how differing hardware can handle varying algorithms and serves
to show how important using the right algorithms can be when building very large applications. This program is ran purely from within the terminal.

![image](https://github.com/user-attachments/assets/d4fa30f3-0b9a-45e9-90e0-ccefac120347)


### Sorting Algorithms being tested
- Merge Sort
- Quick Sort
- Insertion Sort
- Bubble Sort
- Selection Sort

## Prerequisites
To download and run the application, you first need to ensure that you have Git and Java installed on your system. On most Operating 
Systems, you can check if you already have Java installed by opening a terminal and entering the following command:
```bs
java -version
```
You can also check if you have Git installed by running a similar command:
```bs
git version
```
If you do not have Java installed on your system, there are instructions here: [Installing Java](https://www.java.com/en/download/help/download_options.html).
Similarly, if you do not have Git installed, there are instructions for most Operating Systems at the following link: [Installing Git](https://github.com/git-guides/install-git).

## Installation of the Benchmarking Application
Once you have git and Java installed onto your system, 
the benchmarking application can be installed on you system by running the following bash script: 
```bs
git clone https://github.com/malikkemp/RecursiveSorting.git
```
## Running the Application
Running the following command will create a Main.class file and run the program
```bs
javac /your_cloned_directory/RecursiveSorting/src/Main.java
java Main /your_cloned_directory/RecursiveSorting/src/
```
Make sure to replace this with the directory that you've cloned your application into such as 
```bs
javac ~/Projects/RecursiveSorting/src/Main.java
java Main ~/Projects/RecursiveSorting/src/
```

## Things to keep in mind when running the program
It's possible that the measurement using System.nanoTime() doesn't start immediately after you start the sort (or any operation). The delay can occur due to various reasons related to how Java code executes and how system resources are managed. In Java, even though you might call System.nanoTime() immediately after starting an operation (like a sort), there could be some initial setup or initialization that runs before the actual sorting algorithm begins. This is something to keep in mind when trying to measure the time against something like a stopwatch. In this case, when you run the sorting algorithm, a file for the Array Size that you specify is created for each iteration of the sort, and the timer only starts after that file is created and the program actually starts sorting.
