package org.SingleResponsibilityPrinciple.GoodCode;

public class InvoicePrinter {
    Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice=invoice;
    }
    public void printInvoice(){
        // save the data into DB
    }
}
