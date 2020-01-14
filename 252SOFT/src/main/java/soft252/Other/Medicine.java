package soft252.Other;

public class Medicine {
    private String Name;
    private Integer Stock;

    //Constructor Used When Creating New Medicine.
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
