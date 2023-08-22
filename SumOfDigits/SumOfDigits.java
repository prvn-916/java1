

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        s.close();
        int sum = 0, k;
        while(n!= 0){
        k = n % 10;
        sum = sum+ k;
        n = n/10;
        }
         System.out.println(sum);
    }
   
    
}
