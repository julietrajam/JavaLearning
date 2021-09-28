package com.lao.conditional_statement;

public class SuperheroOrNot {
	
	String superhero = "Spider Man";

	public void heroornot()
	{
		switch(superhero)
		{
		case "Super Man":
			System.out.println("Super Man is a Super Hero");
			break;
			
		case "Bat Man":
			System.out.println("Bat Man is a Super Hero");
			break;	
			
		case "Spider Man":
			System.out.println("Spider Man is a Super Hero");
			break;
			
		default:
			System.out.println("Sorry I dont know about this person" +superhero);
			
			
		}	
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperheroOrNot o1 = new SuperheroOrNot();
		o1.heroornot();
	}

}
