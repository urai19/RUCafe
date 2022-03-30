package rucafe.project4;

public class YeastDonut extends MenuItem{
    private String flavor;
    public static final double YEAST_PRICE=1.59;

    public YeastDonut(String flavor,int quantity){
        super(YEAST_PRICE,quantity);
        this.flavor=flavor;
    }

    @Override
    public double itemPrice() {
        return super.itemPrice();
    }
}
