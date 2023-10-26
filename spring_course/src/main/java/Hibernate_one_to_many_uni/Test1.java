//package Hibernate_one_to_many_uni;
//
//
//
//import Hibernate_one_to_many_uni.Entity.Department;
//import Hibernate_one_to_many_uni.Entity.Employee;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class Test1 {
//    public static void main(String[] args) {
//        SessionFactory factory =
//                 new Configuration()
//                         .configure("hibernate.cfg.xml")
//                         .addAnnotatedClass(Employee.class)
//                         .addAnnotatedClass(Department.class)
//                         .buildSessionFactory();
//
//
//
//
//        Session session = factory.getCurrentSession();
//        try {
//            Department dep = new Department("HR",500,1500);
//            Employee emp1 = new Employee("Oleg","Ivanov",1200);
//            Employee emp2 = new Employee("Elena","Smirnova",1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//               session.beginTransaction();
//               session.save(dep);
//
//
//            session.getTransaction().commit();
//            System.out.println("ALL DONE");
//        }
//        finally {
//            factory.close();
//            session.close();
//        }
//
//
//    }
//}
