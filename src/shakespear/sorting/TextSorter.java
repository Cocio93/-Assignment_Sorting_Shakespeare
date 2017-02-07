/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakespear.sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author John
 */
public class TextSorter {

    private String[] array;

    public TextSorter() {

    }

    public String[] quickSort(String[] words) {
        this.array = words;
        int low = 0;
        int high = words.length - 1;

        sort(low, high);

        return this.array;

    }

    //Actually quickSort Logic
    private void sort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        String pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {

            while (array[i].compareTo(pivot) < 0) {
                i++;
            }
            while (array[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j) {
            sort(lowerIndex, j);
        }

        if (i < higherIndex) {
            sort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public String[] selectionSort(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int min = i;

            for (int j = i + 1; j < words.length; j++) {
                if (words[j].compareTo(words[min]) < 0) {
                    min = j;
                }
            }

            if (min != i) {
                String sMin = words[min];
                String sI = words[i];
                words[min] = sI;
                words[i] = sMin;
            }
        }

        return words;
    }

    public String[] insertionSort(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int j = i;
            while (j > 0 && words[j - 1].compareTo(words[j]) > 0) {
                String sJ = words[j];
                String sJm = words[j - 1];
                words[j - 1] = sJ;
                words[j] = sJm;
                j = j - 1;
            }
        }
        return words;
    }

    public String[] mergeSort(String[] words) {
        if (words.length <= 1) {
            return words;
        }

        int i = 0;
        int n = words.length;
        int q = words.length / 2;

        String[] left = Arrays.copyOfRange(words, i, q);
        String[] right = Arrays.copyOfRange(words, q, n);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private String[] merge(String[] left, String[] right) {
//        System.out.println("LEFT: " + Arrays.toString(left));
//        System.out.println("RIGHT: " + Arrays.toString(right));
        ArrayList<String> result = new ArrayList();

        while (left.length != 0 && right.length != 0) {
            if (left[0].compareTo(right[0]) <= 0) {
                result.add(left[0]);
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result.add(right[0]);
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length != 0) {
            result.add(left[0]);
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length != 0) {
            result.add(right[0]);
            right = Arrays.copyOfRange(right, 1, right.length);
        }

        String[] newResult = result.toArray(new String[result.size()]);
        return newResult;
    }

}
