package hw4.storage;

import hw4.shop.*;


/**
 * Auxiliary class for item storage
 */
public class ItemStock {
    private Item refItem;
    private int count;
    
    public ItemStock(Item refItem) {
        this.refItem = refItem;
        count = 0;
    }
    
    @Override
    public String toString() {
        return "STOCK OF ITEM:  "+refItem.toString()+"    PIECES IN STORAGE: "+count;
    }
    
    public void IncreaseItemCount(int x) {
        count += x;
    }
    
    public void decreaseItemCount(int x) {
        count -= x;
    }
    
    public int getCount() {
        return count;
    } // musel jsem zmenit na public, jinak nemam co testovat
    
    Item getItem() {
        return refItem;
    }
}