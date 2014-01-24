package com.killer804.engine;

import org.lwjgl.input.Keyboard;

public class Game {

	private Mesh mesh;
	private Shader shader;
	
	public Game(){
		
		mesh = new Mesh();
		shader = new Shader();
		
		Vertex[] data = new Vertex[] {new Vertex(new Vector3f(-1, -1, 0)),
				                        new Vertex(new Vector3f(0,1,0)),
				                        new Vertex(new Vector3f(1,-1,0))};
		
		mesh.addVertices(data);
		
		shader.addVertexShader(ResourceLoader.loadShader("basicVertex.vs.txt"));
		shader.addFragmentShader(ResourceLoader.loadShader("basicFragment.fs.txt"));
		shader.compileShader();
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
		shader.bind();
		mesh.draw();
	}
}
