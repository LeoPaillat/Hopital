package hospital.model;

import java.util.Objects;

public class Compte {
	private int id;
	private String login;
	private String password;
	private String typeCompte;
	private boolean connecte=false;
	
	
	public Compte() {
		
	}
	
	public Compte(int id, String login, String password, String typeCompte) {
		this.id=id;
		this.login=login;
		this.password=password;
		this.typeCompte=typeCompte;
	}
	
	
	public Compte(int id, String login, String password, boolean connecte) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.connecte = connecte;
	}

	public void setId() {
		this.id=id;
	}
	
	public void setLogin() {
		this.login=login;
	}
	
	public void setPassword() {
		this.password=password;
	}
	
	public void setTypeCompte () {
	this.typeCompte=typeCompte;
	}
	
	public void SetConnecte (boolean connecte) {
		this.connecte=connecte;
	}
	
	public int getId() {
		return id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getTypeCompte() {
		return typeCompte;
	}
	
	public boolean getConnecte() {
		return connecte;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		return id == other.id;
	}
	
	

}
