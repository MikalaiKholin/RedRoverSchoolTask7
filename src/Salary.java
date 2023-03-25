import java.util.Arrays;

public class Salary {
    public static double getSum(Employee[] employeeArray){
        double sum = 0;
        for (Employee e : employeeArray){
            sum += e.getSalary();
        }
       return sum;
    }
}
