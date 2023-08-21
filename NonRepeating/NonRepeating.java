package NonRepeating;
import java.util.Scanner;

public class NonRepeating{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt(); 
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int[] series = new int[n];
            for (int j = 0; j < n; j++) 
            {
                series[j] = s.nextInt();
            }
				int result = series[0];
                for (int k = 1; k < series.length; k++) {
                    result = result^series[k];
                            
                }
        System.out.println(result);
        }
        s.close();
    }
}
