/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.kata2;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author G10
 */
public class Kata2 {
    
    public static void main(String[] args) {
        int[] data = {0, 1, 2, 0, 2, 3, 1, 4, 5, 6, 7, 5, 7, 2};
        Histogram hist = new Histogram(data);
        Map<Integer, Integer> histogr = hist.getHistogram();
        
        for (int key : histogr.keySet()) {
            System.out.println(key + "\t==>\t" + histogr.get(key));
        }
        
    }
    
}
