package hw4;

import hw4.shop.StandardItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StandardItemTest {
    @Test
    public void StandardItem_constructor_setsLoyaltyPoints(){
        int loyaltyPoints = 2;
        StandardItem standardItem = new StandardItem(1, "a", 1, "a", loyaltyPoints);
        Assertions.assertEquals(loyaltyPoints, standardItem.getLoyaltyPoints());

    }

    @Test
    public void Copy_(){
        StandardItem originalSI = new StandardItem(1, "a", 1, "a", 1);
        StandardItem copiedSI = originalSI.copy();
        Assertions.assertEquals(originalSI.getID(), copiedSI.getID());
        Assertions.assertEquals(originalSI.getName(), copiedSI.getName());
        Assertions.assertEquals(originalSI.getPrice(), copiedSI.getPrice());
        Assertions.assertEquals(originalSI.getCategory(), copiedSI.getCategory());
        Assertions.assertEquals(originalSI.getLoyaltyPoints(), copiedSI.getLoyaltyPoints());
    }

    @ParameterizedTest()
    @CsvSource({"1, 'a', 1, 'a', 2, 1, 'a', 1, 'a', 2"})
    public void Equals_passed(int id1 , String name1, int price1, String category1, int loyaltyPoints1, int id2 , String name2, int price2, String category2, int loyaltyPoints2){
        StandardItem firstStandardItem = new StandardItem(id1, name1, price1, category1, loyaltyPoints1);
        StandardItem secondStandardItem = new StandardItem(id2, name2, price2, category2, loyaltyPoints2);
        Assertions.assertEquals(true, firstStandardItem.equals(secondStandardItem));
    }
}
