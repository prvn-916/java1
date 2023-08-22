package LCM;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int gcd = 1;
        for(int i = 1; i <= a&& i<=b; i++){
        if(a%i == 0 && b%i == 0)
        gcd = i;
        

        }
        int lcm = a*b/gcd;
        System.out.println(lcm);
        s.close();
    }
    
}
