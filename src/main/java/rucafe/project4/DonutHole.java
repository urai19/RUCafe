package rucafe.project4;

public class DonutHole extends MenuItem{
    private String flavor;
    public static final double HOLE_PRICE=0.39;

    public DonutHole(String flavor,int quantity){
        super(HOLE_PRICE,quantity);
        this.flavor=flavor;
    }

    @Override
    public double itemPrice() {
        return super.itemPrice();
    }
}
