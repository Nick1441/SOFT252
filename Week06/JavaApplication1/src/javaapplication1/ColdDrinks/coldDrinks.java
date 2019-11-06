/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ColdDrinks;

import javaapplication1.IPUB;

/**
 *
 * @author ngclothier
 */
public abstract class coldDrinks implements IPUB{
    public final void CreateDrink()
    {
        //Step1();
        //Step2();
    }
    
    protected void Step2()
    {
        System.out.println("Pour Drink Into Glass.");
    }
    
    @Override
    public void ServeDrink()
    {
        Step1();
        Step2();
    }
    protected abstract void Step1();
    
}
