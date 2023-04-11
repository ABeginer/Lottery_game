package University;

public class Lecturer extends UniversityStaff {
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Lecturer(String name, String NATIONAL_ID, double hourlyRate, double totalWorkingHour, double baseSalary) {
        super(name, NATIONAL_ID, hourlyRate, totalWorkingHour);
        this.baseSalary = baseSalary;
    }

    public double earning() {
        double earning = baseSalary + (this.getHourlyRate() * this.getTotalWorkingHour());
        return earning;
    }

    public String toString() {
        return "\nUniversity Staff: " + this.getName() + "\nNational ID: " + this.NATIONAL_ID + "\nHourly rate: "
                + this.getHourlyRate() + "\nTotal working hours: " + getTotalWorkingHour() + "\nEarning: " + this.earning()
                + "\nBase Salary: " + this.getBaseSalary();
    }

}
