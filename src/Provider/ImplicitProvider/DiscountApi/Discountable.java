package Provider.ImplicitProvider.DiscountApi;

import com.google.inject.ImplementedBy;

@ImplementedBy(EarlyBirdDiscount.class)
public interface Discountable {
    int getDiscount();
}
