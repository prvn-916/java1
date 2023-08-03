import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value:");
        int n = s.nextInt();
        int rem, sum = 0, temp;
        s.close();

        temp = n;
        while(n !=0){
            rem = n%10;
            sum = sum*10+rem;
            n = n/10;
        }
        if (temp==sum)
        System.out.println("Given number is palindrome");
        else
        System.out.println("Given number is not a palindrome");

    }
    
}
