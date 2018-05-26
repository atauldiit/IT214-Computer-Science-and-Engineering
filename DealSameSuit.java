public class DealSameSuit {

    public static void main(String[] args) {
        int CARDS_PER_PLAYER = 5;

        // number of players
        int PLAYERS = 5;

        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int n = SUITS.length * RANKS.length;
        boolean isSameSuit = false;

        if (CARDS_PER_PLAYER * PLAYERS > n) {
            throw new RuntimeException("Too many players");
        }
        
        int account = 0;
        
        // initialize deck
        String[] deck = new String[n];
        String[] wordlast = new String[n];

        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // shuffle
        while (isSameSuit == false) {
            account++;
            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n - i));
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;

                String word = deck[i];
                String[] output = word.split(" ");
                wordlast[i] = output[2];
                //System.out.println(wordlast[i]);
                //System.out.println(i);
            }

            for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER;) {
                
                if (wordlast[i].equals(wordlast[i + 1]) && wordlast[i + 1].equals(wordlast[i + 2]) && wordlast[i + 2].equals(wordlast[i + 3]) && wordlast[i + 3].equals(wordlast[i + 4])) //if (matchSuit == 5)
                {
                    isSameSuit = true;
                    System.out.println("*******************");
                    break;
                } else {
                    //System.out.println("(:");
                    i = i + 5;
                    //System.out.println(i);
                }

                if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1) {
                    System.out.println();
                }
            }
        }
        
        System.out.println("How many deals it takes: "+ account+ "\n");
        
        // print shuffled deck
        for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
            System.out.println(deck[i]);
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1) {
                System.out.println();
            }
        }
    }
}

