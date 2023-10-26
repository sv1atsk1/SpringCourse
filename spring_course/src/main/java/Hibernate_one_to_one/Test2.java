package Hibernate_one_to_one;

import Hibernate_one_to_one.Entity.Detail;
import Hibernate_one_to_one.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Detail.class)
                        .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Nikolay","Ivanov",
                    "Sales",750);
            Detail detail = new Detail("Moscow","+67823464",
                    "kolyan@mail.ru");
            employee.setEmpDetail(detail);
            detail.setEmployee(employee);

            session.beginTransaction();

            session.save(detail);

            session.getTransaction().commit();
            System.out.println("ALL DONE");
        }
        finally {
            factory.close();
        }

    }
}
