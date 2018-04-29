package IddanQs.Main.Week4.Q1;

/**
 * Created by AlonH on 28/05/2017.
 */
public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty = 0;

//  -------------- Constructors --------------
    public Book (String name, Author author, double price) {

        if (author == null) {
            return;
        }
        this.name = name;
        this.price = price;
        this.author = author;

    }

    public Book (String name, Author author, double price, int qty) {

        if (author == null) {
            return;
        }
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.author = author;
    }

//  -------------- Methods --------------
    public String toString() {

        return "Book [name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
    }


//  -------------- Getters --------------
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

//  -------------- Setters --------------

    public void setQty(int qty) {
        this.qty = qty;
    }



}
