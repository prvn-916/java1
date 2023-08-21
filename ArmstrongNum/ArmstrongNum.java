
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int  temp, sum = 0, m;
        temp = n;
        int count = 0;
        int oderOfn = (int) Math.log10(n) + 1;
       
        while(n > 0){
            m = n%10;
        
            sum = (int) (sum+ Math.pow(m, oderOfn));
            n = n/10;
        }
        if(temp == sum)
        System.out.println("1");
        else
        System.out.println("0");
        
    }
    
}