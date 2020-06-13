package Provider.ImplicitProvider.DiscountApi;

public class EarlyBirdDiscount implements Discountable {
    @Override
    public int getDiscount() {
        return 25;
    }
}
