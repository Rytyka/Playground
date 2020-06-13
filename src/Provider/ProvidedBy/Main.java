package Provider.ProvidedBy;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main (String[] args){

        Injector guice = Guice.createInjector();
        DiscountService service = guice.getInstance(DiscountService.class);
        System.out.println(service.getTotal(100));

    }
}
