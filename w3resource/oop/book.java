 package oop;

public class book {

    private String title;
    private String author;
    private double price;

public book(){
    this.title = "unknown";
    this.author = "unknown";
    this.price = 0.0;
}
public book(String title, String author){
    this.title = title;
    this.author = author;
    this.price = 0.0;
}
public book(String title, String author, Double price){

    this.title = title;
    this.author = author;
    this.price = price;
}
public static void main(String[] args){
    book book1 = new book();
    System.out.println("the title of book1 is " + book1.title);
    System.out.println("the author of book1 is " + book1.author);
    System.out.println("the price of book1 is " + book1.price);
    book book2 = new book("harry potter","J. K. Rowling");
    System.out.println("the title of book2 is" + book2.title);
    System.out.println("the author of book2 is " + book2.author);
    System.out.println("the price of book2 is " + book2.price);
    book book3 = new book("harry potter2", "J. K. Rowling",124.25);
    System.out.println("the title of book3 is " + book3.title);
    System.out.println("The author if book3 is " + book3.author);
    System.out.println("the price of book4 is " + book3.price);
}

}