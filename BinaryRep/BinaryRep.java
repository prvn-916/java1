package BinaryRep;
import java.util.Scanner;

public class BinaryRep{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = s.nextInt(); 
            StringBuilder binary = new StringBuilder();
          while (n > 0) {
            int bit = n & 1;
            binary.insert(0, bit);
            n = n>>1; 
        }
        
            System.out.println(binary.toString());
        }
        s.close();
    }
}
