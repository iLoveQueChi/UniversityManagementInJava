public abstract class lecturer extends employee
{	
	// Attributes
	private String faculty;
	private String degree;
	private int teachingDay;

	// Constructor
	public lecturer(String fullName, String employeeID, double allowance, double salaryCoefficient, String faculty, String degree, int teachingDay) // Lecturer, Doan Xuan Thanh, 100, 5.6, IT, Doctor, 100
	{
		super(fullName, employeeID, allowance, salaryCoefficient);

		this.faculty = faculty;
		this.degree = degree;
		this.teachingDay = teachingDay;
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

	public int getTeachingDay()
	{
		return this.teachingDay;
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

	public void setTeachingDay(int newTeachingDay)
	{
		this.teachingDay = newTeachingDay;
	}

	@Override
	public double getSalary()
	{
		return super.salaryCoefficient*830 + super.allowance + teachingDay*30;
	}

	@Override
	public String toString()
	{
		return "ID: " + super.getID() + "\n"
			 + "Full Name: " + super.getFullName() + "\n"
			 + "Allowance: " + getAllowance() + "\n"
			 + "Salary Coefficient: " + super.getSalaryCoefficient() + "\n"
			 + "Degree: " + getDegree() + "\n"
			 + "Faculty: " + getFaculty() + "\n"
		 	 + "Number of teaching day: " + getTeachingDay() + "\n"
			 + "Salary: " + getSalary() + "\n";
	}
}