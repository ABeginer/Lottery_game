package University;

public class University {
    public static void main(String[] args) {
        UniversityStaff bob = new UniversityStaff("Bob", "12CB34", 20.0, 100.5);
        System.out.println(bob);

        Lecturer mike = new Lecturer("Mike", "32CD45", 23.5, 40.4, 15.5);
        System.out.println(mike);

    }
}
