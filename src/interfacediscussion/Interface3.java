package interfacediscussion;

public interface Interface3 extends Interface1, Interface2 {

	public static void main(String[] args) {
		
		System.out.println(Interface2.i);// interface2 i value
		System.out.println(Interface1.i);// interface1 i value
		
	}

}
