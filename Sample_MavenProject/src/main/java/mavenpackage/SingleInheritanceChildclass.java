package mavenpackage;

public class SingleInheritanceChildclass extends SingleInheritanceParentclass {
	public void display()
	{
		System.out.println("Hello World");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceParentclass s = new SingleInheritanceChildclass ();
		s.print();
		s.display();

	}

}
