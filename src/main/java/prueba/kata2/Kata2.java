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
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "\t==>\t" + histogram.get(key));
        }
        
    }
    
}
