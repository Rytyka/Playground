package Provider.Provides;

import Provider.Provides.DiscountApi.NightOwlDiscount;
import Provider.Provides.DiscountApi.NoDiscount;
import Provider.Provides.DiscountApi.Discountable;
import Provider.Provides.DiscountApi.EarlyBirdDiscount;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import java.time.LocalTime;

public class DiscountGuiceModule extends AbstractModule {
    public void configure(){

    }
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

    @Provides
    public Discountable get(){

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
