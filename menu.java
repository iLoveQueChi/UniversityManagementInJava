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
			System.out.println("1. Load in the list of employee's details ");
			System.out.println("2. Print out the list of IT lecturer ");
			System.out.println("3. Print out the salary of IT lecturer whose name is Khai ");
			System.out.println("4. Print out the employee has the highest salary");
			System.out.println("5. Increase salary coefficient of all employee by 0.1 ");

			System.out.println("5. Print out the total salary of the whole lecture and executive staff");
			System.out.println("6. Print out the lecture and executive staff who have salary more than 15.000.000 VND");
			System.out.println("7. Print out salaries of staff and faculty in descending order");
			System.out.println("8. Print out salaries of staff and faculty in ascending order");
			System.out.println("9. ");
			System.out.println("10. \n");

			System.out.printf("Your choice: ");
			int choice = input.nextInt();

			switch (choice) 
			{
				case 1:
					System.out.println("System will handle function 1 ...");
					System.out.println("The program had loaded in the list of employee's details: " + "\n");
					tdtu.printOutEmployeeList();
					break;
				case 2:
					System.out.println("System will handle function 2 ...");
					System.out.println("The list of IT lecturer:" + "\n");
					tdtu.printOutITLecturer();
					break;
				case 3:
					System.out.println("System will handle function 3 ...");
					System.out.println("Salary of IT lecturer whose name is Khai" + "\n");
					tdtu.printOutSalaryOFITLecturerKhai();
					break;
				case 4:
					System.out.println("System will handle function 4 ...");
					System.out.println("The employee has the highest salary" + "\n");
					tdtu.printOutTheEmployeeWhoseHasTheHighestSalary();
					break;
				case 5:
					System.out.println("System will handle function 5 ...");
					System.out.println("Salary of all employee after Increase salary coefficient by 0.1" + "\n");
					tdtu.printOutSalaryOfEmployeeAfterIncreaseSalaryCoefficient();
					break;
				case 6:
					System.out.println("System will handle function 6 ...");
					System.out.println("" + "\n");
					break;
				case 7:
					System.out.println("System will handle function 7 ...");
					System.out.println("" + "\n");
					break;		
				case 8:
					System.out.println("System will handle function 8 ...");
					System.out.println("" + "\n");
					break;
				case 9:
					System.out.println("System will handle function 9 ...");
					System.out.println("" + "\n");
					break;
				case 10:
					System.out.println("System will handle function 10 ...");
					System.out.println("" + "\n");
					break;																		
				default:
					System.out.println("Good bye");
					status = false;
				break;
			}
		} while (status);
	}
}
