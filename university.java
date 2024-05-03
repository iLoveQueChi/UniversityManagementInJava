import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.io.*;



public class university
{

// Attibutes
	private ArrayList<employee> employeeList; // id, fullName, allowance, salaryCoefficient, faculty, degree, workingDay
	private ArrayList<String> workingDay;


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


/*-------------------------------IMPORTANT METHOD: READ EMPLOYEE DETAILS FROM employeeDetails.txt-------------------------------*/
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
/*-------------------------------IMPORTANT METHOD: READ EMPLOYEE DETAILS FROM employeeDetails.txt-------------------------------*/



// 2. Get lecturerList from employeeList
	public ArrayList<lecturer> getLecturerList()
	{
		ArrayList<lecturer> lecturerList = new ArrayList<lecturer>();		

		for(employee employee_one  : this.employeeList)
		{
			if(employee_one.getID().startsWith("LT"))
			{
				String[] details = employee_one.toString().split("_");
				lecturerList.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
			}
		}

		return lecturerList;
	}


// 3. Get staffList from employeeList
	public ArrayList<staff> getStaffList()
	{
		ArrayList<staff> staffList = new ArrayList<staff>();
		for(employee employee_one  : this.employeeList)
		{
			if(employee_one.getID().startsWith("ST"))
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
		ArrayList<lecturer> lecturerList = getLecturerList();
		ArrayList<lecturer> lecturerOfITFacultyList = new ArrayList<lecturer>();

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
			// if(lecturer_one.getFullName().endsWith("Khai"))
			// {
				String[] details = lecturer_one.toString().split("_");
				lecturerKhaiOfITFacultyList.add(new lecturer(details[0], details[1], Integer.parseInt(details[2]), Double.parseDouble(details[3]), details[4], details[5], Integer.parseInt(details[6])));
			// }
		}
		return lecturerKhaiOfITFacultyList;
	}	

    public LinkedHashMap<String, Integer> getlecturerWithID_WorkingDay() 
    {
    	ArrayList<lecturer> lecturerList = getLecturerList();
        LinkedHashMap<String, Integer> lecturerWithID_WorkingDay = new LinkedHashMap<String, Integer>();

        for(lecturer lecturer_one : lecturerList) 
		{
            // if(lecturer_one.getID().equals("LT"))
            // {
            	String[] details = lecturer_one.toString().split("_");
                lecturerWithID_WorkingDay.put(details[0], Integer.parseInt(details[6]));           	
            // } 
        }

        return lecturerWithID_WorkingDay;
    }


   public LinkedHashMap<String, Integer> getStaffWithID_WorkingDay()
   {
   		ArrayList<staff> staffList = getStaffList();
   		LinkedHashMap<String, Integer> staffWithID_WorkingDay = new LinkedHashMap<String, Integer>();

   		for(staff staff_one : staffList)
   		{
   			// if(staff_one.getID().equals("ST"))
   			// {
   				String[] details = staff_one.toString().split("_");
   				staffWithID_WorkingDay.put(details[0], Integer.parseInt(details[6]));
   			// }
   		}

   		return staffWithID_WorkingDay;
   }

   public LinkedHashMap<String, Double> getLecturerWithID_Salary()
   {
   	// initialize a linkedhashmap with key: String, value: Double to store ID and salary
   		LinkedHashMap<String, Double> lecturerWithID_Salary = new LinkedHashMap<String, Double>();

   	// call needly method
   		ArrayList<lecturer> lecturerList = getLecturerList();

   		for(lecturer lecturer_one : lecturerList)
   		{
   			lecturerWithID_Salary.put(lecturer_one.getID(), lecturer_one.getSalary());
   		}

   		return lecturerWithID_Salary;

   }

   public LinkedHashMap<String, Double> getStaffWithID_Salary()
   {
   	// initialize a linkedhashmap with key: String, value: Double to store ID and salary
   		LinkedHashMap<String, Double> staffWithID_Salary = new LinkedHashMap<String, Double>();

   	// call needly method
   		ArrayList<staff> staffList = getStaffList();

   		for(staff staff_one : staffList)
   		{
   			staffWithID_Salary.put(staff_one.getID(), staff_one.getSalary());
   		}

   		return staffWithID_Salary;

   }


   public ArrayList<lecturer> getLecturerHighestSalary()
   {
   		ArrayList<lecturer> lecturerList = getLecturerList();
    	LinkedHashMap<String, Double> lecturerWithID_Salary = getLecturerWithID_Salary(); 
    	 		
   		ArrayList<lecturer> lecturerHighestSalary = new ArrayList<lecturer>();

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


