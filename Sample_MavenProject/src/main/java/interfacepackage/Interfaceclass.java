package interfacepackage;

public class Interfaceclass implements Interfacenew{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceclass d = new Interfaceclass();
		d.add();
		d.average();
		d.sum();

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("Implementing class ");
		
	}

	@Override
	public void average() {
		// TODO Auto-generated method stub
		
		System.out.println("Implementing class on a method");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Implementing class on another method");
		
		
	}

}
