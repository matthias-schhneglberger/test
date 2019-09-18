/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_uebungen_eratosthenesprimesieve;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matth
 */
public class EratosthenesPrimeSieve {

    public EratosthenesPrimeSieve(int border) {
        generateNumbers(border);
    }
    
    
//    public static void main(String[] args){
//        List<Integer> prims = generateNumbers(10);
//        
//        for (int i : prims){
//            System.out.println(i);
//        }
//    }

    
    
    public static List<Integer> generateNumbers(int border) {
        List<Integer> finalList = new ArrayList();
        boolean[] bool = new boolean[border];

        for (int i = 0; i < bool.length; i++) {
            bool[i] = true;
        }
        for (int i = 2; i < Math.sqrt(border); i++) {
            if (bool[i] == true) {
                for (int j = (i * i); j < border; j = j + i) {
                    bool[j] = false;
                }
            }
        }

        for (int i = 2; i < bool.length; i++) {
            if (bool[i] == true) {
                finalList.add(i);
            }
        }

        return finalList;

    }
    
    
    
    public static boolean isPrime(int num) {//https://java2blog.com/java-isprime/
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
