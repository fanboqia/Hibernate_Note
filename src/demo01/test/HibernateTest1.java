package demo01.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import demo01.*;

public class HibernateTest1 {
	
	
	// 保存一个Customer
	public void saveCustomerTest(){
        // 创建一个Customer
        Customer c = new Customer();
        c.setId(1);
        c.setName("nihao");
        c.setAddress("wuhan");

        // 使用Hibernate的API来完成将Customer信息保存到mysql数据库中的操作
        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();
        
//        String hql = "insert into hibernateTest(id,name,address)values(1,'nihao','nihao')";
//        session.createSQLQuery(hql).executeUpdate();
        
        
        // 操作
        session.save(c);

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();		
	}
	
	// 根据id查询一个Customer对象
    public void findCustomerByIdTest() {
        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();

        // 根据业务来编写代码
        // Customer c = session.get(Customer.class, 1);
        Customer c = session.load(Customer.class, 1);

        System.out.println("Name:!!!!!: "+c.getName());

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
    
    // 修改操作
    public void updateCustomerTest() {
        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();

        // 根据业务来编写代码
        Customer c = session.get(Customer.class, 1);
        c.setName("郑敏");
        session.update(c); // 修改操作

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
    
    // 删除操作---根据id进行删除
    public void deleteCustomerTest() {
        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();

        // 根据业务来编写代码
        Customer c = session.get(Customer.class, 15);
        session.delete(c); // 删除操作

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
    
    // 查询所有Customer
    public void findAllCustomerTest() {
        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();

        // 根据业务来编写代码
        Query query = session.createQuery("from Customer"); // HQL语句，它类似于SQL语句
        List<Customer> list = query.list();
        System.out.println("_______WOW_________:"+list);

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
	
	public static void main(String[] args) {
		//new HibernateTest1().saveCustomerTest();
		//new HibernateTest1().findAllCustomerTest();
		//new HibernateTest1().updateCustomerTest();
		//new HibernateTest1().findCustomerByIdTest();
		//new HibernateTest1().deleteCustomerTest();
	}

}
