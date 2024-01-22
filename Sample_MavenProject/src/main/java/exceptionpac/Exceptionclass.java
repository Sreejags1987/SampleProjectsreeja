package exceptionpac;

public class Exceptionclass {
	 public void test() {
	try {
	int a=10/0;
	System.out.println(a);
	 }
	catch(Exception f) {
		System.out.println("Exception handled");
		
	}
	finally {
		System.out.println("Exception handled finally");
	}
	 }
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptionclass i = new Exceptionclass();
		i.test();
		
		

	}

}
