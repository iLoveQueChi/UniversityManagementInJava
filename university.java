import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.io.*;



public class university
{
// Attibutes
	private ArrayList<employee> employeeList; // fullName, allowance, salaryCoefficient, faculty, degree, workingDay

// Constructor
	public university(String employeePath)
	{
		this.employeeList = loadInEmployeeList(employeePath);
	}

// Getters
	public ArrayList<employee> getEmployeeList()
	{
		return this.employeeList;
	}

// Setters
	public void setEmployeeList(ArrayList<employee> newEmployeeList)
	{
		this.employeeList = newEmployeeList;
	}



/*-------------------------------MUST CALL THIS METHOD FIRST-------------------------------*/
// 1. Load in employee's details from input file
	public ArrayList<employee> loadInEmployeeList(String employeePath) 
	{
		ArrayList<employee> employeeResult = new ArrayList<employee>();
		ArrayList<String> employeeList =  loadFile(employeePath);

		for(String employee_one : employeeList)
		{
			String[] details = employee_one.split(",");
			if(details[0].startsWith("LT")) // ID Doan Xuan Thanh, 100, 5.6, IT, Doctor, 100
				employeeResult.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
			else if(details[0].startsWith("ST")) // 
				employeeResult.add(new staff(details[0], details[1], Double.parseDouble(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return employeeResult;
	}
/*-------------------------------MUST CALL THIS METHOD FIRST-------------------------------*/



// 2. Get lecturerList from employeeList
	public ArrayList<lecturer> getLecturerList()
	{
		ArrayList<lecturer> lecturerList = new ArrayList<lecturer>();		

		for(employee employee_one  : this.employeeList)
		{
			if(employee_one.toString().startsWith("LT"))
			{
				String[] details = employee_one.toString().split("_");
				lecturerList.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
			}
		}

		return lecturerList;
	}


// 3. Get staffList from employeeList
	public ArrayList<staff> getStaffList(String employeePath)
	{
		ArrayList<staff> staffList = new ArrayList<staff>();

		for(employee employee_one  : this.employeeList)
		{
			if(employee_one.toString().startsWith("ST"))
			{
				String[] details = employee_one.toString().split("_");
				staffList.add(new staff(details[0], details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
			}
		}

		return staffList;
	}


// 4. Get ITlecturerList from employeeList
	public ArrayList<lecturer> getITLecturerList()
	{
		ArrayList<lecturer> lecturerOfITFacultyList = new ArrayList<lecturer>();
		ArrayList<lecturer> lecturerList = getLecturerList();

		for(lecturer lecturer_one : lecturerList)
		{
			if(lecturer_one.getFaculty().equals("IT"))
			{
				String[] details = lecturer_one.toString().split("_");
				lecturerOfITFacultyList.add(new lecturer(details[0], details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
			}
		}

		return lecturerOfITFacultyList;
	}


// 5. Get get lecturer Khai  from ITLecturerList
	public ArrayList<lecturer> getLecturerKhaiOfITFaculty()
	{
		ArrayList<lecturer> lecturerKhaiOfITFacultyList = new ArrayList<lecturer>();
		ArrayList<lecturer> lecturerList = getITLecturerList();

		for(lecturer lecturer_one : lecturerList)
		{
			if(lecturer_one.getFullName().endsWith("Khai"))
			{
				String[] details = lecturer_one.toString().split("_");
				lecturerKhaiOfITFacultyList.add(new lecturer(details[0], details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
			}
		}

		return lecturerKhaiOfITFacultyList;
	}	











	public static ArrayList<String> loadFile(String filePath)
	{
		String data = "";
		ArrayList<String> list = new ArrayList<String>();

		try 
		{
			FileReader reader = new FileReader(filePath);
			BufferedReader fReader = new BufferedReader(reader);

			while((data = fReader.readLine()) != null)
			{
				list.add(data);	
			}	

			fReader.close();
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("ERROR CANNOT LOAD FILE");
		}

		return list;
	}

}



