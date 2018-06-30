package demo03.test;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import demo03.Course;
import demo03.Student;

public class HibernateTest3 {

	public static void main(String[] args) {
		
		Course course = new Course();
		course.setCname("化学");
		
		Student student = new Student();
		student.setSname("刘备");
		
		student.getCourseSet().add(course);
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(course);
		session.save(student);
		
		session.getTransaction().commit();
	}

}
