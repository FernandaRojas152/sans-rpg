package tools;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class SoundPlayer {

	public static void play(String path) {
		try {
			Clip sound = AudioSystem.getClip();
			sound.open(AudioSystem.getAudioInputStream(SoundPlayer.class.getResource(path)));
			sound.start();
			new Thread() {
				@Override
				public void run() {
					try {
						Thread.sleep(sound.getMicrosecondLength() / 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
