package com.lao.constructors;

public class DrawOverloadConstructExample {

    String toDraw;	
	DrawOverloadConstructExample()
	{
		System.out.println("Constructor object created");
	}
	
	DrawOverloadConstructExample(String draw)
	{
		toDraw = draw;
		System.out.println("Drwaing:" +draw);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawOverloadConstructExample o1 = new DrawOverloadConstructExample();
		
		DrawOverloadConstructExample o2 = new DrawOverloadConstructExample("Pentagon");
	}

}
