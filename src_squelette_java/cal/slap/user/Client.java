package cal.slap.user;

import java.util.List;

import cal.slap.pharmacie.Adresse;
import cal.slap.pharmacie.Commande;
import cal.slap.util.Date;

public class Client {

	private int numeroTelephone;
	
	// Les relations
	private List<Commande> historiqueCommandes;
	private Adresse adresse;
	private Date date;
	
	public Client(Date dateNaissance, Adresse adresse) {
		super();
	}

	public int getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(int numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public List<Commande> getHistoriqueCommandes() {
		return historiqueCommandes;
	}

	public void setHistoriqueCommandes(List<Commande> historiqueCommandes) {
		this.historiqueCommandes = historiqueCommandes;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Client [numeroTelephone=" + numeroTelephone + ", historiqueCommandes=" + historiqueCommandes
				+ ", adresse=" + adresse + ", date=" + date + "]";
	}
	
	
	
	
	
}
