package cal.slap.pharmacie;

import java.util.List;

public class Prescription {

	private int numeroDocteur;
	private String nomDocteur;
	private String prenomDocteur;
	private String expiration;
	private int numeroPrescription;
	private int nombre;
	private String consigne;
	
	private List<Medicament> medicament;

	public Prescription(int numeroDocteur, String nomDocteur, String prenomDocteur, String expiration,
			int numeroPrescription, int nombre, String consigne, List<Medicament> medicament) {
		super();
		this.numeroDocteur = numeroDocteur;
		this.nomDocteur = nomDocteur;
		this.prenomDocteur = prenomDocteur;
		this.expiration = expiration;
		this.numeroPrescription = numeroPrescription;
		this.nombre = nombre;
		this.consigne = consigne;
		this.medicament = medicament;
	}

	public int getNumeroDocteur() {
		return numeroDocteur;
	}

	public void setNumeroDocteur(int numeroDocteur) {
		this.numeroDocteur = numeroDocteur;
	}

	public String getNomDocteur() {
		return nomDocteur;
	}

	public void setNomDocteur(String nomDocteur) {
		this.nomDocteur = nomDocteur;
	}

	public String getPrenomDocteur() {
		return prenomDocteur;
	}

	public void setPrenomDocteur(String prenomDocteur) {
		this.prenomDocteur = prenomDocteur;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public int getNumeroPrescription() {
		return numeroPrescription;
	}

	public void setNumeroPrescription(int numeroPrescription) {
		this.numeroPrescription = numeroPrescription;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public String getConsigne() {
		return consigne;
	}

	public void setConsigne(String consigne) {
		this.consigne = consigne;
	}

	public List<Medicament> getMedicament() {
		return medicament;
	}

	public void setMedicament(List<Medicament> medicament) {
		this.medicament = medicament;
	}

	@Override
	public String toString() {
		return "Prescription [numeroDocteur=" + numeroDocteur + ", nomDocteur=" + nomDocteur + ", prenomDocteur="
				+ prenomDocteur + ", expiration=" + expiration + ", numeroPrescription=" + numeroPrescription
				+ ", nombre=" + nombre + ", consigne=" + consigne + ", medicament=" + medicament + "]";
	}
	
	
	
}
