

import java.util.Scanner;

public class XsetYunset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 1; i <= t ; i++){
            int x = s.nextInt();
            int y = s.nextInt();
            int m = 2;
            int k = (int) ((int) (Math.pow(m, x)-1)*(Math.pow(m, y)));
            System.out.println(k);

        }
        s.close();
    }
    
}
