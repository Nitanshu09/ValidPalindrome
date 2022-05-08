
public class ValidPalindrome {

	public static boolean isP(String s) {
		int i = 0;
		int j = s.length() - 1;
		if (s == " " || s.length() == 1) {
			return true;
		}
		if (i == j) {
			return false;
		}
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122 || s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				str = str + s.charAt(i);
			} else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				str = str + (char) (s.charAt(i) + 32);
			}
		}
		System.out.println(str);
		return isP(str);
	}

	public static void main(String[] args) {
		String s = "0P0";
//		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

}
