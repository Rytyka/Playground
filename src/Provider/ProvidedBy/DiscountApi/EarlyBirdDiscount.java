package Provider.ProvidedBy.DiscountApi;

public class EarlyBirdDiscount implements Discountable {
    @Override
    public int getDiscount() {
        return 35;
    }
}
