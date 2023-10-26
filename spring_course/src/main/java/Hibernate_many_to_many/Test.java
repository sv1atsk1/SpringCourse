package Hibernate_many_to_many;

import Hibernate_many_to_many.Entity.Child;
import Hibernate_many_to_many.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try{
            session = factory.getCurrentSession();
            Section section1 = new Section( "Volleyball");
            Section section2 = new Section( "Chess");
            Section section3 = new Section( "Math");
            Child child1 = new Child("Igor",9);
            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.beginTransaction();
            session.save(child1);

            session.getTransaction().commit();
            System.out.println("DONE!");



        }
        finally {
            session.close();
            factory.close();

        }
    }
}
