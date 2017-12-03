package cal.slap.pharmacie;

public class Medicament {

	private String nom;
	private int quantite;
	private String dosage;
	private String nomCompagnie;
	private String effetSecondaire;
	
	public Medicament(String nom, int quantite, String dosage, String nomCompagnie, String effetSecondaire) {
		this.nom = nom;
		this.quantite = quantite;
		this.dosage = dosage;
		this.nomCompagnie = nomCompagnie;
		this.effetSecondaire = effetSecondaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getNomCompagnie() {
		return nomCompagnie;
	}

	public void setNomCompagnie(String nomCompagnie) {
		this.nomCompagnie = nomCompagnie;
	}

	public String getEffetSecondaire() {
		return effetSecondaire;
	}

	public void setEffetSecondaire(String effetSecondaire) {
		this.effetSecondaire = effetSecondaire;
	}

	@Override
	public String toString() {
		return "Medicament [nom=" + nom + ", quantite=" + quantite + ", dosage=" + dosage + ", nomCompagnie="
				+ nomCompagnie + ", effetSecondaire=" + effetSecondaire + "]";
	}
	
	
	
}
