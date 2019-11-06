/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.MixedDrinks;

/**
 *
 * @author ngclothier
 */
public class Cocktail extends mixedDrinks{
    @Override
    protected void Step2()
    {
        System.out.println("Add Two Spirits To Glass.");
    }
    
    @Override
    protected void Step4()
    {
        System.out.println("Add Fancy Garnish.");
    }
}
