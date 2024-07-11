# Benchmark Recursive Sorting
This is a benchmarking application you can use to test one of five sorting algorithms. 
The output will tell you how long in seconds it took for an algorithm to sort an array of a 
size given by the user. This was made to test how differing hardware can handle varying algorithms and serves
to show how important using the right algorithms can be when building very large applications. This program is ran purely from within the terminal.

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
