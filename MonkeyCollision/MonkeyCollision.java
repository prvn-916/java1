package MonkeyCollision;

import java.util.Scanner;

public class MonkeyCollision {
    public int monkeyMove(int n){
        int MOD = 1_000_000_007;
        long totalWays = modPow(2,n,MOD);
        int result = (int)(totalWays - 2 + MOD)%MOD;
        return result;
    }
    private long modPow(int x, int n, int mOD) {
        int result = 1;
        x = x%mOD;
        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * x) % mOD;
            }
            x = (x * x) % mOD;
            n /= 2;
        }
        
        return result;
    }
    public static void main(String[] args) {
        MonkeyCollision MonkeyCollision = new MonkeyCollision();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(MonkeyCollision.monkeyMove(n));
        s.close();

    }
    
}
