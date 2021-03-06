/*
 * Sylvia Finger, Taylor Scafe
 * 1/17/2016
 * Player Class that holds player number and "Rack"
 */
import java.util.ArrayList;

public class Player {
	private int score;
	ArrayList<Tile> myTiles = new ArrayList<Tile>();
	
	
	public Player(){
		setScore(0);
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void addTile(Tile input ){
		myTiles.add(input);
	}
	public ArrayList<Tile> getTiles(){
		return myTiles;
	}
	public void removeTile(int input) {
		myTiles.remove(input);
	}
}