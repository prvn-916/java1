import java.util.Scanner;

public class evenOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 
                 if((n&1 ) == 1)
                System.out.println("ODD");
            else
                System.out.println("EVEN");            
        }     
    }  
}
