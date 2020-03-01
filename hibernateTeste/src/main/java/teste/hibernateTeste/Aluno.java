package teste.hibernateTeste;
import javax.persistence.*;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue
	private int ID;
	
	@Column
	private String nome;
	
	@Column
	private String escola;
	
	public Aluno() {}
	public Aluno(String nome, String escola) {
		this.nome = nome;
		this.escola = escola;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}
	
}
