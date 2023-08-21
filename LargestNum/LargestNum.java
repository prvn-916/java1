

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        s.close();
        if(a>b && b>c)
        System.out.print(a);
        if(b>a && b>c)
        System.out.print(b);
        else
        System.out.print(c);

    }
    
}
