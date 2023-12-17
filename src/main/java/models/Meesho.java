package models;

/**
 * This class is for Meesho Shopping App
 */
public class Meesho {
    int orders;

    public Meesho(int orders) {
        this.orders = orders;
    }

    /**
     * This method returns the number of orders that Meesho app has received yet
     * @return number of orders
     */
    public int getNumOfMeeshoOrders() {
        return this.orders;
    }

    /**
     * This method places an order on the Meesho App
     * @param orderName
     * @return total orders
     */
    public int placeMeeshoOrder(String orderName) {
        System.out.println("Placing your Meesho order" + orderName);

        return ++orders;
    }

}
