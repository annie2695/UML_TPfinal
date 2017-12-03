package cal.slap.user;

public abstract class User {

	protected int id;
	protected String username;
	protected String password;
	protected String nom;
	protected String prenom;
	
	private static int compteur = 1;
	
	public User(String username, String password, String nom, String prenom) {
		this.username = username;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}
	
	
}
