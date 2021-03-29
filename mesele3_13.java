public class mesele3_13 
{
	public static void main(String[] args)
	{
		firstName = fname; // initialize firstName
		lastName = lname; // initialize lastName
		monthlySalary = msalary; // initialize monthlySalary
		
		// if the monthly salary is not positive, set it to 0.0.
		if (msalary < 0.0)
			monthlySalary = 0.0;
	} // end constructor
	
	// method to set the first name
	public void setFirstName (String fname)
	{
		firstName = fname;	// store the first name
		
	} // end method setFirstName
	
	// method to retrieve first name
	public String getFirstName ()
	{
		return firstName;
	} // end method getFirstName
	
	// method to set the last name
	public void setLastName (String lname)
	{
		lastName = lname;	// store the last name
	} // end method setLastName
	
	// method to retrieve last name
	public String getLastName ()
	{
		return lastName;
	} // end method getLastName
	
	// method to set the monthly salary
	public void setMonthlySalary (double msalary)
	{
		monthlySalary = msalary;	// store the monthly salary
		

	} // end method setMonthlySalary
	
	// method to retrieve monthly salary
	public double getMonthlySalary ()
	{
		return monthlySalary;
	} // end method getMonthlySalary
	
	// method to retrieve yearly salary
	public double getYearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	} // end method getYearlySalary
	
	// method to retrieve yearly salary after giving 10% raise
	public double getRaiseSalary()
	{
		double raise =  monthlySalary * 0.1 ;
		double raiseSalary = ( monthlySalary + raise ) * 12;
		return raiseSalary;
	} // end method getRaiseSalary
	
} // end class Employee