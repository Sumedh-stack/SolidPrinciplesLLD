package org.SingleResponsibilityPrinciple.GoodCode;

public class InvoiceDao {
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDB(){
        // save the data into DB
    }

}
