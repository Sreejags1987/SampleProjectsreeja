package mavenpackage;

public class HierarchialChild1 extends HeirarchialParent {
	
	public void Child1()
	{
		System.out.println("Hi Child 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChild1 h1=new HierarchialChild1();
		h1.print();
		h1.Child1();

	}

}
