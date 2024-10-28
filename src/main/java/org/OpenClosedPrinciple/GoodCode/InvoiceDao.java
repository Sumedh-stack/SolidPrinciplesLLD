package org.OpenClosedPrinciple.GoodCode;

/**
 * Now this class is already tested now we are adding one more function saveToFile so its violating open close principle which states
 * class should be open for extension but not for modification
 */
public class InvoiceDao {

    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }

    public void saveToDB(){
        // savetoDb
    }

    public void saveToFile(){
        // savetoFile
    }
}
