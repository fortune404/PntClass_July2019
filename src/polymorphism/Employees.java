package polymorphism;

public class Employees
{
    String firstName;
    String lastName;
    double salary;
    String job;
    String employeeId;

    Employees()
    {

    }

    public Employees(String firstName, String lastName, double salary, String job, String employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.job = job;
        this.employeeId = employeeId;
    }

    public Employees(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employees(double salary, String job) {
        this.salary = salary;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
