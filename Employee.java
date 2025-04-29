public class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println("Employee created: " + name);
    }
    public void displayinfo(){
        System.out.println("Displaying employee info...");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Employee info displayed successfully.");
    }
    
    public static void main(String[] args) {
        System.out.println("Main method started...");
        Employee emp = new Employee("John Doe", 12345, 55000.00);
        emp.displayinfo();
        System.out.println("Main method ended successfully.");
    }
}
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 12345, 55000.00);
        emp.displayinfo();
    }
}