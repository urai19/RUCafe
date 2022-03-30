/**
 * The MenuItem class is the superclass of all menu items such as donuts and coffee.
 * Stores the price of the item and the quantity.
 * @author Udayan Rai, Garvit Gupta
 */
package rucafe.project4;

public class MenuItem {
    protected double priceOfItem;
    protected int quantity;

    /**
     * Constructor for the MenuItem class.
     * Takes in price of item and quantity.
     * @param priceOfItem price of an item
     * @param quantity quantity desired
     */
    public MenuItem(double priceOfItem, int quantity){
        this.priceOfItem=priceOfItem;
        this.quantity=quantity;
    }

    /**
     * This method
     * @return
     */
    public double itemPrice(){
        return quantity*priceOfItem;
    }


}
