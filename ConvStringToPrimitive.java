package wrapper;

public class ConvStringToPrimitive {

	public static void main(String[] args) {
		
		String s = "2457";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		String b = "true";
		boolean ans = Boolean.parseBoolean(b);
		System.out.println(ans);
		
		String a = "a";
		System.out.println(a.charAt(0));
		
		String c = "12.144";
		float done = Float.parseFloat(c);
		System.out.println(done);
		
		String d = "14579978";
		long yup = Long.parseLong(d);
		System.out.println(yup);
		
		String f = "1.2415548888778";
		double yes = Double.parseDouble(f);
		System.out.println(yes);
		
		String g = "120";
		Byte hmm = Byte.parseByte(g);
		System.out.println(hmm);
		
		
		//NUMBER FORMAT EXCEPTION
		String h = "129";
		Byte grr = Byte.parseByte(h);
		System.out.println((byte)grr);
		
		
		
		
	}
}
