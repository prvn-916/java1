package TimeRemain;

import java.util.Scanner;

public class TimeRemain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Hours = s.nextInt();
        int Minutes = s.nextInt();
        s.close();

        int MinutesTravelled = Hours*60 + Minutes;
        int MinutesRemaining = 24*60 - MinutesTravelled;

        int FinalRemainingMinutes = MinutesRemaining%60;
        int FinalRemainingHours = MinutesRemaining/60;
        System.out.printf("%02d: :%02d", FinalRemainingHours, FinalRemainingMinutes);
    }
    
}
