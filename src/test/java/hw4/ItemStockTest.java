package hw4;

import hw4.shop.Item;
import hw4.shop.StandardItem;
import hw4.storage.ItemStock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashMap;

public class ItemStockTest {
    Item item = new StandardItem(1, "a", 1, "a", 1);
    ItemStock itemStock = new ItemStock(item);
    HashMap<Integer, ItemStock> stock;

    @Test
    public void ItemStock_constructor_passed(){
        Assertions.assertEquals(0, itemStock.getCount());
    }

    @ParameterizedTest(name = "{0} plus {1} should be equal to {2}")
    @CsvSource({"3, 5, 8", "0, 0, 0"})
    public void IncreaseItemCount_addsA_addsB_returnsC(int a, int b, int c){
        itemStock.IncreaseItemCount(a);
        itemStock.IncreaseItemCount(b);
        Assertions.assertEquals(c, itemStock.getCount());

    }

    @ParameterizedTest(name = "original state minus {0} should be equal to {1}")
    @CsvSource({"2, -2", "0, 0"})
    public void decreaseItemCount_decreaseByA_returnB(int a, int b){
        itemStock.decreaseItemCount(a);
        Assertions.assertEquals(b, itemStock.getCount());
    }
}
