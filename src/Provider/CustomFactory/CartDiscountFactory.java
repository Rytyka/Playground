package Provider.CustomFactory;

import Provider.CustomFactory.DiscountApi.Discountable;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.time.LocalTime;
import java.util.Map;
import static Provider.CustomFactory.DiscountOption.EARLY_BIRD_DISCOUNT;
import static Provider.CustomFactory.DiscountOption.NIGHT_OWL_DISCOUNT;
import static Provider.CustomFactory.DiscountOption.NO_DISCOUNT;

@Singleton
public class CartDiscountFactory implements DiscountFactory{

    Map<DiscountOption, Discountable> mapBinder;

    @Inject
    CartDiscountFactory(Map<DiscountOption, Discountable> mapBinder){
        this.mapBinder = mapBinder;
    }

    @Override
    public Discountable getDiscount(ShoppingCart cart){
        int currentHour = LocalTime.now().getHour();
        if(isEarlyHour(currentHour)){
            return mapBinder.get(EARLY_BIRD_DISCOUNT);
        }
        else if(isLateHour(currentHour)){
            return mapBinder.get(NIGHT_OWL_DISCOUNT);
        }
        return mapBinder.get(NO_DISCOUNT);
    }

    public boolean isEarlyHour(int currentHour){
        if(currentHour>4 && currentHour <=9){
            return true;
        }
        return false;
    }

    public boolean isLateHour(int currentHour){
        if(currentHour>=0 && currentHour <=4){
            return true;
        }
        return false;
    }

}
