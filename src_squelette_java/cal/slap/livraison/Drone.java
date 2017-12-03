package cal.slap.livraison;

public class Drone {

	private int id;
	private String nom;
	
	private Position position;
	
	public Drone(String nom, Position position) {
		this.nom = nom;
		this.position = position;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Drone [id=" + id + ", nom=" + nom + ", position=" + position + "]";
	}
	
	
	
}
