package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PackManGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("PackMan Up");
		
	}

	@Override
	public void down() {
		System.out.println("PackMan Down");
		
	}

	@Override
	public void left() {
		System.out.println("PackMan Left");
		
	}

	@Override
	public void right() {
		System.out.println("PackMan Right");
		
	}

}
