

import java.util.Scanner;

public class setBits {
    public static void main(String[] args) {
        
    
        Scanner s = new Scanner(System.in);
        int  t = s.nextInt();
        
        for(int i = 0 ; i<t; i++){
            int n = s.nextInt();
            
            int count = 0;
            while (n > 0) {
                count =count+ (n & 1);
                n =n >>1;
            }
            System.out.println(count);
        }
        s.close();
    }
}
