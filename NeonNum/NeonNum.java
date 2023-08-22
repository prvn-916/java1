package NeonNum;

import java.util.Scanner;

public class NeonNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int m = n*n;
        int sum = 0;
        while(m!=0){
            int k = m%10;
            sum = sum+ k;
            m = m/10;
        }

        if(sum == n)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
    
}
