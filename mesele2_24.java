// Ex. 2.24: LargestAndSmallestIntegers.java
// Obtain five numbers from the user, display largest and smallest from the group.
import java.util.Scanner;

public class mesele2_24
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1, 
            number2, 
            number3, 
            number4, 
            number5,
            largest,
            smallest;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        System.out.print("Enter fourth integer: ");
        number4 = input.nextInt();

        System.out.print("Enter fifth integer: ");
        number5 = input.nextInt();

        largest = number1;
        smallest = number1;

        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        if (number4 > largest)
            largest = number4;
        if (number5 > largest)
            largest = number5;

        if (number2 < smallest)
            largest = number2;
        if (number3 < smallest)
            largest = number3;
        if (number4 < smallest)
            largest = number4;
        if (number5 < smallest)
            largest = number5;

        System.out.printf("Largest of five integers is %d, and smallest is %d%n", largest, smallest);
    }
}