/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumOfPrimes;

import java.util.Scanner;
import git_uebungen_eratosthenesprimesieve.*;
import java.util.List;

/**
 *
 * @author matth
 */
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        
        
        int num;
        boolean valid = false;
        do{
            System.out.println("Gibt eine Zahl ein:");
            num = s.nextInt();
            
            if (num > 2 && num % 2 == 0){
                valid = true;
            }
            else{
                System.out.println("Die eingegeben Zahl muss groeßer 2 und gerade sein!!!");
            }
        }while(!valid);

        
        
        
        EratosthenesPrimeSieve generator = new EratosthenesPrimeSieve(num);
        
        List<Integer> primes = generator.getPrimes();
        
        
        
    }
}
