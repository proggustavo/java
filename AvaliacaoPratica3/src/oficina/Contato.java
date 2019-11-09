package oficina;

public class Contato {
	private String telefone;
	private String email;
	
	public Contato(String telefone, String email) {
		super();
		this.telefone = telefone;
		this.email = email;
	}
	
	
	public Contato() {
		super();

	}


	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Contato [telefone=" + telefone + ", email=" + email + "]";
	};
	
	
	
	

}
