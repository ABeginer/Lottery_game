package LotteryGame;

public class Ticket {

    /**
     * this method will let player input their choice
     * 
     * @return an array of player input
     */

    private static int randomNumber() {
        int randNum = (int) (Math.random() * (49) + 1);
        return randNum;
    }

    public static int[] generateTicketNumber() {
        int[] TicketNum = new int[6];
        for (int a = 0; a < 6; a++) {
            TicketNum[a] = randomNumber();
        }
        return TicketNum;
    }

    public static boolean checkValid(int[] userInput) {
       boolean valid = true;
        for(int x = 0 ; x < 6 ; x++){
        if(userInput[x]>49 || userInput[x]<1){
            valid = true;
            break;
        }
        else valid = false;
       }
       return valid;
        
           
    }

    public static int timeMatched(int[] playerNum, int[] winningNum) {
        int timeMatched = 0;
        // TODO local Array variable store winningNum
        for (int a = 0; a < 6; a++) {
            for (int b = 0; b < 6; b++) {
                if (playerNum[a] == winningNum[b]) {
                    timeMatched++;
                    break;
                }
            }
        }
        return timeMatched;
    }

    public static int declarePrize(int timeMatched) {

        final int prize1 = 10, prize2 = 100, prize3 = 1000, prize4 = 10000, prize5 = 100000;
        switch (timeMatched) {
            case 1:
                return prize1;
            case 2:
                return prize1;
            case 3:
                return prize2;
            case 4:
                return prize3;
            case 5:
                return prize4;
            case 6:
                return prize5;

        }
        return 0;

    }
}
