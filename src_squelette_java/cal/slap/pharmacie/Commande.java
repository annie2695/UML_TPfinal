package cal.slap.pharmacie;

import cal.slap.user.Client;
import cal.slap.util.Date;

public class Commande {

	private String heure;
	private String etat;
	private int numeroCommande;
	private String numeroFacture;
	
	private Date date;
	private Client client;
	
	private static int compteur = 1;
	
	public Commande(Date date, Client client, String heure, String numeroFacture, String etat) {
		this.numeroCommande = compteur++;
		this.client = client;	
		this.date = date;
		this.heure = heure;
		this.numeroFacture = numeroFacture;
		this.etat = etat;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public int getNumeroCommande() {
		return numeroCommande;
	}

	public void setNumeroCommande(int numeroCommande) {
		this.numeroCommande = numeroCommande;
	}

	public String getNumeroFacture() {
		return numeroFacture;
	}

	public void setNumeroFacture(String numeroFacture) {
		this.numeroFacture = numeroFacture;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Commande [heure=" + heure + ", etat=" + etat + ", numeroCommande=" + numeroCommande + ", numeroFacture="
				+ numeroFacture + ", date=" + date + ", client=" + client + "]";
	}

	
	
	
}
