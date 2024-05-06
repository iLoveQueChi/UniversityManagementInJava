public class lecturer extends employee
{	
	// Attributes
	private String faculty;
	private String degree;

	// Constructor
	public lecturer(String employeeID, String fullName, double salaryCoefficient, String faculty, String degree, int workingDay)
	{
		super(employeeID, fullName, salaryCoefficient, workingDay);
		this.faculty = faculty;
		this.degree = degree;
	}

	// Getter
	public String getFaculty()
	{
		return this.faculty;
	}

	public String getDegree()
	{
		return this.degree;
	}

	// Setter
	public void setFaculty(String newFaculty)
	{
		this.faculty = newFaculty;
	}

	public void setDegree(String newDegree)
	{
		this.degree = newDegree;
	}


	@Override
	public double getSalary()
	{
		return super.salaryCoefficient*830 + getAllowance() + workingDay*30;
	}

	@Override
	public String toString()
	{
		return super.toString() + "_" + getAllowance() + "_" + this.faculty + "_" + this.degree;
	}


	@Override
	public double getAllowance()
	{
		int allowance = 0;
		if(this.degree.equals("Bachelor"))
			allowance = 300;
		else if(this.degree.equals("Master"))
			allowance = 500;
		else if(this.degree.equals("Doctor"))
			allowance = 1000;

		return allowance;
	}
}
