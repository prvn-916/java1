package PermutationSequence;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        int[] fact = new int[n];
        fact[0] = 1;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        for (int i = 1; i < n; i++) {
            fact[i] = fact[i-1] * i;
            nums.add(i+1);
        }
        String result = "";
        k = k - 1;
        for (int i = 0; i < n; i++) {
            int index = k / fact[n-1-i];
            result = result + (nums.get(index) + "");
            nums.remove(index);
            k = k % fact[n-1-i];
        }
        return result;
    }

    public static void main(String[] args) {
        PermutationSequence solution = new PermutationSequence();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        String permutation = solution.getPermutation(n, k);
        s.close();
        System.out.println("The " + k + "th permutation of " + n + " numbers is: " + permutation);
    }
}
