package Provider.Provides.DiscountApi;

public class NightOwlDiscount implements Discountable{
    @Override
    public int getDiscount() {
        return 35;
    }
}
