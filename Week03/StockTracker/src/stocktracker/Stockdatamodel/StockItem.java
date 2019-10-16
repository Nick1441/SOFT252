/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.Stockdatamodel;

/**
 *
 * @author ngclothier
 */
public class StockItem {
    
    protected String name = "UNKNOWN";
    protected Integer quantityInStock = 0;
    protected Double SellingPrice = 1000000.00;
    protected Double CostPrice = 1000000.00;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
        {
            this.name = name;
        }
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if (quantityInStock != null && quantityInStock >= 0)
        {
            this.quantityInStock = quantityInStock;
        }
    }

    public Double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(Double SellingPrice) {
        if (SellingPrice != null && SellingPrice >= this.CostPrice && SellingPrice >= 0) 
        {
            this.SellingPrice = SellingPrice;
        }
    }

    public Double getCostPrice() {
        return CostPrice;
    }

    public void setCostPrice(Double CostPrice) {
        this.CostPrice = CostPrice;
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
    
    
}
