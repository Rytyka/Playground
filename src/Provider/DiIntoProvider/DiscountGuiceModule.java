package Provider.DiIntoProvider;

import Provider.ProvidedBy.DiscountApi.Discountable;
import Provider.ProvidedBy.DiscountApi.EarlyBirdDiscount;
import Provider.ProvidedBy.DiscountApi.NightOwlDiscount;
import Provider.ProvidedBy.DiscountApi.NoDiscount;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import java.util.Random;

public class DiscountGuiceModule extends AbstractModule {

    @Override
    public void configure(){
        MapBinder<Integer, Discountable> mapBinder = MapBinder.newMapBinder(
                binder(),
                Integer.class, Discountable.class
        );

        mapBinder.addBinding(0).to(NightOwlDiscount.class);
        mapBinder.addBinding(1).to(EarlyBirdDiscount.class);
        mapBinder.addBinding(2).to(NoDiscount.class);

        bind(Random.class).toInstance(new Random());
        bind(Discountable.class).toProvider(ProviderClass.class);

    }
}
