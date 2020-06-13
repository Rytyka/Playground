package Provider.ImplicitProvider.DiscountApi;

public class NightOwlDiscount implements Discountable {
    @Override
    public int getDiscount() {
        return 35;
    }
}
