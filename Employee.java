// Employee class to store employee details using constructor
class Employee {

    int empId;
    String empName;
    double salary;

    // static variable shared by all employees
    static String company = "IBM ";

    // constructor to initialize employee data
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // method to display employee details
    void display() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + company);
    }

    // TEMPORARY main method (for running this file)
    public static void main(String[] args) {

        // creating objects
        Employee e1 = new Employee(1, "Vinay", 800000);
        Employee e2 = new Employee(2, "Abhishek", 500000);

        // displaying details
        e1.display();
        e2.display();
    }
}