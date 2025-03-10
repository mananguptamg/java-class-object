import java.util.Scanner;

class MobilePhone {
    private final String brand;
    private final String model;
    private final double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brand: ");
        String brand = sc.nextLine();

        System.out.println("Enter the model: ");
        String model = sc.nextLine();

        System.out.println("Enter the price: ");
        double price = sc.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayDetails();

        sc.close();
    }
}

//Sample Output
//Enter the brand:
//Apple
//Enter the model:
//        16 pro max
//Enter the price:
//        150000
//Brand: Apple
//Model: 16 pro max
//Price: 150000.0
