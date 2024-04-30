public class staff extends employee
{
	// Attributes
	private String department;
	private String duty;

	// Constructor
	public staff(String fullName, String employeeID, double allowance, double salaryCoefficient, String department, String duty, int workingDay)
	{
		super(fullName, employeeID, allowance, salaryCoefficient, workingDay);

		this.department = department;
		this.duty = duty;
	}

	// Getter
	public String getDepartment()
	{
		return this.department;
	}

	public String getDuty()
	{
		return this.duty;
	}

	public double getAllowance()
	{
		if(this.duty.equals("Excutive Staff"))
			super.allowance = 500;
		else if(this.duty.equals("Deputy head of department"))
			super.allowance = 100;
		else if(this.duty.equals("Head of department"))
			super.allowance = 1300;

		return super.allowance;
	}

	// Setter
	public void setDepartment(String newDepartment)
	{
		this.department = newDepartment;
	}

	public void setDuty(String newDuty)
	{
		this.duty = newDuty;
	}


	@Override
	public double getSalary(double allowance, double salaryCoefficient, int workingDay)
	{
		return super.salaryCoefficient*830 + super.allowance + workingDay*30;
	}

	@Override
	public String toString()
	{
		return super.toString() + "_" + this.department + "_" + this.duty;
	}
}