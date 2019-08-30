package com.simedia.demos;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorsName(){
        StringBuilder result = new StringBuilder();
        result.append("*");
        for (Author author:authors
             ) {
            result.append(author.getName() + " * ");
        }
        String autori = result.toString();
        return autori;
    }
    public String getAuthorEmail(Author author){
        return author.getEmail();
    }
    public char getAuthorGender(Author author){
        return author.getGender();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Book [name = " + name + ", authors = ");
        for (Author author:authors
             ) {
            result.append(author.toString() + ", ");
        }
        result.append("price = " + price + ", quantity = " + qty + "]");
        return result.toString();
    }
}
