package Provider.CustomFactory;

import java.time.LocalTime;

public class ShoppingCart {
    private LocalTime checkoutTime;
    private int cartTotal;

    public int getCartTotal() {
        return cartTotal;
    }

    public LocalTime getCheckoutTime(){
        return checkoutTime;
    }

    public void setCartTotal(int cartTotal){
        this.cartTotal = cartTotal;
    }

    public void setCheckoutTime(LocalTime checkoutTime) {
        this.checkoutTime = checkoutTime;
    }
}
