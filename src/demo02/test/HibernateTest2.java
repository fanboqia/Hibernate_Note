package demo02.test;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.hibernate.cfg.Configuration;

public class HibernateTest2 {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String hql = "from Classroom c left outer join c.students";
		//List<Object[]>list = session.createQuery(hql).list();
		
		System.out.println("_______WOW_____:"+session.createQuery(hql).list());
		
//		for(Object[] inner_list : list){
//			for(Object item : inner_list){
//				System.out.println(item+"\t");
//			}
//			System.out.println();
//		}
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
