import java.util.Scanner;

class problem6{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the factorial value:");
        int n = s.nextInt();
        int remainder = 1;
        if(n > 1){
        for (int i=2; i<=n ; i++){
        remainder = remainder*i;
        s.close();
        }
        System.out.println("factorial value is:"+remainder);
    }
    else
    System.out.print("1");


    }
}