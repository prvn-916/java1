// class problem{
//     public static void main(String[] args) {
//         int num = 547896;
//         int n = 4;
//         String str = String.valueOf(num);
//         char[] array = str.toCharArray();
//         System.out.println(array[array.length-n]);
//     }
// }

import java.util.Scanner;

class problem{


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a interger:");
        int num = s.nextInt();
        System.out.println("enter the n value to print nth digit from right side:");
        int n = s.nextInt();
        int count = 0;
        int num1 =0 ;
        
        System.out.println("given number:"+num);
        while(  count <= n-1 )
        {
            num1 = num%10;
            
            num = num/10;
            count++;
                   
        }
         System.out.println("the number is:"+num1);
         
                 
    }
}