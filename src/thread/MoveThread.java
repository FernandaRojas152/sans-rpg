package thread;

import model.Game;

public class MoveThread extends AbstractThread{

	public MoveThread(Game game) {
		super(game);
		setDaemon(true);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(50);
				getGame().getPlayer().getAnimation().runAnimation();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
