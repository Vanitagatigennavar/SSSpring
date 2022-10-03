package com.xworkz.bathroom.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import com.xworkz.bathroom.entity.BathroomEntity;
import static com.xworkz.util.BathroomUtil.getfactory;
public class BathroomDAOImpl implements BathroomDAO 
{
	private  EntityManagerFactory factory = getfactory();
	public boolean save(BathroomEntity entity) {
		try {
//			EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
			   EntityManager manager=factory.createEntityManager();
			   EntityTransaction tx=manager.getTransaction();
			   tx.begin();
			   manager.persist(entity);
			    tx.commit();
			   factory.close();
			   manager.close();
			   } catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
}



	

		