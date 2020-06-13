package Provider.ExplicitProvider;

import Provider.ExplicitProvider.DiscountApi.Discountable;
import com.google.inject.AbstractModule;

public class DiscountGuiceModule extends AbstractModule {
    @Override
    public void configure(){
        bind(Discountable.class).toProvider(ProviderClass.class);
    }
}
