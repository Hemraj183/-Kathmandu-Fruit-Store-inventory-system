/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.AppliancesInfo;

/**
 *
 * @author Lenovo-i5
 */
public class FruitInventoryData {
    private String FruitID;
    private String Date;
    private String Name;
    private String Range;
    private String Types;
    private String Quantity;
    private String Price;

    public FruitInventoryData(String FruitID, String Date, String Name, String Range, String Types, String Quantity, String Price) {
        this.FruitID = FruitID;
        this.Date = Date;
        this.Name = Name;
        this.Range = Range;
        this.Types = Types;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public String getFruitID() {
        return FruitID;
    }

    public String getDate() {
        return Date;
    }

    public String getName() {
        return Name;
    }

    public String getRange() {
        return Range;
    }

    public String getTypes() {
        return Types;
    }

    public String getQuantity() {
        return Quantity;
    }

    public String getPrice() {
        return Price;
    }
   

    
    
    
}
