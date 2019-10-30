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
        /**
        PhysicalStockItem objPhysicalItem = new PhysicalStockItem("Snuff: A Diskworld Book By Terry Pratchett", 0);
        ServiceStockItem objVirtualItem = new ServiceStockItem("Wintersmith: A Diskworld eBook By Terry Pratchett");
        
        String strMessage = objPhysicalItem.getName() + ", Is In Stock = " + objPhysicalItem.isInStock() + ", Qty In Stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        strMessage = objVirtualItem.getName() + ", is In Stock = " + objVirtualItem.isInStock() + ", Qty in Stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
       
        
        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Meanual");
        StockItem objTestItem2 = new PhysicalStockItem("Halo 3", 100);
        StockItem objTestItem3 = new ServiceStockItem("Delivery");
        
        if (objTestItem1.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 1 is a PHYSICAL Item");
        }else{
            System.out.println("Item 1 is a SERVICE Item");
        }
        
        if (objTestItem2.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 2 is a PHYSICAL Item");
        }else{
            System.out.println("Item 2 is a SERVICE Item");
        }
                
        if (objTestItem3.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 3 is a PHYSICAL Item");
        }else{
            System.out.println("Item 3 is a SERVICE Item");
        }
        * */
        
        StockItem objTestItem4 = new PhysicalStockItem("Minecraft Meanual", 10);
        StockItem objTestItem5 = new ServiceStockItem("Minecraft Online");
        AnObserver AnOb = new AnObserver();
        objTestItem4.registerObserver(AnOb);
        objTestItem5.registerObserver(AnOb);
        System.out.println("Changing Quantity of the physcial Item");
        objTestItem4.setQuantityInStock(12);
        System.out.println("Changing Price of the Servive Item");
        objTestItem5.setSellingPrice(14.99);
        
        
    }
    
}
