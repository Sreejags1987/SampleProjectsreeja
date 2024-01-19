package finalkeyword;

public class Newclass {
	final int a;
	public Newclass() {
		a=20;
		
	}
	public final void add() {
		System.out.println("it's a final method");
		
		 
	}
public static void main (String []args) {
	Newclass a = new Newclass();
	a.add();
}
	

	}


