
public class QuestionReponse {
private int idqr;
private int idquestion;
private int idreponse;
private int valide;
private int idteste;
public int getIdqr() {
	return idqr;
}
public void setIdqr(int idqr) {
	this.idqr = idqr;
}
public int getIdquestion() {
	return idquestion;
}
public void setIdquestion(int idquestion) {
	this.idquestion = idquestion;
}
public int getIdreponse() {
	return idreponse;
}
public void setIdreponse(int idreponse) {
	this.idreponse = idreponse;
}
public int getValide() {
	return valide;
}
public void setValide(int valide) {
	this.valide = valide;
}
public int getIdteste() {
	return idteste;
}
public void setIdteste(int idteste) {
	this.idteste = idteste;
}
public QuestionReponse(int idqr, int idquestion, int idreponse, int valide, int idteste) {
	super();
	this.idqr = idqr;
	this.idquestion = idquestion;
	this.idreponse = idreponse;
	this.valide = valide;
	this.idteste = idteste;
}

}
