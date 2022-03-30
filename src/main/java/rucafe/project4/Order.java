package rucafe.project4;

import java.util.ArrayList;


public class Order implements Customizable {

    private ArrayList<MenuItem> itemList;
    private long orderNumber;
    private int numItems;
    private double orderCost;

    public Order(long uniqueNumber) {
        this.itemList = new ArrayList<>();
        this.orderNumber = uniqueNumber;
        this.numItems = 0;
        this.orderCost = 0;
    }

    public long getOrderNumber(){
        return this.orderNumber;
    }

    @Override
    public boolean add(Object obj) {
        if (obj instanceof MenuItem){
            MenuItem item = (MenuItem) obj;
            itemList.add(item);
            numItems++;
            orderCost += item.itemPrice();
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        if (numItems > 0) {
            if (obj instanceof MenuItem) {
                MenuItem item = (MenuItem) obj;
                itemList.remove(item);
                numItems--;
                orderCost -= item.itemPrice();
                return true;
            }
        }
        return false;
    }
}
