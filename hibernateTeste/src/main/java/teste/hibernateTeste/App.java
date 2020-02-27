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
        Pessoa pes = new Pessoa("janio",22,"703");
        
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("exemplo");
		EntityManager gerenciadorPessoa = fabrica.createEntityManager();
		gerenciadorPessoa.getTransaction().begin();
		gerenciadorPessoa.persist(pes);
		gerenciadorPessoa.getTransaction().commit();
    }
}
