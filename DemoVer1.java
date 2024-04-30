public abstract class Staff {
    private String name;
    private String department;
    private double salary;
    private double allowance;

    public Staff(String name, String department, double allowance) {
        this.name = name;
        this.department = department;
        this.allowance = allowance;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getAllowance() {
        return allowance;
    }

    public double getSalary() {
        return salary;
    }

    public void calculateSalary() {
        // Abstract method to be implemented by subclasses
    }

    public void displaySalaryDetails() {
        // Abstract method to be implemented by subclasses
    }
}

public class Faculty extends Staff {
    private int teachingLoad;
    private static final double BASE_SALARY = 830;
    private static final double DEGREE_COEFFICIENTS = new double[] {0, 300, 500, 1000};

    public Faculty(String name, String department, int teachingLoad, String degree) {
        super(name, department, DEGREE_COEFFICIENTS[degree.hashCode() % DEGREE_COEFFICIENTS.length]);
        this.teachingLoad = teachingLoad;
    }

    @Override
    public void calculateSalary() {
        salary = BASE_SALARY * 830 + getAllowance() + teachingLoad * 30;
    }

    @Override
    public void displaySalaryDetails() {
        System.out.println("Faculty: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: " + getSalary());
    }
}

public class StaffMember extends Staff {
    private int workingDays;
    private static final double BASE_SALARY = 830;
    private static final double POSITION_COEFFICIENTS = new double[] {0, 500, 1000, 1500};

    public StaffMember(String name, String department, int workingDays, String position) {
        super(name, department, POSITION_COEFFICIENTS[position.hashCode() % POSITION_COEFFICIENTS.length]);
        this.workingDays = workingDays;
    }

    @Override
    public void calculateSalary() {
        salary = BASE_SALARY * 830 + getAllowance() + workingDays * 50;
    }

    @Override
    public void displaySalaryDetails() {
        System.out.println("Staff Member: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: " + getSalary());
    }
}

import java.util.*;
import java.io.*;

public class StaffManagement {
    private List<Staff> staffList = new ArrayList<>();

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public void displayFacultyByDepartment(String department) {
        for (Staff staff : staffList) {
            if (staff instanceof Faculty && staff.getDepartment().equalsIgnoreCase(department)) {
                staff.displaySalaryDetails();
            }
        }
    }

    public void displayStaffMemberSalary(String department, String name) {
        for (Staff staff : staffList) {
            if (staff instanceof StaffMember && staff.getDepartment().equalsIgnoreCase(department) && staff.getName().equalsIgnoreCase(name)) {
                staff.displaySalaryDetails();
            }
        }}

    public void displayHighestSalaryDepartment() {
        Map<String, Double> departmentSalaries = new HashMap<>();
        for (Staff staff : staffList) {
            if (!departmentSalaries.containsKey(staff.getDepartment())) {
                departmentSalaries.put(staff.getDepartment(), staff.getSalary());
            } else {
                departmentSalaries.put(staff.getDepartment(), Math.max(departmentSalaries.get(staff.getDepartment()), staff.getSalary()));
            }
        }

        String highestSalaryDepartment = "";
        double highestSalary = 0;
        for (Map.Entry<String, Double> entry : departmentSalaries.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highestSalaryDepartment = entry.getKey();
            }
        }

        System.out.println("Department with highest salary: " + highestSalaryDepartment);
    }

    public void increaseStaffSalary(double increment) {
        for (Staff staff : staffList) {
            staff.calculateSalary();
            staff.setSalary(staff.getSalary() * (1 + increment));
        }
    }

    public void displayStaffSalaryAboveThreshold(double threshold) {
        for (Staff staff : staffList) {
            if (staff.getSalary() > threshold) {
                staff.displaySalaryDetails();
            }
        }
    }

    public void sortStaffBySalary() {
        Collections.sort(staffList, (s1, s2) -> (int) (s2.getSalary() - s1.getSalary()));
    }

    public void saveStaffDataToFile(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Staff staff : staffList) {
                writer.write(staff.getName() + "," + staff.getDepartment() + "," + staff.getSalary() + "," + staff.getAllowance() + "\n");
            }
        }
    }

    public void loadStaffDataFromFile(String filename) throws IOException {
        staffList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equalsIgnoreCase("Faculty")) {
                    addStaff(new Faculty(data[1], data[2], Integer.parseInt(data[3]), data[4]));
                } else {
                    addStaff(new StaffMember(data[1], data[2], Integer.parseInt(data[3]), data[4]));
                }
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaffManagement staffManagement = new StaffManagement();
        Scanner scanner = new Scanner(System.in);

        // Add staff members and faculty to the list
        // ...

        while (true) {
            System.out.println("1. Display faculty by department");
            System.out.println("2. Display staff member salary");
            System.out.println("3. Display highest salary department");
            System.out.println("4. Increase staff salary");
            System.out.println("5. Display staff salary above threshold");
            System.out.println("6. Sort staff by salary");
            System.out.println("7. Save staff data to file");
            System.out.println("8. Load staff data from file");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter department:");
                    String department = scanner.nextLine();
                    staffManagement.displayFacultyByDepartment(department);
                    break;
                case 2:
                    System.out.println("Enter department and name:");
                    department = scanner.nextLine();
                    String name = scanner.nextLine();
                    staffManagement.displayStaffMemberSalary(department, name);
                    break;
                case 3:
                    staffManagement.displayHighestSalaryDepartment();
                    break;
                case 4:
                    System.out.println("Enter increment:");
                    double increment = scanner.nextDouble();
                    staffManagement.increaseStaffSalary(increment);
                    break;
                case 5:
                    System.out.println("Enter threshold:");
                    double threshold = scanner.nextDouble();
                    staffManagement.displayStaffSalaryAboveThreshold(threshold);
                    break;
                case 6:
                    staffManagement.sortStaffBySalary();
                    break;
                case 7:
                    System.out.println("Enter filename:");
                    String filename = scanner.nextLine();
                    try {
                        staffManagement.saveStaffDataToFile(filename);
                    } catch (IOException e) {
                        System.err.println("Error saving data to file: " + e.getMessage());
                    }
                    break;
                case 8:
                    System.out.println("Enter filename:");
                    filename = scanner.nextLine();
                    try {
                        staffManagement.loadStaffDataFromFile(filename);
                    } catch (IOException e) {
                        System.err.println("Error loading data from file: " + e.getMessage());
                    }
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
       