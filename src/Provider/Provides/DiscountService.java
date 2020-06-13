package Provider.Provides;

import Provider.Provides.DiscountApi.Discountable;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class DiscountService {

    Provider<Discountable> provider;

    @Inject
    public DiscountService(Provider<Discountable> provider){

        this.provider = provider;
    }

    public int getTotal(int checkoutTotal){
        int discount = provider.get().getDiscount();
        return checkoutTotal - ((checkoutTotal*discount)/100);
    }
}
