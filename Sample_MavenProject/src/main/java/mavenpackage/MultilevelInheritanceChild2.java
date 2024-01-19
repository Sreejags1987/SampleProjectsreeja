package mavenpackage;

public class MultilevelInheritanceChild2 extends MultilevelInheritanceChild {
	
	public void disp()
	{
		System.out.println("Child 2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritanceChild2 m = new MultilevelInheritanceChild2();
		m.print();
		m.display();
		m.disp();
		
		
		

	}

}
