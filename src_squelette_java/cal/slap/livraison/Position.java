package cal.slap.livraison;

public class Position {

	private double coordX;
	private double coordY;
	private double coordZ;
	
	public Position(double coordX, double coordY, double coordZ) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
		this.coordZ = coordZ;
	}

	public double getCoordX() {
		return coordX;
	}

	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}

	public double getCoordY() {
		return coordY;
	}

	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}

	public double getCoordZ() {
		return coordZ;
	}

	public void setCoordZ(double coordZ) {
		this.coordZ = coordZ;
	}
	
	
	
}
