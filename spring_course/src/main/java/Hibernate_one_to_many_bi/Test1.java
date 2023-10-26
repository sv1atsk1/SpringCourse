package Hibernate_one_to_many_bi;


import Hibernate_one_to_many_bi.Entity.Department;
import Hibernate_one_to_many_bi.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =
                 new Configuration()
                         .configure("hibernate.cfg.xml")
                         .addAnnotatedClass(Employee.class)
                         .addAnnotatedClass(Department.class)
                         .buildSessionFactory();




        Session session = factory.getCurrentSession();
        try {

            Department department = session.get(Department.class,1);
            System.out.println(department.getEmps());


            session.beginTransaction();
            session.save(department);


            session.getTransaction().commit();
            System.out.println("ALL DONE");
        }
        finally {
            factory.close();
            session.close();
        }


    }
}
