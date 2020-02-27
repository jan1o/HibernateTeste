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
	
	public Pessoa(String Nome, int Idade, String CPF) {
		this.Nome = Nome;
		this.Idade = Idade;
		this.CPF = CPF;
		
	}
	

	
	
}
