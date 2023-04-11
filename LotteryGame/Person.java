package LotteryGame;

public class Person {

    // balance
    private int balance;
    int moneyLeft;
    final int TICKET_MONEY = 4;
    private String name;

    /**
     * constructor for person who play lottery
     * 
     * @param balance
     */
    public Person(String name, int balance) {
        this.name = name;
        this.balance = balance;

    }

    public int getbalance() {
        return balance;
    }

    public void setbalance(int balance) {
        this.balance = balance;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int calLeftMoney(int winMoney) {
        this.balance = this.getbalance() + winMoney;

        return this.balance;
    }

    /**
     * this method will determine if player want to choose number or random their
     * choice
     * 
     * @return an array of player choice
     */
    // buyTicket
    public int[] buyTicket(int[] ticket) {

        int[] currentTicket = ticket;
        this.balance -= TICKET_MONEY;
        return currentTicket;

    }
}
