package Delivery;

import java.util.Scanner;

public class Client extends Service {
    static Scanner scan = new Scanner(System.in);
    private String name;
    private int NumberOfOrder;

    private boolean bookFoodDel;
    private boolean bookEXDel;
    private boolean bookIndayDel;
    private int foodDelDis, exDelDis, indayDelDis;

 
    public Client(String name, int NumberOfOrder, boolean bookFoodDel, boolean bookEXDel, boolean bookIndayDel) {
        this.name = name;
        this.NumberOfOrder = NumberOfOrder;
        this.bookFoodDel = bookEXDel;
        this.bookEXDel = bookEXDel;
        this.bookIndayDel = bookIndayDel;

    }
   public int getIndayDelDis() {
        return indayDelDis;
    }

    public void setIndayDelDis(int indayDelDis) {
        this.indayDelDis = indayDelDis;
    }

    public int getExDelDis() {
        return exDelDis;
    }

    public void setExDelDis(int exDelDis) {
        this.exDelDis = exDelDis;
    }

    public int getFoodDelDis() {
        return foodDelDis;
    }

    public void setFoodDelDis(int foodDelDis) {
        this.foodDelDis = foodDelDis;
    }

    public void setBookFoodDel(boolean bookFoodDel) {
        this.bookFoodDel = bookFoodDel;
    }

    public boolean isBookFoodDel() {
        return bookFoodDel;
    }

    public void setBookEXDel(boolean bookEXDel) {
        this.bookEXDel = bookEXDel;
    }

    public boolean isBookEXDel() {
        return bookEXDel;
    }

    public void setBookIndayDel(boolean bookIndayDel) {
        this.bookIndayDel = bookIndayDel;
    }

    public boolean isBookIndayDel() {
        return bookIndayDel;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfOrder() {
        return NumberOfOrder;
    }

}
