package RearrangeArray;

import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++)
        {
            array[i] = s.nextInt();
        } 
        for (int i = 0; i < array.length; i++) { 
            for (int j = i+1; j < array.length; j++) { 
                if(array[i] > array[j]) { 
                  int temp = array[i]; 
                  array[i] = array[j]; 
                  array[j] = temp; 
               } 
            } 
        } 
 
 
     //Displaying elements of array after sorting 
     for (int i = 0; i < array.length; i++) {
        if(i<array.length-1) 
      System.out.print(array[i] + " "); 
      else
      System.out.print(array[i]);

    } 

    }
}
