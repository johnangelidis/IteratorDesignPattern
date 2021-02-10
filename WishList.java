public class WishList {
    static final int MAX_ITEMS = 5;
    //private String name;
    private Item[] items;
    private int count = 0;

    /**
     * Constructor that creates a wish list array with a maximum size of 5 items
     * @param name
     */
    public WishList(String name){
        items = new Item[MAX_ITEMS];
    }
    /**
     * Method that adds an item with the given parameters to the wish list. 
     * If the wish list has reached its limit, a new array with twice the size of the first one is created and 
     * it includes all 5 items of the previous array.
     * @param title
     * @param description
     * @param price
     */
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
    /**
     * Method that creates an iterator for the items array
     * @return an iterator for the wish list
     */
    public WishListIterator createIterator(){
        return new WishListIterator(items);
    }

    /**
     * Method that returns the total cost of all items in the wish list
     * @return the total cost
     */
    public double getTotalCost(){
        double totalCost = 0;
        for(int i=0; i<items.length; i++){
            totalCost += items[i].getPrice();
        }
        return totalCost;
    }

    /**
     * Method that returns an array of twice the size of the given array with the same data
     * @param items
     * @return an array of size MAX_ITEMS*2
     */
    private Item[] growArray(Item[] items){
        Item[] moreItems = new Item[MAX_ITEMS*2];
        for(int i=0; i<items.length; i++){
            moreItems[i] = items[i];
        }
        return moreItems;
    }
}
