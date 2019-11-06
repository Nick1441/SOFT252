/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.HotDrinks;

import javaapplication1.IPUB;

/**
 *
 * @author ngclothier
 */
public abstract class hotDrinks implements IPUB{
    public final void CreateDrink()
    {
        //Step1();
        //Step2();
        //Step3();
        //Step4();
    }
    
    protected void Step1()
    {
        System.out.println("Boil Water.");
    }
    
    protected void Step3()
    {
        System.out.println("Pour Result Into Cup.");
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
