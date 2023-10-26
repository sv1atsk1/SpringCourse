package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = annotationConfigApplicationContext.getBean("university", University.class);
        university.addStudents();
        try {

            List<Student> students = university.getStudents();
            System.out.println(students);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Было поймано исключение " + e);
        }

        annotationConfigApplicationContext.close();

    }
}
