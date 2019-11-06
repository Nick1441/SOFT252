/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.MixedDrinks;

import javaapplication1.IPUB;

/**
 *
 * @author ngclothier
 */
public abstract class mixedDrinks implements IPUB{
    public final void CreateDrink()
    {
        //Step1(); //SAME
        //Step2();
        //Step3(); //SAME
        //Step4();
    }
    
    protected void Step1()
    {
        System.out.println("Add Ice To Glass.");
    }
    
    protected void Step3()
    {
        System.out.println("Add Mixer To Glass.");
    }
    
    @Override
    public void ServeDrink()
    {
        Step1(); //SAME
        Step2();
        Step3(); //SAME
        Step4();
    }
    protected abstract void Step2();
    protected abstract void Step4();
}
