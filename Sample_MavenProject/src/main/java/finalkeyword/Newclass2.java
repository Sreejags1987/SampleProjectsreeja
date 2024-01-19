package finalkeyword;

public class Newclass2 extends Newclass {
	/*public final void add() {
		We can't override final methods
	}*/
	public void subtract() {
		System.out.println("My name is Sreeja");
		
	}
	public static void main(String []args) {
		Newclass2 g = new Newclass2();
		g.add();// Can inherit final methods.
		g.subtract();
		
		
	}
	

}
