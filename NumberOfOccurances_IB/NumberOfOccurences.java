// You are given an integer array A.

// You have to find the number of occurences of each number.

// Return an array containing only the occurences with the smallest value's occurence first.

// For example, A = [4, 3, 3], you have to return an array [2, 1], where 2 is the number of occurences for element 3, 
// and 1 is the number of occurences for element 4. But, 2 comes first because 3 is smaller than 4.



package NumberOfOccurances_IB;

import java.util.Scanner;

public class NumberOfOccurences {
    public int[] findOccurrences(int[] A) {
        int[] fr = new int[A.length];
        int visited = -1;

        for (int i = 0; i < A.length; i++) {
            int count = 1;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                    // To avoid counting the same element again
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }

        int count = 0;
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                result[index++] = fr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        NumberOfOccurences solution = new NumberOfOccurences();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        for(int i = 0; i< n; i++){
            A[i] = s.nextInt();
        }
        s.close();
        int[] occurrences = solution.findOccurrences(A);

        System.out.println("Occurrences of each number:");
        for (int num : occurrences) {
            System.out.print(num + " ");
        }
    }
}
