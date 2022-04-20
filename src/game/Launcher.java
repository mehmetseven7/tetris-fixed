package game;



public class Launcher {
	public static void main(String[] args) {
		Thread game = new Thread(new Game("tetris"));
		Thread game2 = new Thread(new Game("tetris 2"));
		game.start();
		game2.start();


	}
}
