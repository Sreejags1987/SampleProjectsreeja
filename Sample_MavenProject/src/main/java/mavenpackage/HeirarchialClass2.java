package mavenpackage;

public class HeirarchialClass2 extends HeirarchialParent {
	public void child2()
	{
		System.out.println("Hello child 2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialClass2 h2= new HeirarchialClass2();
		h2.print();
		h2.child2();
		

	}

}
