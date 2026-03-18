import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
       
        int n = suits.length * ranks.length;


        String[] deck = initializeDeck(suits, ranks, n);
        String[] shuffledDeck = shuffleDeck(deck, n);

     
        System.out.print("Enter number of players: ");
        int x = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        String[][] players = distributeCards(shuffledDeck, x, cardsPerPlayer, n);

        if (players != null) {
            printPlayers(players);
        } else {
            System.out.println("Error: Not enough cards to distribute.");
        }
    }

    public static String[] initializeDeck(String[] suits, String[] ranks, int n) {
        String[] deck = new String[n];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck, int n) {
        for (int i = 0; i < n; i++) {
           
            int r = i + (int) (Math.random() * (n - i));
            
         
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int x, int cardsPerPlayer, int n) {
        if (x * cardsPerPlayer > n) {
            return null;
        }

        String[][] players = new String[x][cardsPerPlayer];
        int deckIndex = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }
        return players;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s Hand:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(" - " + players[i][j]);
            }
        }
    }
}