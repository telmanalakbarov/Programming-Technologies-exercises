import java.util.Scanner;

public class mesele2_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int dist, cost, mileage, parking, tolls;

		System.out.print("Enter total miles driven per day: ");
		dist = input.nextInt();

		System.out.print("Enter cost per gallon of gasoline: ");
		cost = input.nextInt();

		System.out.print("Enter mileage per gallon of gasoline: ");
		mileage = input.nextInt();

		System.out.print("Enter daily parking fees: ");
		parking = input.nextInt();

		System.out.print("Enter tolls paid every day: ");
		tolls = input.nextInt();

		System.out.printf("You could save %d manats every day by car-pooling.%n",
							cost*dist/mileage + parking + tolls);
	}
}