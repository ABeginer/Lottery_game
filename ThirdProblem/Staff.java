package ThirdProblem;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String getName, String getAddress, String school, double pay) {
        super(getName, getAddress);
        this.school = school;
        this.pay = pay;

    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String toString() {
        String name = "\nStudent name: ";
        String address = "\nStudent address: ";
        String school = "\nSchool: ";
        String pay = "\npay: ";
        String combine = name + getName() + 
        address + getAddress() + 
        school + getSchool() + 
        pay + getPay();
        return combine;
    }

}
