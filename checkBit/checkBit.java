package checkBit;

import java.util.Scanner;

public class checkBit {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        
        for(int i = 1; i<= k; i++){
        int n = s.nextInt();
        int p = s.nextInt();

        if((n & (1 <<p)) !=0)
        System.out.println("SET");
        else
        System.out.println("UNSET");
        }
        s.close();
        

    } 
}
