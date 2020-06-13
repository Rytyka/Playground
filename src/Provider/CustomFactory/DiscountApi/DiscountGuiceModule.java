package Provider.CustomFactory.DiscountApi;

import Provider.CustomFactory.DiscountOption;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import static Provider.CustomFactory.DiscountOption.EARLY_BIRD_DISCOUNT;
import static Provider.CustomFactory.DiscountOption.NIGHT_OWL_DISCOUNT;
import static Provider.CustomFactory.DiscountOption.NO_DISCOUNT;

public class DiscountGuiceModule extends AbstractModule {

    public void configure(){
        MapBinder<DiscountOption, Discountable> mapBinder = MapBinder.newMapBinder(
                binder(), DiscountOption.class, Discountable.class
        );
        mapBinder.addBinding(EARLY_BIRD_DISCOUNT).to(EarlyBirdDiscount.class);
        mapBinder.addBinding(NIGHT_OWL_DISCOUNT).to(NightOwlDiscount.class);
        mapBinder.addBinding(NO_DISCOUNT).to(NoDiscount.class);
    }

}
