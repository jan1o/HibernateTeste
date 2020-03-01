package teste.hibernateTeste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PessoaDAO {
	//Atributos do promeiro tutorial
	private EntityManagerFactory fabrica;
	private EntityManager gerenciadorPessoa;
	
	public PessoaDAO() {
		fabrica = Persistence.createEntityManagerFactory("exemplo");
		gerenciadorPessoa = fabrica.createEntityManager();
	}
	//metodo do primeiro tutorial
	public void create(Pessoa pes){
		gerenciadorPessoa.getTransaction().begin();
		gerenciadorPessoa.persist(pes);
		gerenciadorPessoa.getTransaction().commit();
	}
	
	//metodos do segundo tutorial
	public void save(Pessoa pes) {
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		//inicia transaction
		transaction = session.beginTransaction();
		session.save(pes);
		transaction.commit(); 
		session.close();
	}
	public void update(Pessoa pes) {
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.saveOrUpdate(pes);
		transaction.commit();	
	}
	public Pessoa getPessoa(int ID) {
		Transaction transaction = null;
		Pessoa pes = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		
		pes = session.get(Pessoa.class, ID);
		
		transaction.commit();
		
		return pes; 
	}
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Pessoa> getAllPessoa() {
		Transaction transaction = null;
		List<Pessoa> pes = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		
		pes = session.createQuery("from pessoa").list();
		
		transaction.commit();
		
		return pes; 
	}
	
	public void deleteId(int ID) {
		Transaction transaction = null;
		Pessoa pes = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		
		pes = session.get(Pessoa.class, ID);
		
		session.delete(pes);
		
		transaction.commit();
	}
}
