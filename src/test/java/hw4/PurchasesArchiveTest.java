package hw4;

import hw4.archive.ItemPurchaseArchiveEntry;
import hw4.archive.PurchasesArchive;
import hw4.shop.Item;
import hw4.shop.Order;
import hw4.shop.ShoppingCart;
import hw4.shop.StandardItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collection;

public class PurchasesArchiveTest {
    PurchasesArchive purchasesArchive = new PurchasesArchive();

    @Test
    public void printItemPurchaseStatisticsTest(){

        String expected_result = "ITEM PURCHASE STATISTICS:";

        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new StandardItem(1, "item1", 100, "test_item", 3);
        shoppingCart.addItem(item1);
        Order order = new Order(shoppingCart, "test_customer", "test_customer_address");
        purchasesArchive.putOrderToPurchasesArchive(order);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        final PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        purchasesArchive.printItemPurchaseStatistics();
        String result = outContent.toString();

        Collection<ItemPurchaseArchiveEntry> itemEntries = purchasesArchive.itemPurchaseArchive.values();
//        for (Item item:shoppingCart.getCartItems()) {
////            expected_result += "ITEM" + "Item   ID "+item.getID()+"   NAME "+item.getName()+"   CATEGORY "+item.getCategory() + "HAS BEEN SOLD "+soldCount+" TIMES";
//            expected_result += "\n" + "ITEM  " + item.toString() + "   HAS BEEN SOLD "+" TIMES";
//        }
        expected_result += "\r\n";

        for(ItemPurchaseArchiveEntry e : itemEntries) expected_result += (e.toString()) + "\r\n";
        Assertions.assertEquals(expected_result, result);

        System.setOut(originalOut); // reset
    }

    @Test
    public void getHowManyTimesHasBeenItemSoldTest(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new StandardItem(1, "item1", 100, "test_item", 3);
        shoppingCart.addItem(item1);
        Order order = new Order(shoppingCart, "test_customer", "test_customer_address");
        purchasesArchive.putOrderToPurchasesArchive(order);

        int num = purchasesArchive.getHowManyTimesHasBeenItemSold(item1);
        Assertions.assertEquals(1, num);
    }

    @Test
    public void putOrderToPurchasesArchive(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new StandardItem(1, "item1", 100, "test_item", 3);
        shoppingCart.addItem(item1);
        Order order = new Order(shoppingCart, "test_customer", "test_customer_address");

        purchasesArchive.putOrderToPurchasesArchive(order);
        Order resulting_order = purchasesArchive.orderArchive.get(0);
        Assertions.assertTrue(order.equals(resulting_order));
        Assertions.assertEquals(1, purchasesArchive.getHowManyTimesHasBeenItemSold(item1));
    }

    @Test
    public void MockOrderArchiveTest(){

    }
}
