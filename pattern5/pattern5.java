package pattern5;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i,j;
        
		for (i = 1 ; i <=n; i++ ) 
		{
			for (j = 1 ; j <= n-i; j++ ) 
			{
				System.out.print(" ");	
			}
			for (j = 1 ; j <= n-1; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i = n-1 ; i > 0; i-- ) 
		{
			for (j = 1 ; j <= n-i; j++ ) 
			{
				System.out.print(" ");
			}
			for (j = 1 ; j <= n-1; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
    }   
    
}
