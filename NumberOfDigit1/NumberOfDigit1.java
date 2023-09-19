package NumberOfDigit1;

import java.util.Scanner;

class NumberOfDigit1 {
    public int countDigitOne(int n) {
        
        int countr = 0;
    for (int i = 1; i <= n; i++)
    {
        String str = String.valueOf(i);
        countr =countr+ str.split("1", -1) . length - 1;
    }
    return countr;      
    }
    public static void main(String[] args) {
        NumberOfDigit1 NumberOfDigit1 = new NumberOfDigit1();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println(NumberOfDigit1.countDigitOne(n));
    }
}