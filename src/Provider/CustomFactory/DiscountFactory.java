package Provider.CustomFactory;

import Provider.CustomFactory.DiscountApi.Discountable;
import com.google.inject.ImplementedBy;

@ImplementedBy(CartDiscountFactory.class)
public interface DiscountFactory {
        public Discountable getDiscount(ShoppingCart cart);
}
