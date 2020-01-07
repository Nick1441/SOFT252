/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Other;

/**
 *
 * @author Nick1
 */ 
public class Medicine {
    String Name;
    Integer Stock;

    public Medicine(String Name, Integer Stock) {
        this.Name = Name;
        this.Stock = Stock;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer Stock) {
        this.Stock = Stock;
    }
    
    
}
