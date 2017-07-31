package questao3;

public class Ponto {

	private int x;
	private int y;

	public Ponto() {
		this.x = 0;
		this.y = 0;
	}

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean equals() {
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "X: " + this.x + " Y: " + this.y;
	}
}
