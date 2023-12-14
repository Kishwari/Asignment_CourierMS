import java.util.Scanner;

public class OrderDeliveryStatus {


	public static void main(String[] args) {
		
		// Task 2.1 ----------------------------------------------------------------------------
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order status : ");	
		String orderStatus=sc.nextLine();
		if(orderStatus.equalsIgnoreCase("Processing"))
			System.out.println("Status : Processing");
		else if(orderStatus.equalsIgnoreCase("Delivered"))
				System.out.println("Status : Delivered");
		else if (orderStatus.equalsIgnoreCase("Cancelled"))
					System.out.println("Status : Cancelled");
		else
			System.out.println("Invalid status !");
		
		sc.close();
	}
}