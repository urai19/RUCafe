package rucafe.project4;

public class Coffee extends MenuItem implements Customizable{
    private int size;
    private boolean cream;
    private boolean syrup;
    private boolean milk;
    private boolean caramel;
    private boolean whippedCream;
    public static final double SHORT_PRICE= 1.69;

    public Coffee(int size, boolean cream, boolean syrup, boolean milk, boolean caramel, boolean whippedCream, int quantity){
        super(SHORT_PRICE,quantity);
        this.size=size;
        this.cream=cream;
        this.syrup=syrup;
        this.milk=milk;
        this.caramel=caramel;
        this.whippedCream=whippedCream;
    }


    @Override
    public boolean add(Object obj) {
        if(obj instanceof String){
            if(obj.equals("cream")){
                cream=true;
                return true;
            }
            if(obj.equals("syrup")){
                syrup=true;
                return true;
            }
            if(obj.equals("milk")){
                milk=true;
                return true;
            }
            if(obj.equals("caramel")){
                caramel=true;
                return true;
            }
            if(obj.equals("whipped cream")){
                whippedCream=true;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        if(obj instanceof String){
            if(obj.equals("cream")){
                cream=false;
                return true;
            }
            if(obj.equals("syrup")){
                syrup=false;
                return true;
            }
            if(obj.equals("milk")){
                milk=false;
                return true;
            }
            if(obj.equals("caramel")){
                caramel=false;
                return true;
            }
            if(obj.equals("whipped cream")){
                whippedCream=false;
                return true;
            }
        }
        return false;
    }

    @Override
    public double itemPrice() {
        this.priceOfItem=SHORT_PRICE+(size*0.40);
        if(cream) this.priceOfItem+=0.30;
        if(syrup) this.priceOfItem+=0.30;
        if(milk) this.priceOfItem+=0.30;
        if(caramel) this.priceOfItem+=0.30;
        if(whippedCream) this.priceOfItem+=0.30;
        return this.priceOfItem*quantity;
    }
}
