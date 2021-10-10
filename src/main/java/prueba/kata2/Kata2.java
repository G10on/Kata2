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
        String[] data = {"a", "b", "a", "z", "b", "a"};
        Histogram hist = new Histogram(data);
        Map<String, Integer> histogr = hist.getHistogram();
        
        for (String key : histogr.keySet()) {
            System.out.println(key + "\t==>\t" + histogr.get(key));
        }
        
    }
    
}
