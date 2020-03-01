package teste.hibernateTeste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//teste 1 - OK
    	//Pessoa pes = new Pessoa("janio",22,"703");
        //Pessoa pes2 = new Pessoa("teste",1,"001");
        //Pessoa pes3 = new Pessoa("teste",1,"002");
        PessoaDAO dao = new PessoaDAO();
        
        //dao.create(pes);
        //dao.save(pes2);
        //dao.save(pes3);
        
        //pes3.setID(3);
        //pes3.setCPF("003");
        //dao.update(pes3);
        
        //List<Pessoa> pess = dao.getAllPessoa();
        //System.out.printf("%d, %d",pess.get(0).getID(),pess.get(1).getID());
        
        dao.deleteId(3);
    	//teste 2 - ok
    	/*//Aluno al = new Aluno("Aluno1","escola1");
    	//AlunoDAO dao = new AlunoDAO();
    	//dao.save(al);
    	//Aluno at = dao.getAluno(1);
    	//System.out.print(at.getID());*/
    }
}
