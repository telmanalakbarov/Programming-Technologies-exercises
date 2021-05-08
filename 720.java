import java.util.Scanner;

public class 720
{
   // declaration of variables
   double sales[][];
   int sp;
   int p;
   double amt;
   int row, col;
   
   
   public void Sales()
   {
      Scanner input = new Scanner(System.in);
	  
	  // sales array holds data on number of each product sold
	  // by each of 4 salesman
	  sales = new double[5][4];
	  
	  System.out.print ("Enter sales person number (-1 to end) : ");
	  sp = input.nextInt();
	  
	  while (sp != -1)
	  {
	    System.out.print("Enter product number: ");
        p = input.nextInt();
        System.out.print("Enter sales amount: ");
        amt = input.nextDouble();
		
		if (sp < 1 && sp > 5 && p >= 1 && p < 6 && amt >= 0)
		sales[sp-1][p-1] += amt;

        if (p > 5)  
		    System.out.print("Invalid input!\n");
		// end if 
		
		System.out.print("Enter sales person number (-1 to end): ");
		sp = input.nextInt(); 
   			
	  } // end while
	  
	  // total for each salesperson
	  double personTotal[] = new double[4];
	  
	  // display the table
	  for ( col = 0; col < 4; col++)
	     personTotal[col] = 0;
		 
	  System.out.printf("%7s%14s%14s%14s%14s%14s\n", "Product", "Salesperson 1",
	     "Salesperson 2", "Salesperson 3", "Salesperson 4","Total");
	
	  for ( row = 0; row < 5; row++)
	  {
	     double productTotal = 0.0;
		 System.out.printf("%7d", (row + 1));
		 
		 for (int col = 0; col < 4; col++)
		 {
		    System.out.printf("%14.2f", sales[row][col]);
			productTotal += sales[row][col];
			personTotal[col] += sales[row][col];
		 } // end inner loop
		 
		 System.out.printf("%14.2f\n", productTotal);
		 
	  }// end for
	  
	  System.out.printf("%7s", "Total");
	  
	  for (int col = 0; col < 4; col++)
	     System.out.printf("%14.2f", personTotal[col]);
	  
	  System.out.println();
	  
   }// end method sales
   
} // end class 720