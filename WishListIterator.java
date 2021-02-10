/**
 * Class for an iterator that loops through a wish list
 */
public class WishListIterator implements Iterator {
    private Item[] items;
    private int position;

    /**
     * Constructor that creates a wish list iterator for a given wish list of items
     * @param items
     */
    public WishListIterator(Item[] items){
        this.items = items;
    }

    /**
     * Method that returns false if the index is larger than the length or if the value at a given index is null
     * and returns true if there is an item in the next index
     * @return true or false depending on whether there is another value
     */
    public boolean hasNext(){
        if(position >= items.length || items[position]==null){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Method that returns the item at the next index
     * @return the item at the next index
     */
    public Item next(){
        Item item = items[position];
        position++;
        return item;
        
    }
}
