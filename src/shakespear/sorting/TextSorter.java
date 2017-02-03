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

    public TextSorter() {

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
        int q = words.length/2;
        
        
        String[] left = Arrays.copyOfRange(words, i, q);
        String[] right = Arrays.copyOfRange(words, q+1, n);
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        return merge(left, right);
    }

    private String[] merge(String[] left, String[] right) {
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
