package de.swagner.paxbritannica.help;

import java.io.File;
import java.io.IOException;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.ScreenUtils;

public class ScreenshotSaver {

	public static void saveScreenshot(String baseName) throws IOException {
		if(Gdx.app.getType()==ApplicationType.Android){
			return;
		}

		byte[] screenshotPixels = ScreenUtils.getFrameBufferPixels(true);
		int width = Gdx.graphics.getWidth();
		int height = Gdx.graphics.getHeight();

	}

}