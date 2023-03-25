public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", 23, Gender.MALE);
        Person jane = new Person("Jane", 27, Gender.FEMALE);

        System.out.println(john.getName());
        System.out.println(jane.getName());
    }
}