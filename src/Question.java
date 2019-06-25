
public class Question {
	private int id;
	private String libelle;
	private int idprof;
	
	public int getIdprof() {
		return idprof;
	}
	public void setIdprof(int idprof) {
		this.idprof = idprof;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Question(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Question() {
		super();
	}
}
