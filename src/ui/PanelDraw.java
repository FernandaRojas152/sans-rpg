package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import animation.Animation;
import model.Player;
import tools.GameLoader;
import tools.SoundPlayer;

public class PanelDraw extends JPanel implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final Image BACKGROUND= GameLoader.images.get("BACKGROUND");
	
	private Main main;
	
	public PanelDraw(Main main) {
		this.main= main;
		setLayout(null);
		setSize(Main.WIDTH, Main.HEIGHT);
		
		main.getGame().startProcesses();
		//SoundPlayer.play("resources/sounds/background.wav");
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(BACKGROUND, 0, 0, null);
		Player p= main.getGame().getPlayer();
		p.render(g);
		repaint();
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
	
	public void renderPlayer() {
		
	}

}
