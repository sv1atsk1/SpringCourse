package Hibernate_one_to_one;

import Hibernate_one_to_one.Entity.Detail;
import Hibernate_one_to_one.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =
                 new Configuration()
                         .configure("hibernate.cfg.xml")
                         .addAnnotatedClass(Employee.class)
                         .addAnnotatedClass(Detail.class)
                         .buildSessionFactory();

//        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Viachaslau","Sviatski",
//                    "IT",500);
//            Detail detail = new Detail("Minsk","+543534634",
//                    "sviat2004@mail.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("ALL DONE");
//        }
//        finally {
//            factory.close();
//        }


        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();
            Employee employee = session.get(Employee.class,2);
            session.delete(employee);
            System.out.println(employee.getEmpDetail());
            session.getTransaction().commit();
            System.out.println("ALL DONE");
        }
        finally {
            factory.close();
            session.close();
        }


    }
}
