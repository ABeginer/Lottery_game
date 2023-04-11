package Delivery;

public class Service {
    public double foodDelivery(int lenght){
        double fee = 1 * lenght;
        double diverFee = fee*0.8;
        
        return diverFee;
    }
    public double expressDelivery(int lenght){
        double fee = 2 * lenght;
        double diverFee = fee*0.8;
        return diverFee;
    }
    public double indayDelivery(int lenght){
        double fee = 0.5 * lenght;
        double diverFee = fee*0.8;
        return diverFee;
    }
}
