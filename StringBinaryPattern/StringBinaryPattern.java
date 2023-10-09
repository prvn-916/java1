package StringBinaryPattern;

import java.util.Scanner;


class StringBinaryPattern{
    public static void PrintPattern(char[] str, int index){
        if(index == str.length){
            System.out.println(str);
            return;
        }
        if(str[index] == '?'){
            str[index] = '0';
            PrintPattern(str,index+1);

            str[index] = '1';
            PrintPattern(str, index+1);

            str[index] = '?';
        }
        else{
            PrintPattern(str, index+1);
        }

    }

   
  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        char[] str = input.toCharArray();
        PrintPattern(str, 0);
        s.close();
        
    }
}
