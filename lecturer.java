public class lecturer extends employee
{	
	// Attributes
	private String faculty;
	private String degree;

	// Constructor
	public lecturer(String fullName, String employeeID, double allowance, double salaryCoefficient, String faculty, String degree, int workingDay) // Lecturer, Doan Xuan Thanh, 100, 5.6, IT, Doctor, 100
	{
		super(fullName, employeeID, allowance, salaryCoefficient, workingDay);

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

	public double getAllowance()
	{
		if(this.degree.equals("Bachelor"))
			super.allowance = 300;
		else if(this.degree.equals("Master"))
			super.allowance = 500;
		else if(this.degree.equals("Doctor"))
			super.allowance = 1000;

		return super.allowance;
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
	public double getSalary(double allowance, double salaryCoefficient, int workingDay)
	{
		return super.salaryCoefficient*830 + super.allowance + workingDay*30;
	}

	@Override
	public String toString()
	{
		return super.toString() + "_" + this.faculty + "_" + this.degree;
	}
}