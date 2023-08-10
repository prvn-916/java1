package powerof2;

import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {   
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();   
        for(int i=1; i<=k ; i++){
            int n = s.nextInt();
            while(n%2 == 0){
            n =n/2;
            }
        if(n == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
        }
        s.close();
    } 
}
