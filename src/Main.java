public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", 23, Gender.MALE);
        Person jane = new Person("Jane", 27, Gender.FEMALE);

        System.out.println(john.getName());
        System.out.println(jane.getName());

        Employee mike = new Employee("Mike", 36, Gender.MALE, 67);
        Employee anotherMike = new Employee("Mike", 46, Gender.MALE, 27);
        Employee anna = new Employee("Anna", 28, Gender.FEMALE, 56);

        System.out.println(mike.isSameName(anotherMike));
        System.out.println(mike.isSameName(anna));

        Employee [] employeeArray = {mike, anotherMike, anna};

        System.out.println(Salary.getSum(employeeArray));
    }
}