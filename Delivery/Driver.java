package Delivery;



public class Driver extends Service {
    private String driverNUm;
    private int balance;
    
    
    public Driver(String driverNUm, int balance){
        this.driverNUm = driverNUm;
        this.balance = balance;
        
    }
    public String getDriver() {
        return driverNUm;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balace) {
        this.balance = balace;
    }
    
}
