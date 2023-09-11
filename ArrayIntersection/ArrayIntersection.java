//package ArrayIntersection;

import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }
        for (int j = 0; j < n2; j++) {
            array2[j] = s.nextInt();
        }
        int i = 0, j = 0;
        boolean foundCommon = false; 
        while (i < n1 && j < n2) {
            if (array1[i] == array2[j]) {
                System.out.print(array1[i] + " ");
                i++;
                j++;
                foundCommon = true;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        if (!foundCommon) {
            System.out.println("-1");
        }
        
        s.close();
    }
}
