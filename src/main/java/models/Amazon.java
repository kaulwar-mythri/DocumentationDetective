package models;

import annotations.ClassDocumentation;
import annotations.MethodDocumentation;

/**
 * This class is for Amazon Shopping App
 */
@ClassDocumentation
public class Amazon {
    int orders;

    public Amazon(int orders) {
        this.orders = orders;
    }

    /**
     * This method returns the number of orders thet Amazon shopping app has received yet
     * @return number of orders
     */
    @MethodDocumentation
    public int getNumOfAmazonOrders() {
        return this.orders;
    }

    /**
     * This method places an order on the Amazon Shopping App
     * @param orderName
     * @return total orders
     */
    @MethodDocumentation
    public int placeAmazonOrder(String orderName) {
        System.out.println("Placing your Amazon order" + orderName);

        return ++orders;
    }

}
