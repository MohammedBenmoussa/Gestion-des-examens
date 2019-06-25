
public class Resultat {
	private int idresultat;
	private int score;
	private int idusers;
	private int valide;
	public int getValide() {
		return valide;
	}
	public void setValide(int valide) {
		this.valide = valide;
	}
	public int getIdresultat() {
		return idresultat;
	}
	public void setIdresultat(int idresultat) {
		this.idresultat = idresultat;
	}
	public int getScore() {
		return score;
	}
	public Resultat(int idresultat, int score, int idusers, int valide) {
		super();
		this.idresultat = idresultat;
		this.score = score;
		this.idusers = idusers;
		this.valide = valide;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getIdusers() {
		return idusers;
	}
	public void setIdusers(int idusers) {
		this.idusers = idusers;
	}
	public Resultat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
