package Provider.DiIntoProvider;

import Provider.ProvidedBy.DiscountApi.Discountable;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Map;
import java.util.Random;

public class ProviderClass implements Provider<Discountable> {

    private final Map<Integer,Discountable> mapBinder;
    private final Random rand;

    @Inject
    public ProviderClass(Map<Integer,Discountable> mapBinder, Random rand){
            this.mapBinder = mapBinder;
            this.rand = rand;
    }

    @Override
    public Discountable get(){
        return mapBinder.get(rand.nextInt(mapBinder.size()));
    }
}
