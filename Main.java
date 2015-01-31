/*
 *
 *	QuackBoard
 *	Cole Straughn and Jonathan Lam
 *	Global Keyboard Hook (KeyboardHook.jar) is courtesy of http://kra.lc/blog/2011/07/java-global-system-hook/
 *
 */

package QuackBoard;

import de.ksquared.system.keyboard.GlobalKeyListener;
import de.ksquared.system.keyboard.KeyAdapter;
import de.ksquared.system.keyboard.KeyEvent;

public class Main {
	public static void main(String[] args) {
		new GlobalKeyListener().addKeyListener(new KeyAdapter() {
			@Override public void keyPressed(KeyEvent event) { System.out.println(event.getVirtualKeyCode()); }
		});
		while(true)
			try { Thread.sleep(100); }
			catch(InterruptedException e) { e.printStackTrace(); }
	}
}