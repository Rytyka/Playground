package Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args){
        // Implementation picked by @ImplementedBy
        // Injector guice = Guice.createInjector(new DiscountGuiceModule());
        Injector guice = Guice.createInjector();
        CheckoutService service = guice.getInstance(CheckoutService.class);

        service.checkout(100);
    }
}
