package teste.hibernateTeste;

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
        Pessoa pes2 = new Pessoa("teste",1,"001");
        Pessoa pes3 = new Pessoa("teste",1,"002");
        PessoaDAO dao = new PessoaDAO();
        
        //dao.create(pes);
        dao.save(pes2);
        dao.save(pes3);
        
    	//teste 2 - ok
    	/*Aluno al = new Aluno("Aluno1","escola1");
    	AlunoDAO adao = new AlunoDAO();
    	adao.save(al);*/
    }
}
