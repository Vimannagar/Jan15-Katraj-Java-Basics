package casting;

public class PrimitiveCasting {
	
	
	public static void main(String[] args) {
		
//		implicit casting
		byte b = 20;
		
		int c = (int)b;
		
		System.out.println(c);//20
		
		double d = (double)c;
		
		System.out.println(d);//20.0
		
		
		
//		explicit casting
		
		int i = 129;
		
		byte bb = (byte)i;
		
		System.out.println(bb);//50
		
		long l = 56565656565656l;
				
		int k = (int)l;
		
		System.out.println(k);
		
		
		
	}
	

}
