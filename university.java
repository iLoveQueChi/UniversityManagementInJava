import java.util.ArrayList;
import java.util.List;

public class university
{
	private ArrayList<employee> employee_list;
	/*
	public university()
	{
		lecturer_list = new ArrayList<>();
		staff_list = new ArrayList<>();
	}

	public university(String lecturerDetailsPath, String staffDetailsPath)
	{
		this.lecturer_list = loadLecturerDetailsList(lecturerDetailsPath);
		this.staff_list = loadStaffDetailsList(staffDetailsPath);
	}
	*/

	public university(String employeePath)
	{
		this.employee_list = loadEmployeeDetails(employeePath);
	}

	public ArrayList<employee> getEmployeeList()
	{
		return this.employee_list;
	}

	public void setEmployeeList(ArrayList<employee> newEmployeeList)
	{
		this.employee_list = newEmployeeList;
	}


// 1. Load in employee's details from input file
	public ArrayList<employee> loadEmployee(String employeePath) 
	{
		ArrayList<employee> employeeResult = new ArrayList<employee>();
		ArrayList<String> employee_list =  loadFile(employeePath);

		for(String employee_one : this.employee_list)
		{
			String[] details = employee_one.split(",");
			if(details[0].startsWith("Lecturer")) // Lecturer, Doan Xuan Thanh, 100, 5.6, IT, Doctor, 100
				employeeResult.add(new lecturer(details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
			else if(details[0].startsWith("Staff")) // 
				employeeResult.add(new staff(details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return employeeResult;
	}


 // 2. Select Lecturer only 
	public ArrayList<lecturer> getLecturer()
	{
		ArrayList<lecturer> lecturer_list = new ArrayList<lecturer>();

		for(employee employee_one : this.employee_list)
		{
			String details[] = employee_one.split(",");
			if(details[0].startsWith("Lecturer"))
				lecturer_list.add(new lecturer(details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return lecturer_list;
	}


 // 3. Select Staff only 
	public ArrayList<staff> getStaff()
	{
		ArrayList<staff> staff_list = new ArrayList<staff>();

		for(employee employee_one : this.employee_list)
		{
			String details[] = employee_one.split(",");
			if(details[0].startsWith("Staff"))
				staff_list.add(new staff(details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return staff_list;
	}


// 4. Select lecturer of IT faculty only
	public ArrayList<lecturer> getLecturerListOfITFaculty()
	{
		ArrayList<lecturer> lecturerOfITFaculty_list = new ArrayList<lecturer>();

		for(employee employee_one : this.employee_list)
		{
			String details[] = employee_one.split(",");
			if(details[0].startsWith("Lecturer") && details[4].startsWith("IT"))
				lecturerOfITFaculty_list.add(new lecturer(details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return lecturerOfITFaculty_list;
	}

// 5. Select lecturer belongs to IT faculty whose name is "Khai"
	public ArrayList<lecturer> getLecturerKhaiOfITFaculty()
	{
		ArrayList<lecturer> lecturerKhaiOfITFaculty_list = new ArrayList<lecturer>();

		for(employee employee_one : this.employee_list)
		{
			String details[] = employee_one.split(",");
			if(details[1].endsWith("Khai"))
				lecturerKhaiOfITFaculty_list.add(new lecturer(details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return lecturerKhaiOfITFaculty_list;
	}	
// 6. Get Salary of each employee 
	// Lecturer, Doan Xuan Thanh, 100, 5.6, IT, Doctor, 100
	public LinkedHashMap<String, Double> getSalaryEachEmployee(ArrayList<employee> employee_list, 
															LinkedHashMap<String, String, Double, Double, String, String, Integer> emploeeWithName_allownace_salaryCoe_faculty_degree_teachingDay)
	{
		LinkedHashMap<String, Double> employeeWithName_salary = new LinkedHashMap<String, Double>();

		for(employee employee_one : employee_list)
		{
			for(String key : emploeeWithName_allownace_salaryCoe_faculty_degree_teachingDay.ketSet())
			{
				if(employee_one.getFullName().equals())
			}
		}
	}





// 6. Find the employee who has the highest salary 
	public ArrayList<employee> employeeHighestSalary()
	{
		ArrayList<employee> employeeHighestSalary_list = new ArrayList<employee>();

		for(employee employee_onem : this.employee_list)
		{

		}
	}






// 
	// public void addLecturer(lecturer newLecturer)
	// {
	// 	lecturer_list.add(newLecturer);
	// }

	// public void addStaff(staff newStaff)
	// {
	// 	staff_list.add(newStaff);
	// }

	// public void increaseSalary(double increasingRate)
	// {
	// 	for(lecturer lecturer_one : lecturer_list)
	// 	{
	// 		lecturer_one.salaryCoefficient *= (1 + increasingRate);
	// 	}

	// 	for(staff staff_one : staff_list)
	// 	{
	// 		staff_one.salaryCoefficient *= (1 + increasingRate);
	// 	}
	// }

	// public lecturer highestLecturerSalary()
	// {
	// 	lecturer highestSalary = lecturer_list.get(0);

	// 	for(lecturer lecturer_one : lecturer_list)
	// 	{
	// 		if(lecturer_one.getSalary() > highestSalary.getSalary())
	// 			highestSalary = lecturer_one;
	// 	}

	// 	return highestSalary;
	// }

	// public staff highestStaffSalary()
	// {
	// 	staff highestSalary = staff_list.get(0);

	// 	for(staff staff_one : staff_list)
	// 	{
	// 		if(staff_one.getSalary() > highestSalary.getSalary())
	// 			highestSalary = staff_one;
	// 	}

	// 	return highestSalary;
	// }

	// public void printSalaryOfAll()
	// {
	// 	System.out.println("\nLecturer's salary: ");
	// 	for(lecturer lecturer_one : lecturer_list)
	// 	{
	// 		System.out.printf("Full name: %s\n, Salary: %f \n", lecturer_one.getFullName(), lecturer_one.getSalary());
	// 	}

	// 	System.out.println("\nStaff's Salary: ");
	// 	for(staff staff_one : staff_list)
	// 	{
	// 		System.out.printf("Full name: %s\n, Salary: %f \n", staff_one.getFullName(), staff_one.getSalary());
	// 	}

	// }

}