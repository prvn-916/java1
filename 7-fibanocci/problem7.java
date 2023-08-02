import java.util.Scanner;

class problem7{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the nth value:");
        int n = s.nextInt();
        int ans = 0;
        int x = 0;
        int y = 1;
        s.close();
        if(n < 1)
            System.out.println("Invalid input");
        else if(n == 1)
            System.out.println(x); 
        else if (n == 2)
            System.out.println(y);  
        else{         
        for(int i =3; i<=n;i++)
        {
            ans =x+y;
            x=y;
            y=ans;                       
        }
        System.out.println(ans);
    }      
    }
}