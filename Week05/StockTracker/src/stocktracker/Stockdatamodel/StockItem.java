/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.Stockdatamodel;
import Utilities.IObserver;
import Utilities.ISubject;
import java.util.ArrayList;
/**
 *
 * @author ngclothier
 */
public abstract class StockItem implements ISubject{
    
    protected String name = "UNKNOWN";
    protected Integer quantityInStock = 0;
    protected Double SellingPrice = 1000000.00;
    protected Double CostPrice = 1000000.00;
    private ArrayList<IObserver> observers = null;
    
    public abstract StockType getItemType();
    public StockItem () 
    {}
    
    public StockItem(String Name)
    {
        this.name = Name;
    }
    
    public StockItem(String name, Integer qty)
    {
        this.name = name;
        this.quantityInStock = qty;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
        {
            this.name = name;
            notifyObservers();
        }
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if (quantityInStock != null && quantityInStock >= 0)
        {
            this.quantityInStock = quantityInStock;
            notifyObservers();
        }
    }

    public Double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(Double SellingPrice) {
        if (SellingPrice != null && SellingPrice >= this.CostPrice && SellingPrice >= 0) 
        {
            this.SellingPrice = SellingPrice;
            notifyObservers();
        }
        notifyObservers();
    }

    public Double getCostPrice() {
        return CostPrice;
    }

    public void setCostPrice(Double CostPrice) {
        this.CostPrice = CostPrice;
        notifyObservers();
    }
    
    public Boolean isInStock()
    {
        Boolean inStock = false;
        if (this.quantityInStock > 0)
        {
            inStock = true;
        }
        return inStock;
    }           
    @Override
    public Boolean registerObserver(IObserver o)
    {
        Boolean blnAdded = false;
        if (o != null){
            if(this.observers == null){
                this.observers = new ArrayList<>();
        }
        blnAdded = this.observers.add(o);
        }
        return blnAdded;
        
    }
    
    @Override
    public Boolean removeObserver(IObserver o)
    {
        Boolean blnRemove = false;
        if (o != null){
            if (this.observers.contains(o)){
                blnRemove = this.observers.remove(o);
            }
        }
        return blnRemove;
    }
    
    @Override
    public void notifyObservers()
    {
        if (this.observers != null && this.observers.size() > 0) {
            for (IObserver currentObserver : this.observers){
                currentObserver.update();
            }
        }
    }
}
