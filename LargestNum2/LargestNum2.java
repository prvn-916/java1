package LargestNum2;

import java.util.Scanner;

public class LargestNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s =  scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        int result = 0;
        if(s > n*9)
        System.out.println("-1");
        else
        {
            for(int i = 0; i<n; i++){
                if(s>=9){
                    result = result*10+9;
                    s = s-9;
                }
                else{
                result = result*10+s;
                s = 0;
                }
                
            }
                System.out.println(result);
        }
        
    }
    
}
