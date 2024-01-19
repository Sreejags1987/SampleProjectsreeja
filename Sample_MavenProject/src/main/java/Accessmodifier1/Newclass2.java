package Accessmodifier1;

public class Newclass2 {
	private void add() {
		System.out.println("it's a private method");
	}
	
	protected void sum() {
			System.out.println("it's a protected method");
		}
		
		public void average() {
			System.out.println("it's a public method");
			
		}
		
		 void subtract(){
			 System.out.println("it's a default method");
			 
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newclass2 s = new Newclass2();
		s.sum();
		s.average();
		s.subtract();
		

	}

}
