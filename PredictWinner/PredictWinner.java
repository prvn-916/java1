package PredictWinner;

import java.util.Scanner;

public class PredictWinner {
    public boolean predictTheWinner(int[] nums) {
        final int n = nums.length;
    
    int[][] dp = new int[n][n];

    for (int i = 0; i < n; ++i)
      dp[i][i] = nums[i];

    for (int d = 1; d < n; ++d)
      for (int i = 0; i + d < n; ++i) {
        final int j = i + d;
        dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
      }

    return dp[0][n - 1] >= 0;
        
    }
    public static void main(String[] args) {
        PredictWinner PredictWinner = new PredictWinner();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = s.nextInt();
        }
        System.out.println(PredictWinner.predictTheWinner(nums));
        s.close();
    }
    
}
