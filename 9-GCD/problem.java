import java.util.Scanner;

class problem{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter value of a:");
        int a = s.nextInt();
        System.out.println("enter value of b:");
        int b = s.nextInt();
        int x=1;
        int i = 1;
        s.close();
        for(i=1; i<=a; i++)
        {
            if(a%i == 0 && b%i == 0)
            x = i;               
        }
        System.out.println("Greatest common divisor:"+x);
    }
}