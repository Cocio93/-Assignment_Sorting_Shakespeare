# -Assignment_Sorting_Shakespeare

This is a program used to sort arrays with text provided by a .txt file.

This is done with help of TextSorter class, which implements MergeSort, SelectionSort and InsertionSort.
The text file is loaded by using the FileUtility, provided by the teacher.
To measure the time of execution for each of the sorting algorithms, 
a StopWatch class is implemented. The StopWatch is started and stopped before each execution,
and then returns the time of execution.


As it takes a very long time to complete sorting the whole shakespeare file,
we have tested the algorithms on a short section of the file instead, with the following times to compare:

MergeSort = 78ms

SelectionSort = 169ms

InsertionSort = 199ms
