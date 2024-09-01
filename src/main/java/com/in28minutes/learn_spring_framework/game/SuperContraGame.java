package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Contra Up");
		
	}

	@Override
	public void down() {
		System.out.println("Contra Down");
		
	}

	@Override
	public void left() {
		System.out.println("Contra Left");
		
	}

	@Override
	public void right() {
		System.out.println("Contra Right");
		
	}
	
	

}
