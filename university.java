/*

 .----------------.  .----------------.  .----------------.  .-----------------. .----------------.   .----------------.  .----------------.  .----------------.                                                             
| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. |                                                            
| |    ___       | || | _____  _____ | || |      __      | || | ____  _____  | || |    ______    | | | |  ____  ____  | || | _____  _____ | || |  ____  ____  | |                                                            
| |  .'   '.     | || ||_   _||_   _|| || |     /  \     | || ||_   \|_   _| | || |  .' ___  |   | | | | |_   ||   _| | || ||_   _||_   _|| || | |_  _||_  _| | |                                                            
| | /  .-.  \    | || |  | |    | |  | || |    / /\ \    | || |  |   \ | |   | || | / .'   \_|   | | | |   | |__| |   | || |  | |    | |  | || |   \ \  / /   | |                                                            
| | | |   | |    | || |  | '    ' |  | || |   / ____ \   | || |  | |\ \| |   | || | | |    ____  | | | |   |  __  |   | || |  | '    ' |  | || |    \ \/ /    | |                                                            
| | \  `-'  \_   | || |   \ `--' /   | || | _/ /    \ \_ | || | _| |_\   |_  | || | \ `.___]  _| | | | |  _| |  | |_  | || |   \ `--' /   | || |    _|  |_    | |                                                            
| |  `.___.\__|  | || |    `.__.'    | || ||____|  |____|| || ||_____|\____| | || |  `._____.'   | | | | |____||____| | || |    `.__.'    | || |   |______|   | |                                                            
| |              | || |              | || |              | || |              | || |              | | | |              | || |              | || |              | |                                                            
| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' |                                                            
 '----------------'  '----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'                                                             
 .----------------.  .-----------------. .----------------.                                                                                                                                                                  
| .--------------. || .--------------. || .--------------. |                                                                                                                                                                 
| |      __      | || | ____  _____  | || |  ________    | |                                                                                                                                                                 
| |     /  \     | || ||_   \|_   _| | || | |_   ___ `.  | |                                                                                                                                                                 
| |    / /\ \    | || |  |   \ | |   | || |   | |   `. \ | |                                                                                                                                                                 
| |   / ____ \   | || |  | |\ \| |   | || |   | |    | | | |                                                                                                                                                                 
| | _/ /    \ \_ | || | _| |_\   |_  | || |  _| |___.' / | |                                                                                                                                                                 
| ||____|  |____|| || ||_____|\____| | || | |________.'  | |                                                                                                                                                                 
| |              | || |              | || |              | |                                                                                                                                                                 
| '--------------' || '--------------' || '--------------' |                                                                                                                                                                 
 '----------------'  '----------------'  '----------------'                                                                                                                                                                  
 .----------------.  .----------------.  .----------------.  .-----------------. .----------------.   .----------------.  .----------------.  .----------------.  .----------------.  .-----------------. .----------------. 
| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |
| |    ___       | || | _____  _____ | || |      __      | || | ____  _____  | || |    ______    | | | |  _________   | || |  _______     | || | _____  _____ | || |     ____     | || | ____  _____  | || |    ______    | |
| |  .'   '.     | || ||_   _||_   _|| || |     /  \     | || ||_   \|_   _| | || |  .' ___  |   | | | | |  _   _  |  | || | |_   __ \    | || ||_   _||_   _|| || |   .'    `.   | || ||_   \|_   _| | || |  .' ___  |   | |
| | /  .-.  \    | || |  | |    | |  | || |    / /\ \    | || |  |   \ | |   | || | / .'   \_|   | | | | |_/ | | \_|  | || |   | |__) |   | || |  | |    | |  | || |  /  .--.  \  | || |  |   \ | |   | || | / .'   \_|   | |
| | | |   | |    | || |  | '    ' |  | || |   / ____ \   | || |  | |\ \| |   | || | | |    ____  | | | |     | |      | || |   |  __ /    | || |  | '    ' |  | || |  | |    | |  | || |  | |\ \| |   | || | | |    ____  | |
| | \  `-'  \_   | || |   \ `--' /   | || | _/ /    \ \_ | || | _| |_\   |_  | || | \ `.___]  _| | | | |    _| |_     | || |  _| |  \ \_  | || |   \ `--' /   | || |  \  `--'  /  | || | _| |_\   |_  | || | \ `.___]  _| | |
| |  `.___.\__|  | || |    `.__.'    | || ||____|  |____|| || ||_____|\____| | || |  `._____.'   | | | |   |_____|    | || | |____| |___| | || |    `.__.'    | || |   `.____.'   | || ||_____|\____| | || |  `._____.'   | |
| |              | || |              | || |              | || |              | || |              | | | |              | || |              | || |              | || |              | || |              | || |              | |
| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |
 '----------------'  '----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' 

*/


import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;


public class university
{
	/*----------------------------------------------------------------------Attributes----------------------------------------------------------------------*/
	private ArrayList<employee> employeeList;    // employeeID, fullName,  salaryCoefficient, workingDay
	// private ArrayList<lecturer> lecturerList; // employeeID, fullName,  salaryCoefficient, workingDay, faculty,    degree
	// private ArrayList<staff> staffList;		 // employeeID, fullName,  salaryCoefficient, workingDay, department, duty
	DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
	/*----------------------------------------------------------------------Attributes----------------------------------------------------------------------*/


	/*----------------------------------------------------------------------Constructor--------------------------------------------------------------------*/
	public university(String employeePath)
	{
		this.employeeList = loadInEmployeeList(employeePath); // C:\\Users\\Nguyen Quang Huy\\Desktop\\EmployeeManagementSystemInJva\\employeeDetails.txt

		// format of the input file: employeeID,fullName,salaryCoefficient,workingDay,faculty/department,degree/duty with no spaces
			// E.g: LT1001,Doan Xuan Thanh,5.6,100,IT,Doctor
		// allowance will be compute by getAllowance() method in class staff, lecturer after we know employee's salaryCoefficient, degree and workingDay  
			// Also allowance will not initialize as a variable and not available in input file

		// this.lecturerList = getLecturerList();
		// this.staffList = getStaffList();
	}
	/*----------------------------------------------------------------------Constructor--------------------------------------------------------------------*/


	/*----------------------------------------------------------------------Getters------------------------------------------------------------------------*/
	public ArrayList<employee> getEmployeeList()
	{
		return this.employeeList;
	}
	/*----------------------------------------------------------------------Getters------------------------------------------------------------------------*/


	/*----------------------------------------------------------------------Setters------------------------------------------------------------------------*/
	public void setEmployeeList(ArrayList<employee> newEmployeeList)
	{
		this.employeeList = newEmployeeList;
	}

	// public void setLecturerList(ArrayList<lecturer> newLecturerList)
	// {
	// 	this.lecturerList = newLecturerList;
	// }

	// public void setStaffList(ArrayList<staff> newStaffList)
	// {
	// 	this.staffList = newStaffList;
	// }
	/*----------------------------------------------------------------------Setters------------------------------------------------------------------------*/


	/*--------------------------------------------------------------------Main Method----------------------------------------------------------------------*/
	// 1. Load in employee details by loadFile method. Store it in a dynamic array: ArrayList with data type is employee
	public ArrayList<employee> loadInEmployeeList(String employeePath) 
	{
		ArrayList<employee> employeeResult = new ArrayList<employee>();

		ArrayList<String> employeeList =  loadFile(employeePath);

		for(String employee_one : employeeList)
		{
			String[] details = employee_one.split(",");
			if(details[0].startsWith("LT")) // LT1001,Doan Xuan Thanh,5.6,100,IT,Doctor
				employeeResult.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), details[4], details[5]));
			else if(details[0].startsWith("ST")) // 
				employeeResult.add(new staff(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), details[4], details[5]));
		}

		return employeeResult;
	}

	// 2. Get lecturerList from employeeList
	public ArrayList<lecturer> getLecturerList()
	{
		ArrayList<lecturer> lecturerList = new ArrayList<lecturer>();		

		for(employee employee_one  : this.employeeList)
		{
			if(employee_one.getID().startsWith("LT"))
			{
				String[] details = employee_one.toString().split("_"); 
				lecturerList.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), details[4], details[5]));
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
				staffList.add(new staff(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), details[4], details[5]));
			}
		}

		return staffList;
	}

	// 4. Get ITlecturerList from employeeList
	public ArrayList<lecturer> getLecturerOfITFaculty()
	{
		ArrayList<lecturer> lecturerList = getLecturerList();
		ArrayList<lecturer> lecturerOfITFacultyList = new ArrayList<lecturer>();

		for(lecturer lecturer_one : lecturerList)
		{
			if(lecturer_one.getFaculty().equals("IT")) // String: employeeID, String: fullName, Double: salaryCoefficient, Integer: workingDay, String: faculty, String: degree
			{
				String[] details = lecturer_one.toString().split("_");
				lecturerOfITFacultyList.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), details[4], details[5]));
			}
		}

		return lecturerOfITFacultyList;
	}

	// 5. Get lecturer whose name is Khai from ITLecturerList
	// public ArrayList<lecturer> getLecturerKhaiOfITFaculty()
	// {
	// 	ArrayList<lecturer> lecturerOfITFacultyList = getLecturerOfITFaculty();
	// 	ArrayList<lecturer> lecturerKhaiOfITFacultyList = new ArrayList<lecturer>();

	// 	for(lecturer lecturer_one : lecturerOfITFacultyList)
	// 	{
	// 		if(lecturer_one.getFullName().endsWith("Khai"))
	// 		{
	// 			String[] details = lecturer_one.toString().split("_");
	// 			lecturerKhaiOfITFacultyList.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), details[3], details[4], Integer.parseInt(details[5])));
	// 		}
	// 	}

	// 	return lecturerKhaiOfITFacultyList;
	// }	

	// 6. Get specific lecturer by their name from ITLecturerList 
	public ArrayList<lecturer> getSpecificLecturerOFITFaculty(String name) // name = "Khai"
	{
		ArrayList<lecturer> lecturerOfITFacultyList = getLecturerOfITFaculty();
		ArrayList<lecturer> specificLecturerOfITFacultyList = new ArrayList<lecturer>();

		for(lecturer lecturer_one : lecturerOfITFacultyList)
		{
			if(lecturer_one.getFullName().endsWith(name))
			{
				String[] details = lecturer_one.toString().split("_");
				specificLecturerOfITFacultyList.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), details[4], details[5]));
			}
		}

		return specificLecturerOfITFacultyList;
	}

	// 7. Get employeeID and workingDay of lecturer
    public LinkedHashMap<String, Integer> getLecturerWithID_WorkingDay() 
    {
    	ArrayList<lecturer> lecturerList = getLecturerList();
        LinkedHashMap<String, Integer> lecturerWithID_WorkingDay = new LinkedHashMap<String, Integer>();

        for(lecturer lecturer_one : lecturerList) 
		{
            String[] details = lecturer_one.toString().split("_");
            lecturerWithID_WorkingDay.put(details[0], Integer.parseInt(details[3]));            	
        }

        return lecturerWithID_WorkingDay;
    }

    // 8. Get employeeID and workingDay of staff
    public LinkedHashMap<String, Integer> getStaffWithID_WorkingDay() 
    {
		ArrayList<staff> staffList = getStaffList();    	
        LinkedHashMap<String, Integer> staffWithID_WorkingDay = new LinkedHashMap<String, Integer>();

        for(staff staff_one : staffList) 
		{
            String[] details = staff_one.toString().split("_");
            staffWithID_WorkingDay.put(details[0], Integer.parseInt(details[3]));         	
        }
        
        return staffWithID_WorkingDay;
    }

    // 9. Get the staff who work hardest
    public LinkedHashMap<String, Integer> getStaffWorkHardest_WithID()
    {
    	LinkedHashMap<String, Integer> staffWithID_WorkingDay = getStaffWithID_WorkingDay(); 

		LinkedHashMap<String, Integer> staffWorkHardest_WithID = new LinkedHashMap<String, Integer>();

   		String key_max = "";
   		int values_max = Collections.max(staffWithID_WorkingDay.values());

   		for(String key : staffWithID_WorkingDay.keySet())
   		{
   			if(values_max == staffWithID_WorkingDay.get(key))
   			{
   				staffWorkHardest_WithID.put(key, staffWithID_WorkingDay.get(key));
   			}
   		}

   		return staffWorkHardest_WithID;
    }

    // 10. Get the lecturer who work hardest
    public LinkedHashMap<String, Integer> getLecturerWorkHardest_WithID()
    {
    	LinkedHashMap<String, Integer> lecturerWithID_WorkingDay = getLecturerWithID_WorkingDay(); 

		LinkedHashMap<String, Integer> lecturerWorkHardest_WithID = new LinkedHashMap<String, Integer>();

   		String key_max = "";
   		int values_max = Collections.max(lecturerWithID_WorkingDay.values());

   		for(String key : lecturerWithID_WorkingDay.keySet())
   		{
   			if(values_max == lecturerWithID_WorkingDay.get(key))
   			{
   				lecturerWorkHardest_WithID.put(key, lecturerWithID_WorkingDay.get(key));
   			}
   		}

   		return lecturerWorkHardest_WithID;
    }
	  
    // 11. Get employeeID and salary of lecturer
    public LinkedHashMap<String, Double> getLecturerWithID_Salary()
    {
		ArrayList<lecturer> lecturerList = getLecturerList();
   		LinkedHashMap<String, Double> lecturerWithID_Salary = new LinkedHashMap<String, Double>();

   		for(lecturer lecturer_one : lecturerList)
   		{
   			lecturerWithID_Salary.put(lecturer_one.getID(), lecturer_one.getSalary());
   		}

   		return lecturerWithID_Salary;
    }

    // 12. Get employeeID and salary of staff
    public LinkedHashMap<String, Double> getStaffWithID_Salary()
    {
		ArrayList<staff> staffList = getStaffList();    	
   		LinkedHashMap<String, Double> staffWithID_Salary = new LinkedHashMap<String, Double>();

   		for(staff staff_one : staffList)
   		{
   			staffWithID_Salary.put(staff_one.getID(), staff_one.getSalary());
   		}

   		return staffWithID_Salary;
    }

   	// 13. Get the lecturer who has the highest salary
    public LinkedHashMap<String, Double> getLecturerHighestSalary()
    {
    	LinkedHashMap<String, Double> lecturerWithID_Salary = getLecturerWithID_Salary(); 

		LinkedHashMap<String, Double> lecturerWithID_HighestSalary = new LinkedHashMap<String, Double>();

   		String key_max = "";
   		double values_max = Collections.max(lecturerWithID_Salary.values());

   		for(String key : lecturerWithID_Salary.keySet())
   		{
   			if(values_max == lecturerWithID_Salary.get(key))
   			{
   				lecturerWithID_HighestSalary.put(key, lecturerWithID_Salary.get(key));
   			}
   		}

   		return lecturerWithID_HighestSalary;
    }

   	// 14. Get the staff who has the highest salary
    public LinkedHashMap<String, Double> getStaffHighestSalary()
    {
    	LinkedHashMap<String, Double> staffWithID_Salary = getStaffWithID_Salary(); 

		LinkedHashMap<String, Double> staffWithID_HighestSalary = new LinkedHashMap<String, Double>();

   		String key_max = "";
   		double values_max = Collections.max(staffWithID_Salary.values());

   		for(String key : staffWithID_Salary.keySet())
   		{
   			if(values_max == staffWithID_Salary.get(key))
   			{
   				staffWithID_HighestSalary.put(key, staffWithID_Salary.get(key));
   			}
   		}

   		return staffWithID_HighestSalary;
    }
 
    public ArrayList<lecturer> fromID_PrintOutAllDetailsOfLecturer(LinkedHashMap<String, Double> dmcuocdoi)
    {
    	ArrayList<lecturer> lecturerListFromID = new ArrayList<lecturer>();

    	for(String key : dmcuocdoi.keySet())
    	{
    		for(lecturer lecturer_one : getLecturerList())
    		{
    			if(key.equals(lecturer_one.getID()))
    			{	
    				String[] details = lecturer_one.toString().split("_");
    				lecturerListFromID.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), details[4], details[5]));
    			}
    		}
    	}

    	return lecturerListFromID;
    }

    public ArrayList<staff> fromID_PrintOutAllDetailsOfStaff(LinkedHashMap<String, Double> dmcuocdoi)
    {
    	ArrayList<staff> staffListFromID = new ArrayList<staff>();

    	for(String key : dmcuocdoi.keySet())
    	{
    		for(staff staff_one : getStaffList())
    		{
    			if(key.equals(staff_one.getID()))
    			{	
    				String[] details = staff_one.toString().split("_");
    				staffListFromID.add(new staff(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), details[4], details[5]));
    			}
    		}
    	}

    	return staffListFromID;
    }


    // 14. Increase salaryCoefficient of all employee.
    public ArrayList<employee> increaseSalaryCoefficientOfAllEmployee(double increasingRate)
    {	
    	ArrayList<employee> newEmployeeList = new ArrayList<employee>();

		for(employee employee_one  : this.employeeList)
		{
			if(employee_one.getID().startsWith("LT"))
			{
				String[] details = employee_one.toString().split("_");
				newEmployeeList.add(new lecturer(details[0], details[1], Double.parseDouble(details[2]) * (1 + increasingRate), Integer.parseInt(details[3]), details[4], details[5]));
			}
			else if(employee_one.getID().startsWith("ST"))
			{
				String[] details = employee_one.toString().split("_");
				newEmployeeList.add(new staff(details[0], details[1], Double.parseDouble(details[2]) * (1 + increasingRate), Integer.parseInt(details[3]), details[4], details[5]));
			}
		}

		return newEmployeeList;
    }

   	public void printOutEmployeeList() // Done
   	{
   		int i = 1, j = 1;
   		System.out.println("-------------List of lecturer-------------");
   		for(lecturer lecturer_one : getLecturerList())
   		{
   			String[] details = lecturer_one.toString().split("_");
   			System.out.println("Lecturer " + i);
   			System.out.println("Full Name: " + details[1]);
   			System.out.println("Salary Coefficient: " + decimalFormat.format(Double.parseDouble(details[2])));
   			System.out.println("Working day: " + decimalFormat.format(Integer.parseInt(details[3])));
   			System.out.println("Degree: " + details[4]);
   			System.out.println("Faculty: " + details[5]);  		
   			System.out.println("Allowance: " + decimalFormat.format(lecturer_one.getAllowance()));
   			System.out.println("Salary: " + decimalFormat.format(lecturer_one.getSalary()) + "\n");
   			i++;	
   		}

   		System.out.println("-------------List of staff-------------");
   		for(staff staff_one : getStaffList())
   		{
   			String[] details = staff_one.toString().split("_");
   			System.out.println("Staff " + j);
   			System.out.println("Full Name: " + details[1]);
   			System.out.println("Salary Coefficient: " + decimalFormat.format(Double.parseDouble(details[2])));
   			System.out.println("Working day: " + decimalFormat.format(Integer.parseInt(details[3])));
   			System.out.println("Duty: " + details[4]);
   			System.out.println("Department: " + details[5]);  		
   			System.out.println("Allowance: " + decimalFormat.format(staff_one.getAllowance()));
   			System.out.println("Salary: " + decimalFormat.format(staff_one.getSalary()) + "\n");
   			j++;	
   		}
   	}

   	public void printOutITLecturer() // Done
   	{
   		int i = 1;
   		System.out.println("-------------List of IT lecturer-------------");

   		for(lecturer lecturer_one : getLecturerOfITFaculty())
   		{
   			String[] details = lecturer_one.toString().split("_");
   			System.out.println("Lecturer " + i);
   			System.out.println("Full Name: " + details[1]);
   			System.out.println("Salary Coefficient: " + decimalFormat.format(Double.parseDouble(details[2])));
   			System.out.println("Working day: " + decimalFormat.format(Integer.parseInt(details[3])));
   			System.out.println("Degree: " + details[4]);
   			System.out.println("Faculty: " + details[5]);  		
   			System.out.println("Allowance: " + decimalFormat.format(lecturer_one.getAllowance()));
   			System.out.println("Salary: " + decimalFormat.format(lecturer_one.getSalary()) + "\n");
   			i++;	
   		}
   	}

   	public void printOutSalaryOFITLecturerKhai() // Done
   	{
   		int i = 1;
   		System.out.println("-------------Salary of IT lecturer whose name is Khai-------------");

   		for(lecturer lecturer_one : getSpecificLecturerOFITFaculty("Khai"))
   		{
   			String[] details = lecturer_one.toString().split("_");
   			System.out.println("Lecturer " + i);
   			System.out.println("Full Name: " + details[1]);
   			// System.out.println("Salary Coefficient: " + decimalFormat.format(Double.parseDouble(details[2])));
   			// System.out.println("Working day: " + decimalFormat.format(Integer.parseInt(details[3])));
   			// System.out.println("Degree: " + details[4]);
   			// System.out.println("Faculty: " + details[5]);  		
   			// System.out.println("Allowance: " + decimalFormat.format(lecturer_one.getAllowance()));
   			System.out.println("Salary: " + decimalFormat.format(lecturer_one.getSalary()) + "\n");
   			i++;	
   		}   		
   	}

   	public void printOutTheEmployeeWhoseHasTheHighestSalary() // Done
   	{
    	int i = 1, j = 1;
   		System.out.println("-------------List of lecturer who has the highest salary-------------");
   		for(lecturer lecturer_one : fromID_PrintOutAllDetailsOfLecturer(getLecturerHighestSalary()))
   		{
   			String[] details = lecturer_one.toString().split("_");
   			System.out.println("Lecturer " + i);
   			System.out.println("Full Name: " + details[1]);
   			System.out.println("Salary Coefficient: " + decimalFormat.format(Double.parseDouble(details[2])));
   			System.out.println("Working day: " + decimalFormat.format(Integer.parseInt(details[3])));
   			System.out.println("Degree: " + details[4]);
   			System.out.println("Faculty: " + details[5]);  		
   			System.out.println("Allowance: " + decimalFormat.format(lecturer_one.getAllowance()));
   			System.out.println("Salary: " + decimalFormat.format(lecturer_one.getSalary()) + "\n");
   			i++;	
   		}

   		System.out.println("-------------List of staff who has the highest salary-------------");
   		for(staff staff_one : fromID_PrintOutAllDetailsOfStaff(getStaffHighestSalary()))
   		{
   			String[] details = staff_one.toString().split("_");
   			System.out.println("Staff " + j);
   			System.out.println("Full Name: " + details[1]);
   			System.out.println("Salary Coefficient: " + decimalFormat.format(Double.parseDouble(details[2])));
   			System.out.println("Working day: " + decimalFormat.format(Integer.parseInt(details[3])));
   			System.out.println("Duty: " + details[4]);
   			System.out.println("Department: " + details[5]);  		
   			System.out.println("Allowance: " + decimalFormat.format(staff_one.getAllowance()));
   			System.out.println("Salary: " + decimalFormat.format(staff_one.getSalary()) + "\n");
   			j++;	
   		}  		
   	}

   	public void printOutSalaryOfEmployeeAfterIncreaseSalaryCoefficient()
   	{
   		ArrayList<employee> newEmployeeList = increaseSalaryCoefficientOfAllEmployee(0.1);

			
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


