package models;

import annotations.ClassDocumentation;
import annotations.MethodDocumentation;

/**
 * This class is for Myntra Shopping App
 */
@ClassDocumentation
public class Myntra {
    int orders;

    public Myntra(int orders) {
        this.orders = orders;
    }

    @annotations.MethodDocumentation
    public int getNumOfMyntraOrders() {
        return this.orders;
    }

    @annotations.MethodDocumentation(documentation = "This method places an order on the Myntra App")
    public int placeMyntraOrder(String orderName) {
        System.out.println("Placing your Myntra order" + orderName);

        return ++orders;
    }

    /**
     * This method searches the Myntra databases for products that match your item
     * @param photo
     */
    @MethodDocumentation(documentation = "This method scans a photo to find matching items from the Myntra products")
    public void searchWithCamera(String photo) {
        System.out.println("Trying to search our database for products that match your item");
    }
}