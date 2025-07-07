package wrapper;

public class Wrap1
{
	public static void main(String[] args) 
	{
		int a = 10546;
		
		Byte b = new Byte((byte) 105);
		System.out.println(b);
		
		Short s = new Short((short)150);
		System.out.println(s);
						
		Integer i = new Integer(a);
		System.out.println(i.toString()); //TO CHECK THE REFERENCE
		
		Long l = new Long(2584354685l);
		System.out.println(l);
		
		Float f = new Float(49.485f);
		System.out.println(f);
		
		Double d = new Double(58.35);
		System.out.println(d);
		
		Character c = new Character('A');
		System.out.println(c.hashCode());
		
		
		
		
		
		
		
	}
}
