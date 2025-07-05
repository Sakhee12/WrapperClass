package wrapper;

public class ConvPrimitiveToString {

	public static void main(String[] args) {
		
		int a = 100;
		String s = String.valueOf(a);
		System.out.println(s+10);
		
		boolean b = true;
		String s1 = String.valueOf(b);
		System.out.println(s1+s1);
		
		Character c = 's';
		String s2 = String.valueOf(c);
		System.out.println(s2);
		
		Byte b1 = 103;
		String s3 = String.valueOf(b1);
		System.out.println(s3);
		
		Short sh = 125;
		String s4 = String.valueOf(sh);
		System.out.println(s4);
		
		Long l = 245879564l;
		String s5 = String.valueOf(l);
		System.out.println(s5);
		
		Float f = 44789.114458f;
		String s6 = String.valueOf(f);
		System.out.println(s6);
		
		Double d = 2447.156577984;
		String s7 = String.valueOf(d);
		System.out.println(s7);
		
	}
}
