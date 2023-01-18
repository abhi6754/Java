package winter;

public class Strings {
	public static void main(String[] args) {
		String s1="vishavjeet";
		String s2="singh";
		String s3=s1+s2;
		String s4="compare to string";
		int res=s2.compareTo(s1);
		System.out.println(s3);
		System.out.println(res);
		System.out.println(s1==s2);
		System.out.println(s1.charAt(0));
		String s5=s4.replace("to", "");
		System.out.println(s5);
		System.out.println(s1.concat(s2));
	}

}
