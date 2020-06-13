package Provider.ImplicitProvider;

import Provider.ImplicitProvider.DiscountApi.Discountable;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class CheckoutService {

    public final Provider<Discountable> discountable;

    @Inject
    public CheckoutService(Provider<Discountable> discountable){
        this.discountable = discountable;
    }

    public int getDiscount(int checkoutTotal){
        // We first do a .get() on the provider to get the specific implementation instance.
        // The required implementation here is instantiated only at runtime.
        int discountPercentage = discountable.get().getDiscount();
        return checkoutTotal - ((checkoutTotal * discountPercentage)/100);
    }

}
