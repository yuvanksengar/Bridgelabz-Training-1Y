import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;
        String[] choices = {"rock", "paper", "scissors"};

        for (int i = 0; i < n; i++) {
            System.out.print("Choice (rock, paper, scissors): ");
            String user = sc.next().toLowerCase();
            String comp = choices[(int)(Math.random() * 3)];
            
            System.out.println("Computer chose: " + comp);
            int res = getWinner(user, comp);
            if (res == 1) userWins++;
            else if (res == -1) compWins++;
        }

        double userPerc = (userWins * 100.0) / n;
        double compPerc = (compWins * 100.0) / n;

        System.out.printf("%-10s %-10s %-10s%n", "Entity", "Wins", "Percentage");
        System.out.printf("%-10s %-10d %-10.2f%%%n", "User", userWins, userPerc);
        System.out.printf("%-10s %-10d %-10.2f%%%n", "Computer", compWins, compPerc);
    }

    public static int getWinner(String u, String c) {
        if (u.equals(c)) return 0;
        if ((u.equals("rock") && c.equals("scissors")) || 
            (u.equals("paper") && c.equals("rock")) || 
            (u.equals("scissors") && c.equals("paper"))) return 1;
        return -1;
    }
}