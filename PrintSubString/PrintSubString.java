package PrintSubString;

import java.util.Scanner;

class PrintSubString {

    static void subString(char str[], int n) {
        for (int len = 1; len <= n; len++) {

            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char[] str = inputString.toCharArray();
        subString(str, str.length);

        scanner.close();
    }
}
