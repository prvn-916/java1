import java.util.Scanner;

class problem{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the factorial value:");
        int n = s.nextInt();
        int remainder = 1;
        if (n==0 && n==1)
        System.out.println("1");
        for (int i=2; i<=n ; i++){
        remainder = remainder*i;
        }
        System.out.println("factorial value is:"+remainder);

    }
}