import java.util.Scanner;

class Book{
    private final String name;
    private final String author;
    private final int price;

    public Book(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Enter the author: ");
        String author = sc.nextLine();

        System.out.println("Enter the price: ");
        int price = sc.nextInt();

        Book b = new Book(name, author, price);
        b.displayDetails();
    }
}

//Sample Output
//Enter the name:
//Thinking in Java
//Enter the author:
//Bruce Eckel
//Enter the price:
//        200
//Name: Thinking in Java
//Author: Bruce Eckel
//Price: 200
