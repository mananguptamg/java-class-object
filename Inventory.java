import java.util.Scanner;

class Item {
    private final int code;
    private final String name;
    private final double price;

    public Item(int code, String name, double price) {
        if (code <= 0) {
            throw new IllegalArgumentException("Code must be positive.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void totalPrice(Item[] items) {
        double total = 0;
        for (Item i : items) {
            if (i != null) { // null check
                total += i.price;
            }
        }
        System.out.println("Total Price: " + total);
    }
}

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the code: ");
            int code = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            System.out.println("Enter the price: ");
            double price = sc.nextDouble();

            items[i] = new Item(code, name, price);
            items[i].displayDetails();
        }

        Item.totalPrice(items);
        sc.close();
    }
}

//Sample Output
//Enter the number of items:
//        2
//Enter the code:
//        11
//Enter the name:
//rice
//Enter the price:
//        33
//Code: 11
//Name: rice
//Price: 33.0
//Enter the code:
//        12
//Enter the name:
//sugar
//Enter the price:
//        50
//Code: 12
//Name: sugar
//Price: 50.0
//Total Price: 83.0
