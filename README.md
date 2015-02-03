# QuackBoard
###### By Cole Straughn and Jonathan Lam

#### Description
A prank download to turn the pressing of keys into different quack/duck sounds.
Global Keyboard Hook courtesy of http://kra.lc/blog/2011/07/java-global-system-hook/.

#### Version
0.1.0: A major update, with full (but basic) functionality. It will play sounds when pressing keys.

#### Instructions
1. Download files
  * Download the files in the "QuackBoard" folder
2. Add audio files
  * (In the "qb/" folder) Add (preferably short) MP3 audio files into the "audio/" folder. You will need to assign numerical keycode values to them, so that they will sound when certain keys are pressed. See a list of keycodes at http://www.west-wind.com/WestwindWebToolkit/samples/Ajax/html5andCss3/keycodechecker.aspx. Note that only the keycodes you add audio for will play sounds.
    * (For example, if you wanted to play a sound file "quackSound.mp3" when the key "a" (keycode 65) is pressed, rename the file "65.mp3". It will play when the key "a" is pressed.)
3. Run the Program
  * Running the JAR
    * (In the "qb/" folder) Double-click the "QuackBoard.jar" file, OR
    * In the command prompt, navigate to the appropriate directory and type "java -jar QuackBoard.jar".
  * Compiling and running the Java file
    1. (In the "src/" folder) Modify the "Main.java" file as you wish.
    2. In the command prompt, compile the Java file and run the Class file (making sure you add "lib.jar" to the classpath).
4. Turn the volume up.
5. Have Fun!

#### Future Updates
(These may not be entirely accurate.)
* 0.1.1: Create website with downloads of audio packs.
* 0.1.2: Include "installer" and "uninstaller" JARs to create (Windows) startup files so that this program automatically plays at startup, and the prank-ee can remove this program.