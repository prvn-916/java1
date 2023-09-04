package SumArray;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n ; i++){
             array[i] = s.nextInt();
        }
        int left = 0, count = 0;
        int right = array.length-1;
        int sum = s.nextInt();

        while(left<right){
            int NewSum = array[left]+array[right];
            if(NewSum == sum){
                left++;
                count++;
                right--;

            }
            else if(sum > NewSum){
                left++;
            }
            else{
            right--;
            }
        }

        System.out.println(count);
        s.close();

    }
    
}
