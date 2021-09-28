package com.lao.conditional_statement;

public class WhosTheHero {
	
	String myheroname= "Spider man";
	
	public void superheroguesser()
	{
		if(myheroname.equals("Super Man"))
		{
			System.out.println("You thought about Super Man");
		}
		else
			if(myheroname.equals("Iron Man"))
					{
				    System.out.println("You thought about Iron Man");
					}
			else
				if(myheroname.equals("Bat Man"))
						{
					    System.out.println("You thought about Bat Man");
						}
				else
				{
					System.out.println("Sorry I cant guess");
				}
	}
	
	public static void main(String main[])
	{
		WhosTheHero o1 = new WhosTheHero();
		o1.superheroguesser();
	}

}
