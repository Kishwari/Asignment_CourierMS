
import java.util.*;
public class ParcelCategorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the parcel's weight(int kg) : ");	
		int weight=sc.nextInt();
		switch (weight) {
		case  1:
		case  2:
		case  3:
			System.out.println("Light");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Medium");
			break;
		 default:
			System.out.println("Heavy");
			break;
			}
		sc.close();
	}

}
