package wrapper;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer i = new Integer(100);
		int ans = i.intValue(); //UNBOXING 
		//TO DO UNBOXING WE USE VALUE METHOD
		System.out.println(ans+10);
		
		Character c = new Character('a');
		char ch = c.charValue();
		System.out.println(ch+10);
		
		Boolean b = new Boolean(true);
		boolean b1 = b.booleanValue();
		System.out.println(b1);
		
		Long l = new Long (5891265l);
		long l1 = l.longValue();
		System.out.println(l1);
		
		Float f = new Float(148.1488f);
		float f1 = f.floatValue();
		System.out.println(f1);
		
		Double d = new Double(14.1579851);
		double d1 = d.doubleValue();
		System.out.println(d1);
		
		Byte b2 = new Byte((byte)120);
		byte b3 = b2.byteValue();
		System.out.println(b3);
		
		
		
		
		
	}
}
