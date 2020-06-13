package Provider.ExplicitProvider.DiscountApi;

public class NoDiscount implements Discountable {

    @Override
    public int getDiscount() {
        return 0;
    }
}
