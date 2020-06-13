package Inject.DiscountApi;

public class NightOwlDiscount implements Discountable {

    @Override
    public double getDiscount(){
        return 0.25;
    }
}
