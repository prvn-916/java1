package StringReverseWord;

import java.util.Scanner;

public class StringReverseWord {
    public static void main(String[] arg){  
        new StringReverseWord();
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String  str=sc.nextLine();    
        System.out.println("Reverse of a String  is : "+StringReverseWord.reversestr(str));    
        sc.close();     
    }  
    static String reversestr(String s){  
        String r="";  
        for(int i=s.length();i>0;--i){  
            r=r+(s.charAt(i-1));   
        }  
        return r;  
    }  
    
}
