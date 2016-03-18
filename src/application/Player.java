package application;

public class Player {
	public float x;
	public float y;
	public Player (float x, float y) {
		this.x = x;
		this.y = y;
	}
	public void tick () {
		y= y-1;
	}
}
