package Provider.DiIntoProvider;

import Provider.ProvidedBy.DiscountApi.Discountable;
import com.google.inject.Inject;

public class CheckoutService {

    private final Discountable discountable;

    @Inject
    public CheckoutService(Discountable discountable){
        this.discountable = discountable;
    }

    public int getTotal(int cartTotal){
        int discount = discountable.getDiscount();
        return cartTotal - ((cartTotal*discount)/100);
    }

}
