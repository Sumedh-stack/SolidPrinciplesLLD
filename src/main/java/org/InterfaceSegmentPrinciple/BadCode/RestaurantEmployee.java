package org.InterfaceSegmentPrinciple.BadCode;

/**
 * class should not implement unnecessary functions
 */
public interface RestaurantEmployee {
    void washDishes();
    void serveCustomers();
    void cookFood();
}

class waiter implements RestaurantEmployee{
    @Override
    public void washDishes(){
        // not my job
    }

    @Override
    public void  serveCustomers(){
        System.out.println("Serving the customer");
    }

    @Override
    public void cookFood() {
     // not my job
    }

}
