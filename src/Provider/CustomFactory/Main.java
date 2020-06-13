package Provider.CustomFactory;

import Provider.CustomFactory.DiscountApi.DiscountGuiceModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.time.LocalTime;

public class Main {

    DiscountService service;

    @Inject
    public Main(DiscountService discountService){
        this.service = discountService;

    }

    public void start(){
        System.out.println(service.getTotal(getInput()));
    }

    public static void main(String[] args){
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        Main main = guice.getInstance(Main.class);
        main.start();

    }

    public ShoppingCart getInput(){
        ShoppingCart cart = new ShoppingCart();
        cart.setCartTotal(100);
        cart.setCheckoutTime(LocalTime.now());
        return cart;
    }

}
