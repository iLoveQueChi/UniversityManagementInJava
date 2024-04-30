import java.util.Scanner;

public class menu
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		boolean status = true;

		do 
		{
			System.out.println("Select a function from 1 to 10:\n");
			
			// List of function can be use
			System.out.println("1. Print out of all lecture ");
			System.out.println("2. Print out salary of Executive Staff whose name is Khai ");
			System.out.println("3. Print out the employee has the highest salary");
			System.out.println("4. Increase salary coefficient of all employee by 0.1 ");
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
					break;
				case 2:
					System.out.println("System will handle function 2 ...");
					break;
				case 3:
					System.out.println("System will handle function 3 ...");
					break;
				case 4:
					System.out.println("System will handle function 4 ...");
					break;
				case 5:
					System.out.println("System will handle function 5 ...");
					break;
				case 6:
					System.out.println("System will handle function 6 ...");
					break;
				case 7:
					System.out.println("System will handle function 7 ...");
					break;		
				case 8:
					System.out.println("System will handle function 8 ...");
					break;
				case 9:
					System.out.println("System will handle function 9 ...");
					break;
				case 10:
					System.out.println("System will handle function 10 ...");
					break;																		
				default:
					System.out.println("Good bye");
					status = false;
				break;
			}
		} while (status);
	}
}