
public class Users {
private int id;
private String login;
private String password;
private String Nom;
private String Prenom;
private String dateNaissance;
private String Adresse;
private int active;
private int idprofesseur;
private int valide;
public int getId() {
	return id;
}

public int getValide() {
	return valide;
}

public void setValide(int valide) {
	this.valide = valide;
}

public void setId(int id) {
	this.id = id;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
public int getIdprofesseur() {
	return idprofesseur;
}
public void setIdprofesseur(int idprofesseur) {
	this.idprofesseur = idprofesseur;
}

public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getPrenom() {
	return Prenom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}
public String getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(String dateNaissance) {
	this.dateNaissance = dateNaissance;
}
public String getAdresse() {
	return Adresse;
}
public void setAdresse(String adresse) {
	Adresse = adresse;
}
public Users() {
	super();
}
public Users(int id, String login, String password,String nom,String Prenom,String dateNaissance,String Adresse, int active, int idprofesseur) {
	super();
	this.id = id;
	this.login = login;
	this.password = password;
	this.Nom=nom;
	this.Prenom=Prenom;
	this.dateNaissance=dateNaissance;
	this.Adresse=Adresse;
	
	
	
	this.active = active;
	this.idprofesseur = idprofesseur;
}

}
