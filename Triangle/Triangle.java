package Triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        String result = CheckTriangle(a, b, c);
        System.out.println(result);
        s.close();
    }
    public static String CheckTriangle(int a, int b, int c){
        if(a+b <= c || a+c <= b || b+c <= a){
        return "Not A Triangle";
        }
        else if(a == b && b == c){
        return "Equilateral";
        }
        else if(a == b || b == c || c == a){
            return"isosceles";
        }
        else{
            return "scalene";
        }
    }
    
}
