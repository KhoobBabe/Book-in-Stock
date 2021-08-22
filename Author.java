package com.khubaib;

/**
 * Code author: Khubaib Ahmad Qureshy
 * code takes the info and prints it, utilizing the concepts of composition
 */

//class Author
class Author{

    //instance variable
    String name;
    String email;
    Character gender;

    //constructor
    Author(String name,String email, Character gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    //ToString
    public String toString() {
        return "Author name = " + name +
                "\nE-mail = " + email +
                "\nGender = " + gender;

    }
}


//class Book
class Book1 {

    //instance variable
    String name;
    Author author;
    double price;
    int qtyInStock = 0;

    //constructor without quantity of books
    Book1(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //constructor with quantity of books
    Book1(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.price = price;
        this.author = author;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String toString() {
        return "Book name = " + name  +
                "\n" + author +
                "\nPrice = Rs. " + price +
                "\nAvailable in stock = " + qtyInStock;
    }
}

//testing class
class BookTesting {

    public static void main(String[] args) {

        //Author object
        Author author = new Author("Umera ahmed", "umahmed@yahoo.com", 'F');

        //Book object
        Book1 book = new Book1("Mus'haf", author, 695, 17);

        //Printing the info
        System.out.println(book);

    }
}
