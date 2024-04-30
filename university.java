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


// 2. Load in Lecturer's details only from input file
	public ArrayList<lecturer> loadInLecturerList(String employeePath)
	{
		ArrayList<lecturer> lecturerResult = new ArrayList<lecturer>();		
		ArrayList<String> lecturerList =  loadFile(employeePath); // read

		for(String lecturer_one : lecturerList)
		{
			String details[] = lecturer_one.split(",");
			if(details[0].startsWith("LT"))
				lecturerResult.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return lecturerResult;
	}


// 3. Load in Staff's details only from input file
	public ArrayList<staff> loadInStaffList(String employeePath)
	{
		ArrayList<staff> staffResult = new ArrayList<staff>();
		ArrayList<String> staffList = loadFile(employeePath);

		for(String staff_one : staffList)
		{
			String details[] = staff_one.split(",");
			if(details[0].startsWith("ST"))
				staffResult.add(new staff(details[0], details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return staffResult;
	}


// 4. Load in Lecture's details of IT faculty only from input file
	public ArrayList<lecturer> loadInITLecturerList(String employeePath)
	{
		ArrayList<lecturer> lecturerOfITFacultyResult = new ArrayList<lecturer>();
		ArrayList<String> lecturerOfITFacultyList = loadFile(employeePath);

		for(String lecturer_one : lecturerOfITFacultyList)
		{
			String details[] = lecturer_one.split(",");
			if(details[0].startsWith("LT") && details[4].startsWith("IT"))
				lecturerOfITFacultyResult.add(new lecturer(details[0],details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return lecturerOfITFacultyResult;
	}


// 5. Load in Lecture's details of IT faculty whose name is "Khai" only from input file
	public ArrayList<lecturer> getLecturerKhaiOfITFaculty(String employeePath)
	{
		ArrayList<lecturer> lecturerKhaiOfITFacultyResult = new ArrayList<lecturer>();
		ArrayList<String> lecturerKhaiOfITFacultyList = loadFile(employeePath);

		for(String lecturer_one : lecturerKhaiOfITFacultyList)
		{
			String details[] = lecturer_one.split(",");
			if(details[0].startsWith("LT") && details[1].endsWith("Khai"))
				lecturerKhaiOfITFacultyResult.add(new lecturer(details[0],details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
		}

		return lecturerKhaiOfITFacultyResult;
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



