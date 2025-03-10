import java.util.Scanner;

class Employee{
    private final String name;
    private final int id;
    private  final double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Enter the id: ");
        int id = sc.nextInt();

        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, id, salary);
        emp.displayDetails();

        sc.close();
    }
}

//Sample Output
//Enter the name:
//Manan
//Enter the id:
//        2089
//Enter the salary:
//        290000
//Name: Manan
//ID: 2089
//Salary: 290000.0
