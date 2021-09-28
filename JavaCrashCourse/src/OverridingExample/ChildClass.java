package OverridingExample;

public class ChildClass extends ParentClass {
	
	//Override
	public void debit()
	{
		System.out.println("Debit from Child account");
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass o1= new ChildClass();
		o1.debit();
		o1.credit();
		
	}

}
