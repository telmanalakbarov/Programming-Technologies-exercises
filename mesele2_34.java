import java.util.Scanner;

public class mesele2_34
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      double currentPopulation;
      double yearOne;
      double yearTwo;
      double yearThree;
      double yearFour;
      double yearFive;
      float growthRate;

      System.out.print( "Enter the current world population (exclude commas): ");
      currentPopulation = input.nextDouble();

      System.out.print( "Enter the annual world population growth rate (in percent): ");
      growthRate = input.nextFloat();
      growthRate = growthRate / 100;

      yearOne = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "\nWorld population after one year: %.0f\n", yearOne );

      currentPopulation = yearOne;
      
      yearTwo = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "                after two years: %.0f\n", yearTwo );

      currentPopulation = yearTwo;

      yearThree = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "              after three years: %.0f\n", yearThree );

      currentPopulation = yearThree;
      
      yearFour = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "               after four years: %.0f\n", yearFour );

      currentPopulation = yearFour;

      yearFive = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "               after five years: %.0f\n", yearFive );
   }
}