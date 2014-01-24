package com.killer804.engine;

import org.lwjgl.input.Keyboard;

public class Game {

	public Game(){
		
	}
	
	public void input(){
		if(Input.getKeyDown(Keyboard.KEY_UP)){
			System.out.println("Just pressed up!");
		}if(Input.getKeyUp(Keyboard.KEY_UP)){
			System.out.println("not pressing up anymore!");
		}
		
		if(Input.getMouseDown(1)){
			System.out.println("Just pressed RIGHT mouse button!\n" + "At " + Input.getMousePosition().toString() + " Mouse Position!");
		}if(Input.getMouseUp(1)){
			System.out.println("released RIGHT mouse button!");
		}
	}
	
	public void update(){
		
	}
	
	public void render(){
		
	}
}
