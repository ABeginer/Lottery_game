package ThirdProblem;

public class Information {
    public static void main(String[] args) {
       Student student1 = new Student("bob", "ThatStreet ", "IT ", 3, 1000);
        System.out.printf("%s's infomation is: %s", student1.getName(), student1.toString());

        Staff staff1 = new Staff("Mike", "TheOtherStreet", "IU", 9999);
        System.out.printf("\n\n%s's information is: %s", staff1.getName(), staff1.toString());
    }
}
