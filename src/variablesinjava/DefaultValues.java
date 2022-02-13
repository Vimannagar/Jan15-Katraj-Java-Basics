package variablesinjava;

public class DefaultValues {
	
	String s;
	int i;
	char c;
	static float f;
	boolean b;
	
	public static void main(String[] args) {
		DefaultValues dv = new DefaultValues();
		
		System.out.println(dv.s);//null
		System.out.println(dv.i);//0
		System.out.println(dv.c);//<space>
		System.out.println(f);//0.0
		
		System.out.println(dv.b);//false
		
	}
	

}
