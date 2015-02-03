/*
 *
 *	QuackBoard
 *	Cole Straughn and Jonathan Lam
 *	Global Keyboard Hook (KeyboardHook.jar) is courtesy of http://kra.lc/blog/2011/07/java-global-system-hook/
 *
 */

package QuackBoard;

// Global Keyboard Listener
import de.ksquared.system.keyboard.*;

// Playing Audio
import java.io.File;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.media.*;

import javafx.event.*;

// Main Class
public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
					
		new GlobalKeyListener().addKeyListener(new KeyAdapter() {
			@Override public void keyPressed(KeyEvent event) {
				int keyCode = event.getVirtualKeyCode();
				
				// Play the .mp3 file with the keycode
				try {
					String file = new File("audio/" + keyCode + ".mp3").toURI().toString();
					Media audio = new Media(file);
					MediaPlayer mediaPlayer = new MediaPlayer(audio);
					mediaPlayer.play();
				} catch(MediaException e) {
					// If an audio file with the keycode is not found, just ignore it.
				}
					
			}
		});
	
	}
	
}