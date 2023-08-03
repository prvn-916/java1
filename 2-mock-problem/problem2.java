import java.util.Scanner;

class problem2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value:");
        int num = s.nextInt();
        s.close();
        for(int i=1; i<=num; i++)
        {
            
            for(int j=1; j<=i; j++)
                {
                    System.out.print(j);
                }
             System.out.println();   
       }
       
    
    }
}