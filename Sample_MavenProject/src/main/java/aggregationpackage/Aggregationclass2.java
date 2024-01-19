package aggregationpackage;

public class Aggregationclass2 {
	

	String c;
	Aggregationclass1 ag1;
	public Aggregationclass2(String name,Aggregationclass1 ag1 ) {
		this.c=name;
		this.ag1=ag1;
	}
	
	public void print() {
		System.out.println(c);
		System.out.println(ag1.c);
		System.out.println(ag1.d);
	}
	public static void main(String[] args) {
		Aggregationclass1 a1 = new Aggregationclass1("Safna", 12);
		Aggregationclass2 a2 = new Aggregationclass2("Sreeja",a1);
		a2.print();
	}

}


