package org.SingleResponsibilityPrinciple.GoodCode;

/*
*
* This class does not have one reason to change it has three reasons to change
* */
public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
}





