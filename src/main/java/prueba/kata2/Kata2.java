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
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        for (int i : histogram.keySet()) {
            System.out.println(i + "\t==>\t" + histogram.get(i));
        }
        
    }
    
}
