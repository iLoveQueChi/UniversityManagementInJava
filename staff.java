public class staff extends employee
{
	// Attributes
	private String department;
	private String duty;

	// Constructor
	public staff(String employeeID, String fullName, double salaryCoefficient, String department, String duty, int workingDay)
	{
		super(employeeID, fullName, salaryCoefficient, workingDay);
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
	public double getSalary()
	{
		return super.salaryCoefficient*830 + getAllowance() + workingDay*30;
	}

	@Override
	public String toString()
	{
		return super.toString() + "_" + getAllowance() + "_" + this.department + "_" + this.duty;
	}

	@Override
	public double getAllowance()
	{
		int allowance = 0;
		if(this.duty.equals("Excutive Staff"))
			allowance = 500;
		else if(this.duty.equals("Deputy head of department"))
			allowance = 100;
		else if(this.duty.equals("Head of department"))
			allowance = 1300;

		return allowance;
	}
	//
}
