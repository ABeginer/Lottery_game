package ThirdProblem;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String getName, String getAddress, String program, int year, double fee) {
        super(getName, getAddress);
        this.program = program;
        this.year = year;
        this.fee = fee;

    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        String name = "\nStudent name: ";
        String address = "\nStudent address: ";
        String program = "\nProgram: ";
        String year = "\nYear: ";
        String fee = "\nfee: ";
        String combine = name + getName() +
                address + getAddress() +
                program + getProgram() +
                year + getYear() +
                fee + getFee();

        return combine;
    }

}