package wrapper;

public class Wrap3 {

	public static void main(String[] args) {
		
		Byte b1 = new Byte((byte)100);
		Integer b2 = new Integer(100);
		
		System.out.println(b1.equals(b2)); //NOT POSSIBLE AS THEY ARE DIFFERENT OBJECTS 
											//AS YOU GET FALSE THAT DOESN'T MEAN YOU CAN DO THIS TYPE OF EQUAL
		
		Byte b3 = new Byte((byte)100); //TRUE AS THEY HAVE SAME TYPE
		
		System.out.println(b1.equals(b3));
		
		/*
		System.out.println(b1==b2);
		DIFFERENT TYPE OF DATA
		*/
	}
}
