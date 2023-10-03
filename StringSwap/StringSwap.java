package StringSwap;

import java.util.Scanner;

class StringSwap {

	public static String swapPair(String str)
	{
		if (str == null || str.isEmpty())
			return str;

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length - 1; i = i+2) {

			char temp = ch[i];
			ch[i] = ch[i + 1];
			ch[i + 1] = temp;
		}

		return new String(ch);
	}

	public static void main(String args[])
	{
        Scanner s = new Scanner(System.in);
		String str = s.nextLine();
        s.close();
		System.out.println(swapPair(str));
	}
}

