package Provider.Provides;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args){
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        DiscountService service = guice.getInstance(DiscountService.class);
        System.out.println(service.getTotal(100));
    }
}
