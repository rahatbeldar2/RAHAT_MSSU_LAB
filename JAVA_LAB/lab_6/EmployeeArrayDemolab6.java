import java.util.Scanner;
class Employee
{
    private String employee_name;
    private int employee_id;
    private int employee_sal;
    private int employee_age;

    static int count = 0;

    // Class constructor
    Employee(String employee_name, int employee_id,int employee_sal, int employee_age)
    {
        this.employee_name = employee_name;
        this.employee_id = employee_id;
        this.employee_sal = employee_sal;
        this.employee_age = employee_age;

        count++;
    }

    // Instance method to accept employee details
    void acceptEmployee()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        this.employee_name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        this.employee_id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        this.employee_sal = sc.nextInt();

        System.out.print("Enter Employee Age: ");
        this.employee_age = sc.nextInt();
    }

    // Instance method to display employee details
    void displayEmployee()
    {
        System.out.println("Employee Name: " +this.employee_name);
        System.out.println("Employee ID: " + this.employee_id);
        System.out.println("Employee Salary: " + this.employee_sal);
        System.out.println("Employee Age: " + this.employee_age);
    }

    // Static method to display total employee count
    static void getcount()
    {
        System.out.println("Total Employees: " + count);
    }

    // Instance method to increase salary
    void increaseSalary()
    {
        this.employee_sal = this.employee_sal + 20000;
    }
}

class EmployeeArrayDemolab6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("       EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("-----------------------------------------");

        // Accept number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Create array of Employee objects
        Employee emp[] = new Employee[n];

        // Construct Employee objects
        for(int i = 0; i < n; i++)
        {
            System.out.println("\nEnter details of Employee " + (i + 1));

            emp[i] = new Employee("", 0, 0, 0);

            emp[i].acceptEmployee();
        }

        // Display all employee details
        System.out.println("\n-----------------------------------------");
        System.out.println("       EMPLOYEE DETAILS");
        System.out.println("-----------------------------------------");

        for(int i = 0; i < n; i++)
        {
            System.out.println("\nEmployee " + (i + 1));
            emp[i].displayEmployee();
        }

        // Display total employee count
        System.out.println("\n-----------------------------------------");
        Employee.getcount();

        // Increase salary of every employee
        for(int i = 0; i < n; i++)
        {
            emp[i].increaseSalary();
        }

        // Display updated employee details
        System.out.println("\n-----------------------------------------");
        System.out.println("  UPDATED EMPLOYEE DETAILS");
        System.out.println("-----------------------------------------");

        for(int i = 0; i < n; i++)
        {
            System.out.println("\nEmployee " + (i + 1));
            emp[i].displayEmployee();
        }

        sc.close();

    }
}