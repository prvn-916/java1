import java.util.Scanner;

public class sqrtRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value:");
        Double num = s.nextDouble();
        s.close();
        Double t, sqrt;

        sqrt = num/2;
        do{
            t = sqrt;
            sqrt = (t+ (num/t))/2;
        }
        while((t-sqrt)!=0);
        System.out.println("The square root value is:"+sqrt);
        
    }
    
}
