/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakespear.sorting;

/**
 *
 * @author John
 */
public class StopWatch {

    private long startTime;
    private long endTime;
    
    public StopWatch() {
        
    }
    
    public void start() {
        startTime = System.nanoTime();
    }
    
    public void stop() {
        endTime = System.nanoTime();
    }
    
    public long getTimeInMiliSeconds() {
        return ((endTime - startTime) / 100000);
    }
    
    public long getTimeInNanoSeconds() {
        return endTime - startTime;
    }
    
    public void reset() {
        startTime = 0;
        endTime = 0;
    }
    
    
    
    
}
