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
     */
    public static void main(String[] args) throws IOException {
        StopWatch timer = new StopWatch();
        TextSorter sorter = new TextSorter();
        String[] text = FileUtility.toStringArray("C:\\Users\\John\\Desktop\\shakespeare.txt", "[^A-Za-z]");
        
        timer.start();
        String[] sortedText = sorter.selectionSort(text);
        timer.stop();
        System.out.println("Execution took " + timer.getTimeInMiliSeconds() + " Milliseconds!!!!");
    }
}
