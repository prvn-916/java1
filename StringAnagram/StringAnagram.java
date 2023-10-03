package StringAnagram;

import java.util.Scanner;

class StringAnagram {
	static int TotalChar = 256;

	static boolean areAnagram(char[] str1, char[] str2)
	{
		int[] count = new int[TotalChar];
		int i;

		for (i = 0; i < str1.length; i++) {
			count[str1[i] - 'a']++;
			count[str2[i] - 'a']--;
		}

		if (str1.length != str2.length)
			return false;

		for (i = 0; i < TotalChar; i++)
			if (count[i] != 0) {
				return false;
			}
		return true;
	}

	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        String S1 = scanner.nextLine();
        String S2 = scanner.nextLine();
		char str1[] = S1.toCharArray();
		char str2[] = S2.toCharArray();
        scanner.close();

		if (areAnagram(str1, str2))
			System.out.print(true);
		else
			System.out.print(false);
	}
}

