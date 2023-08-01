import java.util.Scanner;

class problem{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter value of a:");
        int a = s.nextInt();
        System.out.println("enter value of b:");
        int b = s.nextInt();
        int rem ;
        int c= 0;
        s.close();
        for(int i=1; i<=a; i++)
        {
            if(a>b && rem!=0)
            rem = a%b;
            c = rem; 
            rem = c%a;
            
            
        }
        System.out.println(c);
    }
}