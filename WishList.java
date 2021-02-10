public class WishList {
    static final int MAX_ITEMS = 5;
    //private String name;
    private Item[] items;
    private int count = 0;

    public WishList(String name){
        items = new Item[MAX_ITEMS];
    }

    public void addItem(String title, String description, double price){
        Item item = new Item(title, description, price);
        if(count >= MAX_ITEMS){
            growArray(items);
        }
        else{
            items[count] = item;
            count++;
        }
        
    }

    public WishListIterator createIterator(){
        return new WishListIterator(items);
    }

    public double getTotalCost(){
        double totalCost = 0;
        for(int i=0; i<items.length; i++){
            totalCost += items[i].getPrice();
        }
        return totalCost;
    }

    private Item[] growArray(Item[] items){
        Item[] moreItems = new Item[MAX_ITEMS*2];
        for(int i=0; i<items.length; i++){
            moreItems[i] = items[i];
        }
        return moreItems;
    }
}
