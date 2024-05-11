import java.util.Scanner;

public class menu
{
	public static void main(String args[])
	{
		university tdtu = new university("C:\\Users\\Nguyen Quang Huy\\Desktop\\EmployeeManagementSystemInJva\\employeeDetails.txt");

		Scanner input = new Scanner(System.in);
		boolean status = true;
		do 
		{
			System.out.println("Select a function from 1 to 10:\n");
			// List of function can be use
			System.out.println("1. Load in the list of employee's details");
			System.out.println("2. Print out the list of IT lecturer");
			System.out.println("3. Print out the list of lecturer");
			System.out.println("4. Print out the list of staff");
			System.out.println("5. Print out the salary of IT lecturer whose name is Khai");
			System.out.println("6. Print out the employee has the highest salary");
			System.out.println("7. Increase salary coefficient of all employee by 0.1 ");
			System.out.println("8. Decrease salary coefficient of all employee by 0.1 ");			
			System.out.println("9. Print out the total salary of the whole lecture and executive staff");
			System.out.println("10. Print out the lecture and executive staff who have salary more than 5.500.000 VND");

			System.out.printf("----------------------------Your choice: ");
			int choice = input.nextInt();

			switch (choice) 
			{
				case 1:
					System.out.println("The program had loaded in the list of employee's details: " + "\n");
					tdtu.printOutEmployeeList();
					break;
				case 2:
					System.out.println("The list of IT lecturer:" + "\n");
					tdtu.printOutITLecturer();
				case 3:
					System.out.println("The list of lecturer:" + "\n");
					tdtu.printOutLecturer();					
					break;
				case 4:
					System.out.println("The list of staff:" + "\n");
					tdtu.printOutStaff();
					break;					
				case 5:
					System.out.println("Salary of IT lecturer whose name is Khai" + "\n");
					tdtu.printOutSalaryOFITLecturerKhai();
					break;
				case 6:
					System.out.println("The employee has the highest salary" + "\n");
					tdtu.printOutEmployeeWhoseHasTheHighestSalary();
					break;
				case 7:
					System.out.println("Salary of all employee after Increase salary coefficient by 0.1" + "\n");
					tdtu.printOutSalaryOfEmployeeAfterIncreaseSalaryCoefficient(0.1);
					break;
				case 8:
					System.out.println("Salary of all employee after decrease salary coefficient by 0.1" + "\n");
					tdtu.printOutSalaryOfEmployeeAfterDecreaseSalaryCoefficient(0.2);
					break;
				case 9:
					System.out.println("Total of salary university have to pay for its employee: ");
					tdtu.printOutTotalSalaryOfEmployee();
					break;
				case 10:
					System.out.println("Print out the lecture and executive staff who have salary more than 5.500.000 VND" + "\n");
					tdtu.printOutEmployeeHaveSalaryHigherThan(5500000.00);
					break;																			
				default:
					System.out.println("Good bye");
					status = false;
				break;
			}
		} while (status);
	}
}
