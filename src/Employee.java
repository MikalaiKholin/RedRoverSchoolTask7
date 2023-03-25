import org.jetbrains.annotations.NotNull;

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, Gender gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isSameName(@NotNull Employee employee) {
        return (this.getName().equals(employee.getName()));
    }
}
