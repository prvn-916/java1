import java.util.Scanner;

class problem1{
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);  
        System.out.println("enter number");
        int num1 = num.nextInt();
        int count = 0;
        num.close();
        if( num1<=1){
        System.out.println("given number is not a prime number");
        }
        else{
        for(int i=2; i<=num1; i++)
        {
            if(num1%i == 0)
            count++;
            if(count>=2)
            {
                break;
            }
               
        }      
        if (count>=2)
        System.out.println("NO");
         else 
            System.out.println("YES");     
    }
}
}