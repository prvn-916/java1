package CircularGame;

import java.util.Scanner;

public class CircularGame {
    public int findTheWinner(int n, int k) {
        int winner = 0;
        
        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i;
        }
        
        return winner + 1;
    }
    public static void main(String[] args) {
        CircularGame circularGame = new CircularGame();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        System.out.println(circularGame.findTheWinner( n ,  k));
        s.close();
    }   
}
