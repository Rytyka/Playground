package Provider.ExplicitProvider;

import Provider.ExplicitProvider.DiscountApi.Discountable;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class CheckoutService {
    public final Provider<Discountable> provider;

    @Inject
    public CheckoutService(Provider<Discountable> provider){
        this.provider = provider;
    }

    public int getDiscount(int checkoutTotal){
        int discount = provider.get().getDiscount();
        return checkoutTotal - ((checkoutTotal*discount)/100);
    }
}
