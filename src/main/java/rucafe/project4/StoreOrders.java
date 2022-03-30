package rucafe.project4;

import java.util.ArrayList;

public class StoreOrders implements Customizable {

    private ArrayList<Order> orderList;
    private int numOrders;

    public StoreOrders(){
        this.orderList = new ArrayList<>();
        numOrders = 0;

    }

    @Override
    public boolean add(Object obj) {
        if (obj instanceof Order){
            Order item = (Order) obj;
            orderList.add(item);
            numOrders++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        if (numOrders > 0) {
            if (obj instanceof Order) {
                Order item = (Order) obj;
                orderList.remove(item);
                numOrders--;
                return true;
            }
        }
        return false;
    }
}
