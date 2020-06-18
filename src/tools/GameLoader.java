package tools;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class GameLoader {

	
	public static HashMap<String, Image> images = new HashMap<>();
	public static HashMap<String, BufferedImage> sprites = new HashMap<>();
	public static HashMap<String, BufferedImage> maps = new HashMap<>();

	public static void loadResources() {
		
		// Se agregan las imagenes
		sprites.put("SANS", ImageLoader.cargarSprites("images/sans_caminando_abajo.png"));
		sprites.put("SANS ARRIBA", ImageLoader.cargarSprites("images/sans_arriba.png"));
		sprites.put("SANS DERECHA", ImageLoader.cargarSprites("images/sans_derecha.png"));
		sprites.put("SANS IZQUIERDA", ImageLoader.cargarSprites("images/sans_izquierda.png"));
		sprites.put("SANS BROMA", ImageLoader.cargarSprites("images/sans_broma.png"));
		sprites.put("SANS PEINE", ImageLoader.cargarSprites("images/sans-peinandose.png"));
		images.put("BACKGROUND", ImageLoader.cargarImagen("images/background.jpg"));
		
		//images.put("SHOT_PLAYER", ImageLoader.cargarImagen("images/laser4.png"));
		//images.put("ENEMY", ImageLoader.cargarImagen("images/nave6.png"));
		//images.put("BLOCK1", ImageLoader.cargarImagen("images/block1.png"));

		// Se agregan los sprites
		//sprites.put("EXPLOSION", ImageLoader.cargarSprites("images/explosion.png"));
		
		//icono
		images.put("ICON", ImageLoader.cargarImagen("images/icono.jpg"));
		images.put("CURSOR", ImageLoader.cargarImagen("images/cursor.png"));
		// Se agregan los mapas
		//maps.put("MAP1", ImageLoader.cargarSprites("images/map.png"));
		
	}

	
}
