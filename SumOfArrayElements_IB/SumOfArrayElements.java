// Given an integer array A of size N.

// You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.

// Find and return this maximum possible sum.

// NOTE: Suppose B = 4 and array A contains 10 elements then

// You can pick the first four elements or can pick the last four elements or can pick 1 from the front and 3 from the back etc. 
// you need to return the maximum possible sum of elements you can pick.


package SumOfArrayElements_IB;

import java.util.Scanner;

public class SumOfArrayElements {
    
    public int solve(int[] A, int B) {
        int n = A.length;
        int sum =0;
        int i , j = n-1;
        for( i=0; i<B ; i++)
        {
            sum+=A[i];
        }
        i--;
        int ans = sum;
        for(j=n-1 ; j>n-1-B ; j-- )
        {
            sum = sum - A[i--] + A[j];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SumOfArrayElements Sum = new SumOfArrayElements();
        int B = s.nextInt();// no if element to be added
        int N = s.nextInt();// size of array
        int[] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = s.nextInt();
        }
        int result = Sum.solve( A,  B);
        System.out.println(result);
        s.close();
    }
    
}

