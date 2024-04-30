public abstract class employee
{
	// Attributes
	protected String fullName;
	protected String employeeID;
	protected double salaryCoefficient;
	protected double allowance;

	// Contrustor
	public employee(String fullName, String employeeID, double allowance, double salaryCoefficient)
	{
		this.fullName = fullName;
		this.employeeID = employeeID;
		this.allowance = 0;
		this.salaryCoefficient = salaryCoefficient;
	}

	// Getter
	public String getFullName()
	{
		return this.fullName;
	}

	public String getID()
	{
		return this.employeeID;
	}

	public double getAllowance()
	{
		return this.allowance;
	}

	public double getSalaryCoefficient()
	{
		return this.salaryCoefficient;
	}

	// Setter
	public void setFullName(String newName)
	{
		this.fullName = newName;
	}

	public void setID(String newID)
	{
		this.employeeID = newID;
	}

	public void setAllowance(double newAllowance)
	{
		this.allowance = newAllowance;
	}

	public void setSalaryCoefficient(double newSalaryCoefficient)
	{
		this.salaryCoefficient = newSalaryCoefficient;
	}

	//
	@Override
	public String toString() 
	{
		return String.format("Full Name: %s, salary coefficient: %f", this.fullName, this.salaryCoefficient);
	}

	public abstract double getSalary();

}

