package Provider.ProvidedBy.DiscountApi;

public class NoDiscount implements Discountable{
    @Override
    public int getDiscount() {
        return 0;
    }
}
