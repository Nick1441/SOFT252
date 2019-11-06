/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javaapplication1.ColdDrinks.*;
import javaapplication1.HotDrinks.*;
import javaapplication1.MixedDrinks.*;

/**
 *
 * @author ngclothier
 */
public class JavaApplication1 {
//BOTTLE DRINKS
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPUB NewDrink = new LongDrink();
        NewDrink.ServeDrink();
    }
    
}
