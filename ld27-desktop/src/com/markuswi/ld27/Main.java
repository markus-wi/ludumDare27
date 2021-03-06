package com.markuswi.ld27;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "ld27";
		cfg.useGL20 = true;
		cfg.resizable = false;
		cfg.width = 800;
		cfg.height = 480;

		new LwjglApplication(new GdxGame(), cfg);
	}
}
