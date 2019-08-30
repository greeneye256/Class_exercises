package com.simedia.demos;

public class Main {

    public static void main(String[] args) {
        Author john = new Author("John Snow","johnsnow@got.org",'m');
        Author ion = new Author("Ion Tembelu", "iontemb@yahoo.com", 't');
        Author ghe = new Author("Gheorghe Din Buda", "gheorghebuda@yahoo.com", 't');
//        System.out.println(john.getName() + " " + john.getEmail() + " " + john.getGender());
//        john.setEmail("johnsnowthereal@got.org");
//        System.out.println(john.getEmail());
//        System.out.println(john);
//        Book got = new Book("Game of Thrones", john, 34.5, 100);
//        System.out.println(got);
//        got.setPrice(29.95);
//        got.setQty(28);
//        System.out.println("name is: " + got.getName());
//        System.out.println("price is: " + got.getPrice());
//        System.out.println("qty is: " + got.getQty());
//        System.out.println("Author is: " + got.getAuthor());  // Author's toString()
//        System.out.println("Author's name is: " + got.getAuthor().getName());
//        System.out.println("Author's email is: " + got.getAuthor().getEmail());
//        Book parfumul = new Book("Parfumul",new Author("Patrick Suskind","patricksuskind@gmail.com",'m'),53.12);
//        System.out.println(parfumul);
//        Author patrick = parfumul.getAuthor();
//        System.out.println(patrick);
        Author[] authors = {john,ion,ghe};
        Book metodaJava = new Book("Metoda perfecta pentru a invata Java in 2 zile",authors,32.4,0);
        System.out.println(metodaJava.getAuthorsName());
        System.out.println(metodaJava);
        Author[] authors2 = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

    }
}
