package ArrayUnion;
import java.util.Scanner;

public class ArrayUnion {  
    public static void main(String[] args) {  
           Scanner s = new Scanner(System.in);
            int m = s.nextInt();
            int n = s.nextInt();
            int[] arr1 = new int[m];
            int[] arr2 = new int[n];
            for(int i = 0; i<m; i++){
                arr1[i] = s.nextInt();
            }
            for(int j = 0; j < n; j++){
                arr2[j] = s.nextInt();
            }
            printUnion(arr1, arr2, m, n);
            s.close();
        }  
     
    
    public static void printUnion(int[] arr1, int[] arr2, int m, int n) {  
        int i = 0, j = 0;  
          
        
        while (i < m && j < n) {  
            if (arr1[i] < arr2[j]) {    
                System.out.print(arr1[i++] + " ");  
            } else if (arr1[i] > arr2[j]) {   
                System.out.print(arr2[j++] + " ");  
            } else {    
                System.out.print(arr1[i++] + " ");  
                j++;  
            }  
        }  
           
        while (i < m) {  
            System.out.print(arr1[i++] + " ");  
        }  
           
        while (j < n) {  
            System.out.print(arr2[j++] + " ");  
        }  
        
    }  
}  