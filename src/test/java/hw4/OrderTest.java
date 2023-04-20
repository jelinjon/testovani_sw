package hw4;

import hw4.shop.Item;
import hw4.shop.Order;
import hw4.shop.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderTest {

    @Test
    public void Order_constructorWithValues_passed(){
//        ShoppingCart cart, String customerName, String customerAddress, int state
        ShoppingCart shoppingCart = new ShoppingCart();
        ArrayList<Item> items = shoppingCart.getCartItems();
        String customerName = "customer_name";
        String customerAddress = "customer_address";
        int state = 1;
        Order order = new Order(shoppingCart, customerName, customerAddress, state);

        Assertions.assertEquals(items, order.getItems());
        Assertions.assertEquals(customerName, order.getCustomerName());
        Assertions.assertEquals(customerAddress, order.getCustomerAddress());
        Assertions.assertEquals(state, order.getState());
    }
    @Test()
    public void Order_constructorWithNullValues_passed(){
//        ShoppingCart shoppingCart = new ShoppingCart();
//        Order order = new Order(shoppingCart, null, null, 0);

        Throwable exception = assertThrows(NullPointerException.class, ()-> createWithNullShoppingCart());
    }
    public void createWithNullShoppingCart(){
        Order order = new Order(null, null, null, 0);
    }
}
