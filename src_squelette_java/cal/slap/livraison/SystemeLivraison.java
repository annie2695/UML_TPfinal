package cal.slap.livraison;

public class SystemeLivraison {

	/**
	 * static Singleton instance.
	 */
	private static volatile SystemeLivraison instance;

	/**
	 * Private constructor for singleton.
	 */
	private SystemeLivraison() {
	}

	/**
	 * Return a singleton instance of SystemeLivraison.
	 */
	public static SystemeLivraison getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (SystemeLivraison.class) {
				if (instance == null) {
					instance = new SystemeLivraison();
				}
			}
		}
		return instance;
	}
	
}
