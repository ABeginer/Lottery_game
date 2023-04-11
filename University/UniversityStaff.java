package University;

public class UniversityStaff {
    private String name;
    final String NATIONAL_ID;

    private double hourlyRate, totalWorkingHour;

    public UniversityStaff(String name, String NATIONAL_ID, double hourlyRate, double totalWorkingHour) {
        this.name = name;
        this.NATIONAL_ID = NATIONAL_ID;
        this.hourlyRate = hourlyRate;
        this.totalWorkingHour = totalWorkingHour;
    }

    public double earning() {
        double earning = this.hourlyRate * this.totalWorkingHour;
        return earning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalWorkingHour() {
        return totalWorkingHour;
    }

    public void setTotalWorkingHour(double totalWorkingHour) {
        this.totalWorkingHour = totalWorkingHour;
    }

    public String toString() {
        return "\nfirst name is: " + this.getName() + "\nSocial security numbers: " + this.NATIONAL_ID + "\nHourly rate is: "
                + this.getHourlyRate() + "\nTotal working hours: " + getTotalWorkingHour() + "\nEarning: " + this.earning();
    }
}
