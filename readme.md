
# Program to manage information of Staff and Lecturer
* [Details requirement and Deadline](https://docs.google.com/document/d/1DuYoXo2PoY21FHdF_kSY2StseaumAAp9/edit) (Note: Use student's gmail with `@student.tdtu.edu.vn` extension)
* [Github]: https://github.com/loveCiForever/UniversityManagementInJava

        
```mermaid
classDiagram

employee <|-- staff
employee <|-- lecturer

<<abstract>> employee
employee : #String employeeID
employee : #string fullName
employee : #double salaryCoefficient
employee : #int workingDay

employee : +employee(String employeeID, String fullName, double salaryCoefficient, int workingDay)

employee : +getFullName() String 
employee : +getEmployeeID() String
employee : +getSalaryCoefficient() double
employee : +getWorkingDay() int

employee : +setFullName() void 
employee : +setID() void
employee : +setSalaryCoefficient() void
employee : +setWorkingDay() void

employee : +toString() String
employee : +getSalary()* double
employee : +getAllowance()* double 

class staff{
    +String department
    +String duty

    +staff(String employeeID, String fullName, double salaryCoefficient, String department, String duty, int workingDay)
    
    +getDepartment() String
    +getDuty() String

    +setDepartment() void
    +setDuty() void

    +getSalary() double 
    +toString() String 
    +getAllowance() double 
}

class lecturer{
    +String faculty
    +String degree

    +lecturer(String employeeID, String fullName, double allowance, double salaryCoefficient, String department, String duty, int workingDay)
    
    +getFaculty() String
    +getDegree() String

    +setFaculty() void
    +setDegree() void

    +getSalary() double 
    +toString() String 
    +getAllowance() double 
}

class university{
    -ArrayList<employee> employeeList

    +university(String employeePath)

    +getEmployeeList() employee

    +setEmployeeList(ArrayList<employee> newEmployeeList) void

    +loadInEmployeeList(String employeePath) employee
    +getLecturerList() lecturer
    +getStaffList() staff
    +getITLecturerList() lecturer
    +getSpecificLecturerOFITFacultyList_ByName(String name) lecturer
    +getEmployeeID_WorkingDayOfLecturer() LinkedHashMap<String, Integer>
    +getEmployeeID_WorkingDayOfStaff() LinkedHashMap<String, Integer>
    +getEmployeeID_WorkingDayOfHardestStaff() LinkedHashMap<String, Integer>
    +getEmployeeID_WorkingDayOfHardestLecturer() LinkedHashMap<String, Integer>
    +getEmployeeID_SalaryOfLecturer() LinkedHashMap<String, Double>
    +getEmployeeID_SalaryOfStaff() LinkedHashMap<String, Double>
    +getEmployeeID_HighestSalaryOfLecturer() LinkedHashMap<String, Double>
    +getEmployeeID_HighestSalaryOfStaff() LinkedHashMap<String, Double>
    +getLecturerList_ByID() ArrayList<lecturer>
    +getStaffList_ByID() ArrayList<staff>   
    +increaseSalaryCoefficientOfAllEmployee(double increasingRate) ArrayList<employee>
    +decreaseSalaryCoefficientOfAllEmployee(double decreasingRate) ArrayList<employee>
    +getEmployeeID_LecturerHaveSalaryHigherThan(double lowerBound) LinkedHashMap<String, Double>
    +getEmployeeID_StaffHaveSalaryHigherThan(double lowerBound) LinkedHashMap<String, Double>

    +loadFile(String filePath) String ArrayList
  }

```

