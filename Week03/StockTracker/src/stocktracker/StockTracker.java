/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;
import stocktracker.Stockdatamodel.*;
/**
 *
 * @author ngclothier
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PhysicalStockItem objPhysicalItem = new PhysicalStockItem("Snuff: A Diskworld Book By Terry Pratchett", 0);
        ServiceStockItem objVirtualItem = new ServiceStockItem("Wintersmith: A Diskworld eBook By Terry Pratchett");
        
        String strMessage = objPhysicalItem.getName() + ", Is In Stock = " + objPhysicalItem.isInStock() + ", Qty In Stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        strMessage = objVirtualItem.getName() + ", is In Stock = " + objVirtualItem.isInStock() + ", Qty in Stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
    }
    
}
