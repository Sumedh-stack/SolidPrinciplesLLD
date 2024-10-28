package org.InterfaceSegmentPrinciple.GoodCode;


/**
 * Here waiter will get only his methods no forceful implementation
 */
public interface WaiterInterface {
    void serveCustomers();
    void takeOrder();
}


interface ChefInterface{
    void cookfood();
    void decideMenu();
}


class waiter implements WaiterInterface {

    @Override
    public void serveCustomers() {

    }

    @Override
    public void takeOrder() {

    }
}

class chef implements ChefInterface{

    @Override
    public void cookfood() {

    }

    @Override
    public void decideMenu() {

    }
}