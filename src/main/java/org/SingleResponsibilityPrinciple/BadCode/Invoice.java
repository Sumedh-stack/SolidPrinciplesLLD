package org.SingleResponsibilityPrinciple.BadCode;

import org.SingleResponsibilityPrinciple.GoodCode.Marker;

/*
*
* This class does not have one reason to change it has three reasons to change
* */
public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = ((marker.price)*this.quantity);
        return price;
    }

    public void saveToDB(){
        // save the data into DB
    }

    public void printInvoice(){
        // print the invoice
    }

}





