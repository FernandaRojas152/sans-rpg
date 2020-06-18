package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import model.Player;
import tools.GameLoader;
//import tools.SoundPlayer;

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
	public void keyPressed(KeyEvent e) {
		int key= e.getExtendedKeyCode();
		Player player= main.getGame().getPlayer();
		if(key== KeyEvent.VK_DOWN) {
			player.getAnimation().setPause(false);
			player.setAnimation(player.getAnimation1());
			player.setSpeedY(1);
		}
		if(key== KeyEvent.VK_UP) {
			player.getAnimation().setPause(false);

			player.setAnimation(player.getAnimation2());
			player.setSpeedY(-1);
		}

		if(key== KeyEvent.VK_RIGHT) {
			player.getAnimation().setPause(false);

			player.setAnimation(player.getAnimation3());
			player.setSpeedX(1);
		}

		if(key== KeyEvent.VK_LEFT) {
			player.getAnimation().setPause(false);

			player.setAnimation(player.getAnimation4());
			player.setSpeedX(-1);
		}

		if(key== KeyEvent.VK_J) {
			player.getAnimation().setPause(false);
			player.setAnimation(player.getAnimation5());
			//player.getAnimation().runAnimation();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key= e.getExtendedKeyCode();
		Player player= main.getGame().getPlayer();
		if(key== KeyEvent.VK_DOWN) {
			player.getAnimation().setPause(true);
			player.setSpeedY(0);
		}
		if(key== KeyEvent.VK_UP) {
			player.getAnimation().setPause(true);
			player.setSpeedY(0);
		}

		if(key== KeyEvent.VK_RIGHT) {
			player.getAnimation().setPause(true);
			player.setSpeedX(0);
		}

		if(key== KeyEvent.VK_LEFT) {
			player.getAnimation().setPause(true);
			player.setSpeedX(0);
		}

		if(key== KeyEvent.VK_J) {
			player.getAnimation().setPause(true);
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void renderPlayer() {

	}

}
