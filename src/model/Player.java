package model;

import java.awt.Graphics;

import animation.Animation;
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
	private Animation animation;
	private boolean isAlive;

	public Player(Game game) {
		super(game, 100, 100, 0, 0, WIDTH, HEIGHT, GameLoader.sprites.get("SANS"));
		animation= new Animation(GameLoader.sprites.get("SANS"), 4, 1, 4, 1);
		isAlive=true;
	}

	public Player(Game game, int x, int y) {
		super(game, x, y);
		setSkin(GameLoader.images.get("SANS"));
		setWidth(WIDTH);
		setHeight(HEIGHT);
	}

	@Override
	public void move() {
		if(isAlive) {
			if(getX()<=0) {
				setX(0);
			}
			if(getX() >= WIDTH_GAME-WIDTH) {
				setX(WIDTH_GAME-WIDTH);
			}
		}
	}

	@Override
	public void render(Graphics g) {
		animation.drawAnimation(g, getX(), getY(), 0);
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {

		while (animation.isAlive()) {
			try {
				if (!getGame().isPaused()) {
					sleep(6);
					animation.runAnimation();
				}else {
					pause();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}
	
	

}
