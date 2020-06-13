package Provider.ExplicitProvider;

import Provider.ExplicitProvider.DiscountApi.Discountable;
import Provider.ExplicitProvider.DiscountApi.EarlyBirdDiscount;
import Provider.ExplicitProvider.DiscountApi.NightOwlDiscount;
import Provider.ExplicitProvider.DiscountApi.NoDiscount;
import com.google.inject.Provider;
import java.time.LocalTime;

public class ProviderClass implements Provider<Discountable> {

    public boolean isEarly(int currentHour){
        if(currentHour > 4 && currentHour <= 9){
            return true;
        }
        return false;
    }

    public boolean isLate(int currentHour){
        if(currentHour >= 0 && currentHour <= 4){
            return true;
        }
        return false;
    }

    @Override
    public Discountable get() {
        int currentHour = LocalTime.now().getHour();
        if (isEarly(currentHour)) {
            return new EarlyBirdDiscount();
        }
        else if (isLate(currentHour)){
            return new NightOwlDiscount();
        }
        return new NoDiscount();
    }
}
