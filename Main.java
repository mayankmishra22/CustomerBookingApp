import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            System.out.println("Enter the details of Customer 1:");
            String[] input1 = sc.nextLine().split(",");
            Customer customer1 = new Customer(
                    Long.parseLong(input1[0]),
                    input1[1],
                    input1[2],
                    sdf.parse(input1[3]),
                    Double.parseDouble(input1[4]),
                    Double.parseDouble(input1[5]),
                    sdf.parse(input1[6]),
                    Double.parseDouble(input1[7])
            );

            System.out.println("Enter the details of Customer 2:");
            String[] input2 = sc.nextLine().split(",");
            Customer customer2 = new Customer(
                    Long.parseLong(input2[0]),
                    input2[1],
                    input2[2],
                    sdf.parse(input2[3]),
                    Double.parseDouble(input2[4]),
                    Double.parseDouble(input2[5]),
                    sdf.parse(input2[6]),
                    Double.parseDouble(input2[7])
            );

            System.out.println("\nDetails of customer 1:");
            customer1.printDetails();

            System.out.println("\nDetails of customer 2:");
            customer2.printDetails();

            System.out.println();
            if (customer1.equals(customer2)) {
                System.out.println("Customer 1 and Customer 2 are same");
            } else {
                System.out.println("Customer 1 and Customer 2 are different");
            }

        } catch (Exception e) {
            System.out.println("Invalid input format. Please try again.");
        }
    }
}
