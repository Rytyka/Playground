package Provider.ExplicitProvider;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args){
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService checkoutService = guice.getInstance(CheckoutService.class);
        System.out.println(checkoutService.getDiscount(100));

    }
}
