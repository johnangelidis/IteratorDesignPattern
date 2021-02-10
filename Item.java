/**
 * Class that represents an item
 */
public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Constructor that creates an item with the given parameters
     * @param title
     * @param description
     * @param price
     */
    public Item(String title, String description, double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Method that returns a string with all the variables
     * @return String with all the variables
     */
    public String toString(){
        return "Title: " + title + ", Description: " + description + ", Price: " + price;
    }

    /**
     * Method that returns the price of an item
     * @return price variable
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * Method that prints the final output for a specific item
     */
    public void print(){
        System.out.println("***** " + title + "*****");
        System.out.println(description);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}
