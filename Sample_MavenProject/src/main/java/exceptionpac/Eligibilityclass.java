package exceptionpac;

public class Eligibilityclass {
	public void result() {

	
	int age=12;
	
	if(age>=18) {
		System.out.println("Eligible for vote");
	}
		
		else
		{
			
		//	System.out.println("Not eligible for vote");
			throw new ArithmeticException(" Not eligible");
	}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eligibilityclass f=new Eligibilityclass();
				f.result();
		
		

	}
	}
	


