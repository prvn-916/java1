import java.util.Scanner;

class problem3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value:");
        int num = s.nextInt();
        int reverse = 0;
        System.out.println("given number:"+num);
        while(num != 0)
        {
            int A = num%10;
            reverse = reverse*10+ A;
            num = num/10;
        }
        System.out.println("reverses num:"+reverse);

    }
}