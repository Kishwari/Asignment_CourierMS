import java.util.*;
public class UserAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String employeeUsername = "employee";
String employeePassword = "employee123";
String customerUsername = "customer";
String customerPassword = "customer123";

Scanner scanner = new Scanner(System.in);

System.out.println("Welcome to the Login System!");

// Prompt the user to enter their role (Employee or Customer)
System.out.print("Enter your role (Employee/Customer): ");
String role = scanner.nextLine();

// Validate the user's role
if (role.equalsIgnoreCase("Employee")) {
    System.out.print("Enter your username: ");
    String username = scanner.nextLine();
    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    // Check if employee credentials match
    if (username.equals(employeeUsername) && password.equals(employeePassword)) {
        System.out.println("Employee Login Successful!");
        // Proceed with employee functionalities
    } else {
        System.out.println("Invalid username or password for an employee.");
    }
} else if (role.equalsIgnoreCase("Customer")) {
    System.out.print("Enter your username: ");
    String username = scanner.nextLine();
    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    // Check if customer credentials match
    if (username.equals(customerUsername) && password.equals(customerPassword)) {
        System.out.println("Customer Login Successful!");
        // Proceed with customer functionalities
    } else {
        System.out.println("Invalid username or password for a customer.");
    }
} else {
    System.out.println("Invalid role entered.");
}

scanner.close();
}
}