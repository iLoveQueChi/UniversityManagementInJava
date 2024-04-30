public abstract class employee
{
	// Attributes
	protected String fullName;
	protected String employeeID;
	protected double salaryCoefficient;
	protected double allowance;
	protected int workingDay;

	// Contrustor
	public employee(String fullName, String employeeID, double allowance, double salaryCoefficient, int workingDay)
	{
		this.fullName = fullName;
		this.employeeID = employeeID;
		this.allowance = 0;
		this.salaryCoefficient = salaryCoefficient;
		this.workingDay = workingDay;
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

	public int getworkingDay()
	{
		return this.workingDay;
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

	public void setWorkingDay(int newWorkingDay)
	{
		this.workingDay = newWorkingDay;
	}

	//
	@Override
	public String toString() 
	{
		return String.format("Full Name: %s, salary coefficient: %f, number of working day: %d", this.fullName, this.salaryCoefficient, this.workingDay);
	}

	public abstract double getSalary();

}

