

import java.util.Scanner;

public class rightmostBit 
{
    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        int  t = s.nextInt();

        for(int i = 0 ; i<t; i++)
        {
          int n = s.nextInt();
          if (n == 1)
          System.out.println("-1");
          else
          {
            int k = 1;
            int count =1;
            while((n&k) != 0)
            {
              k = k <<1;
              count++;
            }
            System.out.println(count);
          }
        }
        s.close();
    }
}

   

    

