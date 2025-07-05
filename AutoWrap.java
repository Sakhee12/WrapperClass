package wrapper;

public class AutoWrap {
	
	public static void main(String[] args) {
		
		Integer i = 10; //AUTO-BOXING
		int a = i; //AUTO-UNBOXING
		System.out.println(a+10);
		
		Character ch = 'w';
		char c = ch;
		System.out.println(c+10);
		
		Byte b = 27;
		byte by = b;
		System.out.println(by);
		
		Short s = 155;
		short sh = s;
		System.out.println((int)sh);
		
		
		
		
		
	}
}
