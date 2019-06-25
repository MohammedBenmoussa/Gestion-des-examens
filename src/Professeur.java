
public class Professeur {
private int id;
private String email;
private String password;
int valide;

public int getValide() {
	return valide;
}
public void setValide(int valide) {
	this.valide = valide;
}
public Professeur(int id, String email, String password) {
	super();
	this.id = id;
	this.email = email;
	this.password = password;
}
public Professeur() {
	super();
	// TODO Auto-generated constructor stub
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
