package models;

import annotations.ClassDocumentation;
import annotations.MethodDocumentation;

@ClassDocumentation
public class Nykaa {
    int orders;

    public Nykaa(int orders) {
        this.orders = orders;
    }

    @annotations.MethodDocumentation
    public int getNumOfNykaaOrders() {
        return this.orders;
    }

    /**
     * This method places an order on the Nykaa App
     * @param orderName
     * @return total orders
     */
    @annotations.MethodDocumentation
    public int placeNykaaOrder(String orderName) {
        System.out.println("Placing your Nykaa order" + orderName);

        return ++orders;
    }

    /**
     * This method checks if you're eligible to become a prime Nykaa member and makes you one if you are
     * @param orders
     */
    @MethodDocumentation
    public void becomePrimeMember(int orders) {
        if(orders >= 5)
            System.out.println("Congratulations! You're a prime member!");
    }
}
