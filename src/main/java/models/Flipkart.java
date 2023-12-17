package models;

/**
 * This class is for Flipkart shopping app
 */
public class Flipkart {
    int orders;


    public Flipkart(int orders) {
        this.orders = orders;
    }

    /**
     *
     * @returns the number of orders on Flipkart App
     */
    @annotations.MethodDocumentation
    public int getNumOfFlipkartOrders() {
        return this.orders;
    }

    /**
     *
     * @param orderName
     * @return total after placing an order on Flipkart
     */
    @annotations.MethodDocumentation
    public int placeFlipkartOrder(String orderName) {
        System.out.println("Placing your Nykaa order");

        return ++orders;
    }

    /**
     *
     * @param groceries
     */
    public void buyGroceries(String[] groceries) {
        System.out.println("You're about to buy" + groceries.length);
    }
}
