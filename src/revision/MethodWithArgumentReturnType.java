package revision;

public class MethodWithArgumentReturnType {
	
	
	public static boolean isEqual(int i , int j)
	{
		boolean k = i==j;
		
		return k;
	}
	
	
	public static int isEqualTo(int i , int j)
	{
		
		j = j+1;
		
		
		return j;
	}
	public static void main(String[] args) {
		
		boolean l = isEqual(50, 20);
		
		System.out.println(l);//false
		
		boolean m = isEqual(40, 40);
		System.out.println(m);//true
		
		int k = isEqualTo(40, 20);
		
		System.out.println(k);//21
		boolean n = isEqual(k, 21);
		
		System.out.println(n);//true
		
		
		
	}
	
//	output
//	false
//	true
//	21
//	true
}


