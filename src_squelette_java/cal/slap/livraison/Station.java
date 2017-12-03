package cal.slap.livraison;

public class Station {

	private String nom;
	private int id;
	
	private static int compteur = 1;
	
	private Drone drone;

	public Station(String nom, Drone drone) {
		super();
		this.id = compteur++;
		this.nom = nom;
		this.drone = drone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Drone getDrone() {
		return drone;
	}

	public void setDrone(Drone drone) {
		this.drone = drone;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Station [nom=" + nom + ", id=" + id + ", drone=" + drone + "]";
	}
	
	
	
}
