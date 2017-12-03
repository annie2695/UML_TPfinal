package cal.slap.pharmacie;

import cal.slap.livraison.Position;

public class Adresse {

	private String rue;
	private String numeroCivique;
	private String codePostal;
	private String ville;
	private String pays;
	
	private Position position;

	public Adresse(String rue, String numeroCivique, String codePostal, String ville, String pays, Position position) {
		super();
		this.rue = rue;
		this.numeroCivique = numeroCivique;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.position = position;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getNumeroCivique() {
		return numeroCivique;
	}

	public void setNumeroCivique(String numeroCivique) {
		this.numeroCivique = numeroCivique;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", numeroCivique=" + numeroCivique + ", codePostal=" + codePostal + ", ville="
				+ ville + ", pays=" + pays + ", position=" + position + "]";
	}
	
	
	
	
}
