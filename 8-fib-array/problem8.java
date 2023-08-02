import java.util.Scanner;

class problem8{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the nth value:");
        int n = s.nextInt();
        int ans = 0;
        int x = 0;
        int y = 1;
        s.close();    
        for(int i =1; i<=n;i++)
        {   
            System.out.print(ans+" ");  
            ans =x+y;
            x=y;
            y=ans;                                  
        }      
    }
}