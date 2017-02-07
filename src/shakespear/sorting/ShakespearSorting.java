/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakespear.sorting;

import java.io.IOException;

/**
 *
 * @author John
 */
public class ShakespearSorting {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        StopWatch timer = new StopWatch();
        TextSorter sorter = new TextSorter();
        
        String[] text = FileUtility.toStringArray("C:\\Users\\John\\Desktop\\test.txt", "[^A-Za-z]");
        String[] letters = {"b", "c", "a", "d", "k", "l", "f", "e", "g", "h"};
        
        timer.start();
        String[] sortedText = sorter.quickSort(text);
        timer.stop();
        
        for (String s : sortedText) {
            System.out.print(s + ", ");
        }
        
        System.out.println("Execution took " + timer.getTimeInMiliSeconds() + " Milliseconds!!!!");
    }
}
