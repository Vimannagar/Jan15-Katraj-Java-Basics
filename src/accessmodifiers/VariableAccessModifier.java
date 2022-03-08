package accessmodifiers;

public class VariableAccessModifier {

public	int i =10;

static String s = "abc";

private static char c = '$';


 final static int j = 60;

public static void main(String[] args) {
	System.out.println(c);
	
	A.m2();
	
	System.out.println(j);//60
}


public void m1()
{
	System.out.println(j);
}
	
	
	
}
