import java.util.*;

public class menu {
    public static void main(String[] args) {
        String employeePath = "input.txt";
        university tdtu = new university(employeePath);

        Scanner input = new Scanner(System.in);
        boolean status = true;
        do {
            System.out.println("\n[MENU] Select a function from 1 to 15:\n");
            System.out.println("	1. Load in the list of employee's details");
            System.out.println("	2. Print out the list of IT lecturers");
            System.out.println("	3. Print out the list of lecturers");
            System.out.println("	4. Print out the list of staff");
            System.out.println("	5. Print out the salary of IT lecturer");
            System.out.println("	6. Print out the employee with the highest salary");
            System.out.println("	7. Increase salary coefficient of all employees by a given value");
            System.out.println("	8. Decrease salary coefficient of all employees by a given value");
            System.out.println("	9. Print out the total salary of all employees");
            System.out.println("	10. Print out the lecturers and staff with salary more than a given value");
            System.out.println("	11. Print arranged list of lecturers/staff by salary");
            System.out.println("	12. Save changes");
			
			int choice = 0;
            System.out.print("\nYour choice: ");
            if (input.hasNextInt()) {
				choice = input.nextInt();
			} else {
				System.out.println("Invalid input! Please enter an integer.");
			}
            switch (choice) {
                case 1:
                    System.out.println("The program has loaded the list of employee's details:\n");
                    tdtu.printOutEmployeeList();
                    System.out.println("[COMPLETED]\n");
                    break;
                case 2:
                    System.out.println("The list of IT lecturers:\n");
                    tdtu.printOutITLecturer();
                    System.out.println("[COMPLETED]\n");
                    break;
                case 3:
                    System.out.println("The list of lecturers:\n");
                    tdtu.printOutLecturer();
                    System.out.println("[COMPLETED]\n");
                    break;
                case 4:
                    System.out.println("The list of staff:\n");
                    tdtu.printOutStaff();
                    System.out.println("[COMPLETED]\n");                    
                    break;
                case 5:
                    System.out.print("Enter name of the IT lecturer: ");
                    String itLecturerName = input.nextLine();
                    System.out.println("Salary of IT lecturer " + itLecturerName + ":\n");
                    tdtu.printOutSalaryOFITLecturerList_ByName(itLecturerName);
                    break;
                case 6:
                    System.out.println("The employee with the highest salary:\n");
                    tdtu.printOutEmployeeWhoseHasTheHighestSalary();
                    System.out.println("[COMPLETED]\n");                    
                    break;
                case 7:
                    System.out.print("Enter the value to increase the salary coefficient by: ");
                    double increaseValue = input.nextDouble();
					input.nextLine();
                    System.out.println("Salary of all employees after increasing salary coefficient by " + increaseValue + ":\n");
                    tdtu.printOutSalaryOfEmployeeAfterIncreaseSalaryCoefficient(increaseValue);          
                    System.out.println("[COMPLETED]\n");                    
                    break;
                case 8:
                    System.out.print("Enter the value to decrease the salary coefficient by: ");
                    double decreaseValue = input.nextDouble();
					input.nextLine();
                    System.out.println("Salary of all employees after decreasing salary coefficient by " + decreaseValue + ":\n");
                    tdtu.printOutSalaryOfEmployeeAfterDecreaseSalaryCoefficient(decreaseValue);
                    System.out.println("[COMPLETED]\n");                    
                    break;
                case 9:
                    tdtu.printOutTotalSalaryOfEmployee();
                    System.out.println("[COMPLETED]\n");                    
                    break;
                case 10:
                    System.out.print("Enter the lower bound : ");
                    double salaryThreshold = input.nextDouble();
					input.nextLine();
                    System.out.println("Lecturers and staff with salary more than " + salaryThreshold + " VND:\n");
                    tdtu.printOutEmployeeHaveSalaryHigherThan(salaryThreshold);
                    System.out.println("[COMPLETED]\n");                    
                    break;
                case 11:
                    System.out.println("Print the  arranged list of lecturers/staff by salary:\n");
                    System.out.println("	1. Arrange lecturers by ascending salary");
                    System.out.println("	2. Arrange lecturers by descending salary");
                    System.out.println("	3. Arrange staff by ascending salary");
                    System.out.println("	4. Arrange staff by descending salary");

                    System.out.print("Choose an option: ");
                    int arrangeChoice = input.nextInt();

                    input.nextLine(); // Consume the newline character left after nextInt()

                    switch (arrangeChoice) {
                        case 1:
                            tdtu.printAscending(true);
                            break;
                        case 2:
                            tdtu.printDescending(true);
                            break;
                        case 3:
                            tdtu.printAscending(false);
                            break;
                        case 4:
                            tdtu.printDescending(false);
                            break;
                        default:
                            System.out.println("Invalid option.");
                            break;
                    }
                    System.out.println("[COMPLETED]\n");                    
                    break;
                case 12:
                    System.out.println("Saving changes to the file...\n");
                    tdtu.writeEmployeeListToFile(employeePath);
                    System.out.println("[COMPLETED]\n");                    
                    break;
                default:
                    System.out.println("Goodbye!");
                    status = false;
            }
        } while (status);
        input.close();
    }
}
