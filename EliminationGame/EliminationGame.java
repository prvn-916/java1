package EliminationGame;

import java.util.Scanner;

class EliminationGame {
    public int lastRemaining(int n) {
       return n == 1 ? 1 : 2 * (1 + n / 2 - lastRemaining(n / 2));
        
    }
    public static void main(String[] args) {
        EliminationGame EliminationGame = new EliminationGame();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(EliminationGame.lastRemaining(n));
        s.close();
    }
}