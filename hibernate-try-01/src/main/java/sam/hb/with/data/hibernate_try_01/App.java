package sam.hb.with.data.hibernate_try_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sam.hb.with.data.entity.Instructor;
import sam.hb.with.data.entity.InstructorDetail;
import sam.hb.with.data.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory  factory =null ;
        try {
        	factory  = new Configuration()
        								.configure("hibernate.cfg.xml")
        								.addAnnotatedClass(Student.class)
        								.addAnnotatedClass(Instructor.class)
        								.addAnnotatedClass(InstructorDetail.class)
        								.buildSessionFactory();
        	Session session = factory.getCurrentSession();
        	session.beginTransaction();
        	InstructorDetail id = session.get(InstructorDetail.class, 10);
        	//session.save(id);
        	//Instructor ins = new Instructor("sam","ksh","sam@ksh.com",id);
        	//id.setInstructor(ins);
        	//session.save(id);
        	session.delete(id);
        	System.out.println(id);
        	session.getTransaction().commit();
        	session.close();
        	factory.close();
        }
        catch(Exception e) {
        	e.printStackTrace();
        	factory.close();
        }
    }
}
