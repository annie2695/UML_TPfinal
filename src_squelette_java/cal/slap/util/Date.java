package cal.slap.util;

public class Date {

	private String jour;
	private String mois;
	private String annee;
	
	public Date(String jour, String mois, String annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}
	
	
	
}
