package Inject;

import com.google.inject.AbstractModule;
import Inject.DiscountApi.Discountable;
import Inject.DiscountApi.NightOwlDiscount;

public class DiscountGuiceModule extends AbstractModule{

    @Override
    public void configure(){
            // Used @ImplementedBy on interface to directly bind.
            bind(Discountable.class).to(NightOwlDiscount.class);
    }

}
