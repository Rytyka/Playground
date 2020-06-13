package Provider.CustomFactory.DiscountApi;

public class NightOwlDiscount implements Discountable {
    @Override
    public int getDiscount() {
        return 35;
    }
}
