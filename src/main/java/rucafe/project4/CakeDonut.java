package rucafe.project4;

public class CakeDonut extends MenuItem{
    private String flavor;
    public static final double CAKE_PRICE=1.79;

    public CakeDonut(String flavor,int quantity){
        super(CAKE_PRICE,quantity);
        this.flavor=flavor;
    }

    @Override
    public double itemPrice() {
        return super.itemPrice();
    }
}
