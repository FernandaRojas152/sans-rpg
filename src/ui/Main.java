package ui;

import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import model.Game;
import tools.GameLoader;

public class Main extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH= GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth();
	public static final int HEIGHT = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight()-60;
	
	private Game game;
	private PanelDraw drawP;
	private PanelMap map;
	
	public Main() {
		GameLoader.loadResources();
		setTitle("Sans RPG");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setResizable(false);
		
		game= new Game();
		drawP= new PanelDraw(this);
		setLocationRelativeTo(null);
		add(drawP);
		
	}
	
	public Game getGame() {
		return game;
	}
}
