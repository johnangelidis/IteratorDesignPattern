public class WishListIterator implements Iterator {
    private Item[] items;
    private int position;

    public WishListIterator(Item[] items){
        this.items = items;
    }

    public boolean hasNext(){
        if(position >= items.length || items[position]==null){
            return false;
        }
        else{
            return true;
        }
    }

    public Item next(){
        Item item = items[position];
        position++;
        return item;
        
    }
}
