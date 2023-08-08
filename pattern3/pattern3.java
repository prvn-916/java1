package pattern3;
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i, j;
        for ( i = 0; i < n; i++) {
            for ( j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
