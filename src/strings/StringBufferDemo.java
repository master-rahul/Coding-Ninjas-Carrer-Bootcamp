package strings;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer  s = new StringBuffer("BBCD");
		s.setCharAt(0, 'A');
		s.insert(0, "LLLL");
		s.insert(s.length(), "LLLL");
		s.append("MNOP");
		System.out.println(s);
	}

}
