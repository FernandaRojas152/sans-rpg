package model;

import java.awt.Graphics;

import ui.Main;

public class Enemy extends GameObject{
	
	public static final int HEIGHT = 80;
	public static final int WIDTH = 80;
	public static final int WIDTH_GAME = Main.WIDTH;
	public static final int HEIGHT_GAME = Main.HEIGHT;
	public static final int X_BOUND = Main.WIDTH - WIDTH;
	public static final int Y_MAX = -100;
	public static final int Y_MIN = -300;
	
	
	public Enemy(Game game, int x, int y) {
		super(game, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

}
