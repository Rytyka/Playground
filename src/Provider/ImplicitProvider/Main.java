package Provider.ImplicitProvider;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args){

        Injector guice = Guice.createInjector();
        System.out.println(guice.getInstance(CheckoutService.class).getDiscount(100));
    }
}
