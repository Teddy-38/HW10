public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = " Ivanov";
        String fullName = (firstName + middleName + lastName);
        System.out.println(fullName);
        System.out.println();
        System.out.println("Task2");
        System.out.println((firstName.toUpperCase() + middleName.toUpperCase() + lastName.toUpperCase()));
        System.out.println("Task3");
        String people = "Иванов Семён Семёнович";
        String streetTrue = people.replace("ё", "е");
        System.out.println(streetTrue);
    }
}