package testPackage;

public class Example1 {

	public static void main(String[] args) {
		String str = "this is a number 123456";
		System.out.println(str);

		String[] words = str.split(" ");
//
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}

		for (int j = 0; j < words.length; j++) {
			if (words[j].startsWith("1")) {
				System.out.println(words[j]);
			}
		}
		System.out.println("First change in java code from eclipse");
	}
}
