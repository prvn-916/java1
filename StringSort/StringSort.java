package StringSort;

import java.util.Scanner;

class StringSort {

	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char arr[] = str.toCharArray();
		char temp;
        s.close();
		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		System.out.println(arr);
	}
}
