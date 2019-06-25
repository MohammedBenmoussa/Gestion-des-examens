
public class Reponse {
private int id;
private String reponse;
private int idquestion;
private int valide;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getReponse() {
	return reponse;
}
public void setReponse(String reponse) {
	this.reponse = reponse;
}
public int getIdquestion() {
	return idquestion;
}
public void setIdquestion(int idquestion) {
	this.idquestion = idquestion;
}
public int getValide() {
	return valide;
}
public void setValide(int valide) {
	this.valide = valide;
}
public Reponse(int id, String reponse, int idquestion, int valide) {
	super();
	this.id = id;
	this.reponse = reponse;
	this.idquestion = idquestion;
	this.valide = valide;
}
public Reponse() {
	super();
	}
}
