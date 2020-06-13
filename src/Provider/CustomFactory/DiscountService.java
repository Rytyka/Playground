package Provider.CustomFactory;

import Provider.CustomFactory.DiscountApi.Discountable;
import com.google.inject.Inject;

public class DiscountService {

    private final DiscountFactory discountFactory;

    @Inject
    public DiscountService(DiscountFactory discountFactory){
        this.discountFactory = discountFactory;
    }


    public int getTotal(ShoppingCart cart){
        Discountable discountable = discountFactory.getDiscount(cart);
        int cartTotal = cart.getCartTotal();
        int discount = discountable.getDiscount();

        return cartTotal - ((cartTotal*discount)/100);

    }
}
