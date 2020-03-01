package teste.hibernateTeste;
import javax.persistence.*;

@Entity 
public class Pessoa {
	
	@Id
	@GeneratedValue
	private int ID;
	
	@Column
	private String Nome;
	
	@Column
	private int Idade;
	
	@Column
	private String CPF;
	
	public Pessoa() {}
	public Pessoa(String Nome, int Idade, String CPF) {
		this.Nome = Nome;
		this.Idade = Idade;
		this.CPF = CPF;
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	

	
	
}
