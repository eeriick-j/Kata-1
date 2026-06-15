public class Employee {
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getYearlySalary(){
        return salary*12;
    }

    @Override
    public String toString() {
        return "Employee {id=" + id  + ", name=" + name + ", salary=" + salary + "}";
    }
}
