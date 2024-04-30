public class staff extends employee
{
	// Attributes
	private String department;
	private String duty;
	private int workingDay;

	// Constructor
	public staff(String fullName, String employeeID, double allowance, double salaryCoefficient, String department, String duty, int workingDay)
	{
		super(fullName, employeeID, allowance, salaryCoefficient);

		this.department = department;
		this.duty = duty;
		this.workingDay = workingDay;
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

	public double getWorkingDay()
	{
		return this.workingDay;
	}

	public double getAllowance()
	{
		if(this.duty.equals("Nhan Vien"))
			super.allowance = 500;
		else if(this.duty.equals("Pho Phong"))
			super.allowance = 100;
		else if(this.duty.equals("Truong Phong"))
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

	public void setWorkingDay(int newWorkingDay)
	{
		this.workingDay = newWorkingDay;
	}

	@Override
	public double getSalary()
	{
		return super.salaryCoefficient*830 + super.allowance + workingDay*30;
	}

	@Override
	public String toString()
	{
		return "ID: " + super.getID() + "\n"
			 + "Full Name: " + super.getFullName() + "\n"
			 + "Allowance: " + getAllowance() + "\n"
			 + "Salary Coefficient: " + super.getSalaryCoefficient() + "\n"
			 + "Duty: " + getDuty() + "\n"
			 + "Department: " + getDepartment() + "\n"
		 	 + "Number of working day: " + getWorkingDay() + "\n"
			 + "Salary: " + getSalary() + "\n";
	}
}