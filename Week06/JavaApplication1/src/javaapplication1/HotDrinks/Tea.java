/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.HotDrinks;

/**
 *
 * @author ngclothier
 */
public class Tea extends hotDrinks{
    @Override
    protected void Step2()
    {
        System.out.println("Steep Tea In Water.");
    }
    
    @Override
    protected void Step4()
    {
        System.out.println("Add Lemon.");
    }
}
