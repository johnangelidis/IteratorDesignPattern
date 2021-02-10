public class Item {
    private String title;
    private String description;
    private double price;

    public Item(String title, String description, double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String toString(){
        return "Title: " + title + ", Description: " + description + ", Price: " + price;
    }

    public double getPrice(){
        return this.price;
    }

    public void print(){
        System.out.println("***** " + title + "*****");
        System.out.println(description);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}
