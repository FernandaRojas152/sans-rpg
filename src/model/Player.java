package model;

import java.awt.Graphics;

import tools.GameLoader;
import ui.Main;

public class Player extends GameObject{
	public static final int WIDTH = 80;
	public static final int HEIGHT = 80;
	public static final int SPEED = 2;
	public static final int WIDTH_GAME = Main.WIDTH;
	public static final int HEIGHT_GAME = Main.HEIGHT;
	public static final int SPAWN_X = WIDTH_GAME / 2 - WIDTH / 2;
	public static final int SPAWN_Y = HEIGHT_GAME;
	public static final int X_LIMIT_LEFT = 0;
	public static final int X_LIMIT_RIGHT = Main.WIDTH;
	
	public Player(Game game) {
		super(game, SPAWN_X, SPAWN_Y, 0, 0, WIDTH, HEIGHT, GameLoader.images.get("SANS"));
	}
	
	public Player(Game game, int x, int y) {
		super(game, x, y);
		setSkin(GameLoader.images.get("SANS"));
		setWidth(WIDTH);
		setHeight(HEIGHT);
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
