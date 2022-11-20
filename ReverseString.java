package days30challegetilldec2060Questions;

public class ReverseString {
	public static void main(String[] args) {
		
		String str = "Atul", nstr = "";
		char ch;
		System.out.println("Original word: ");
		System.out.println("Atul");
		
		for(int i = 0;i<str.length();i++) {
			ch = str.charAt(i);
			nstr = ch+nstr;
			System.out.println(nstr);
		}
		System.out.println("Reversed word " + nstr);
	}

}
