package wrapper;

public class Wrap2 {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1==i2); //false
		
		System.out.println(i1.equals(i2)); //true
		
		System.out.println(i1.hashCode()); //10
		System.out.println(i2.hashCode()); //10
		
		//CREATING HASHCODE
		
		System.out.println(i1.getClass().getName()+"@"+i1.hashCode());
		System.out.println(i2.getClass().getName()+"@"+i2.hashCode());
	}
}
