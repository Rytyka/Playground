package Provider.CustomFactory.DiscountApi;

public class NoDiscount implements Discountable {
    @Override
    public int getDiscount() {
        return 0;
    }
}
