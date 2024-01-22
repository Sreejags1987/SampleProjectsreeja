package exceptionpac;

public class Arithemeticarrayexception {
	public void test() {
		try {
	
	int a[]= {40,50,60,70};
	System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("Catch exception error");
			
		}
		finally {
			System.out.println("Finally exception error identified");
		}
		
		
		
			
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithemeticarrayexception d= new Arithemeticarrayexception();
		d.test();
		
		
		
			
		}

	

}

