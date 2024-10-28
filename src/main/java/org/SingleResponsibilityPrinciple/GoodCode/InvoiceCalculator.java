package org.SingleResponsibilityPrinciple.GoodCode;
/*
*
* This class does not have one reason to change it has three reasons to change
* */
public class InvoiceCalculator {

    private Marker marker;
    private int quantity;

    public InvoiceCalculator(Marker marker, int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    public int calculateTotal(){
        int price = ((marker.price)*this.quantity);
        return price;
    }


}





