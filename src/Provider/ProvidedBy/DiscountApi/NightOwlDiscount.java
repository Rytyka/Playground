package Provider.ProvidedBy.DiscountApi;

public class NightOwlDiscount implements Discountable {
    @Override
    public int getDiscount() {
        return 25;
    }
}
