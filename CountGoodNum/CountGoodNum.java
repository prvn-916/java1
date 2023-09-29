package CountGoodNum;

import java.util.Scanner;

class CountGoodNum {
    public int countGoodNumbers(long n) {
        if(n%2 ==1){
            return (int) (modPow(4 * 5, n / 2) * ( 5) % kMod);

        }
        else
            return (int) (modPow(4 * 5, n / 2) % kMod);
    }

  private static final int kMod = 1_000_000_007;

  private long modPow(long x, long n) {
    if (n == 0)
      return 1;
    if (n % 2 == 1)
      return x * modPow(x, n - 1) % kMod;
    return modPow(x * x % kMod, n / 2);
  }
  public static void main(String[] args) {
    CountGoodNum CountGoodNum = new CountGoodNum();
    Scanner s = new Scanner(System.in);
    long n = s.nextLong();
    System.out.println(CountGoodNum.countGoodNumbers(n));
    s.close();
  }
}
