package Inject;

import Inject.DiscountApi.Discountable;
import com.google.inject.Inject;

public class CheckoutService {

    private final Discountable discountable;

    @Inject
    public CheckoutService(Discountable discountable){
        this.discountable = discountable;
    }

    public double checkout(double shoppingCartTotal){
        double totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discountable.getDiscount());
        System.out.println("Shopping cart total initially was $" +  shoppingCartTotal + " and discount received "
                                   + discountable.getDiscount()*100+ "%."
                                   + " Total after discount is now $" + totalAfterDiscount + ".");

        return totalAfterDiscount;
    }
}
