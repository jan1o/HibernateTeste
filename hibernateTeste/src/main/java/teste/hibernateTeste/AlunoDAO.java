package teste.hibernateTeste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlunoDAO {
	//Atributos do promeiro tutorial
		private EntityManagerFactory fabrica;
		private EntityManager gerenciadorPessoa;
		
		public AlunoDAO() {
			fabrica = Persistence.createEntityManagerFactory("exemplo");
			gerenciadorPessoa = fabrica.createEntityManager();
		}
		//metodo do primeiro tutorial
		public void create(Aluno al){
			gerenciadorPessoa.getTransaction().begin();
			gerenciadorPessoa.persist(al);
			gerenciadorPessoa.getTransaction().commit();
		}
		
		//metodos do segundo tutorial
		public void save(Aluno al) {
			Transaction transaction = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			//inicia transaction
			transaction = session.beginTransaction();
			session.save(al);
			transaction.commit(); 
			session.close();
			
		}
		public void update(Aluno al) {
			Transaction transaction = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(al);
			transaction.commit();	
		}
		public Aluno getAluno(int ID) {
			Transaction transaction = null;
			Aluno al = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			al = session.get(Aluno.class, ID);
			
			transaction.commit();
			
			return al; 
		}
		@SuppressWarnings({ "unchecked", "deprecation" })
		public List<Aluno> getAllAluno() {
			Transaction transaction = null;
			List<Aluno> al = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			al = session.createQuery("from aluno").list();
			
			transaction.commit();
			
			return al; 
		}
		
		public void deleteId(int ID) {
			Transaction transaction = null;
			Aluno al = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			al = session.get(Aluno.class, ID);
			
			session.delete(al);
			
			transaction.commit();
		}
}
