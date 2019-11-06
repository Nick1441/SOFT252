/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author ngclothier
 */
public abstract class LandLord implements IPUB{
    
    public void GetDrink {
        System.out.println("What Can I Get Ya?");
        System.out.println("Options Are -");
        System.out.println(" - Bottle Drink (B)");
        System.out.println(" - Poured Drink (P)");
        System.out.println(" - Tea (T)");
        System.out.println(" - Coffee (C)");
        System.out.println(" - Cocktail (N)");
        System.out.println(" - Mixed Drink (M)");
        System.out.println();
        
        
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        
        if (answer.equals("B")){
            
        }else if (answer.equals("P")){
            
        }else if (answer.equals("T")){
            
        }else if (answer.equals("C")){
            
        }else if (answer.equals("N")){
            
        }else if (answer.equals("M")){
            
        }
    }
}
