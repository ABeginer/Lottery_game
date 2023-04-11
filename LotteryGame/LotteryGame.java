package LotteryGame;

import java.util.Scanner;
import java.util.Arrays;

public class LotteryGame {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            

            Person bob = new Person("Bob", 1000);

            System.out.print("\nhow many time you want to play?: ");
            int timePlayed = scan.nextInt();

            System.out.print("\ndo you want to choose your own number(y/n): ");
                String choice = scan.next();

            for (int a = 0; a < timePlayed; a++) {
                boolean check = true;
                
                System.out.printf("the current balance of %s is: $%d", bob.getname(), bob.getbalance());

                int[] input = new int[6];
                if (choice.equals("y")) {
                    while (check) {
                        System.out.print("\ninput 6 number range between 1 and 49: ");

                        for (int x = 0; x < 6; x++) {
                            input[x] = scan.nextInt();

                        }
                        boolean valid = Ticket.checkValid(input);
                        if (valid) {
                            System.out.print("\nERROR: your input must between (1-49), please try again\n\n");

                        } else
                            check = false;

                    }
                } else {
                    input = Ticket.generateTicketNumber();
                }

                bob.buyTicket(input);

                int[] winNumbers = Ticket.generateTicketNumber();
                System.out.printf("\nyour choosen numbers are: %s\nThe winning numbers are: %s",
                        Arrays.toString(input),
                        Arrays.toString(winNumbers));
                int timeMatched = Ticket.timeMatched(input, winNumbers);
                System.out.printf("\nyou have %d matched numbers", timeMatched);
                int winMoney = Ticket.declarePrize(timeMatched);
                System.out.printf("\nyou have won: $%d", winMoney);
                int finalMoney = bob.calLeftMoney(winMoney);
                System.out.printf("\n%s's new balance is: $%d\n", bob.getname(), finalMoney);

            }
        }
    }

}
