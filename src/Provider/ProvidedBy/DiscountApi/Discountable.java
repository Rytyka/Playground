package Provider.ProvidedBy.DiscountApi;

import Provider.ProvidedBy.DiscountProvider;
import com.google.inject.ProvidedBy;

@ProvidedBy(DiscountProvider.class)
public interface Discountable {
    int getDiscount();
}
