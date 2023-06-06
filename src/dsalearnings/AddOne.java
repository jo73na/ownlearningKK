package dsalearnings;

import java.util.Arrays;

public class AddOne {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
		int[] digits1 = { 9 };
		int[] digits2 = { 9, 9 };
		System.out.println(Arrays.toString(add1(digits1)));

	}

	static int[] add(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

	static int[] add1(int[] digits) {
		int res = 0;
		for (int i = 0; i < digits.length; i++) {
			res = res * 10 + digits[i];
		}
		res += 1;

		int[] temp = new int[String.valueOf(res).length()];
		int i = String.valueOf(res).length() - 1;

		do {
			temp[i] = res % 10;
			res = res / 10;
			i--;
		} while (res > 0);

		return temp;

	}

}
