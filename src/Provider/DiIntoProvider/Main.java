package Provider.DiIntoProvider;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Main {

    private final CheckoutService checkoutService;

    @Inject
    Main(CheckoutService service){
        this.checkoutService = service;
    }

    void start(){
        System.out.println(checkoutService.getTotal(100));
    }

    public static void main(String[] args){
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        Main main = guice.getInstance(Main.class);
        main.start();
    }

}
