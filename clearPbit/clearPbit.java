

import java.util.Scanner;

public class clearPbit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i =1; i<=t ; i++){
            int n = s.nextInt();
            int p = s.nextInt();
            if(p <= 0 & n == 0)
            System.out.println(n);
            if ((n & (1 << p)) != 0) {

                n = (n ^ (1 << p));
            }
     
            System.out.println(n);

        }
        s.close();
    }
    
}
