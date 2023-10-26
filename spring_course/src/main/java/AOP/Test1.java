package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = annotationConfigApplicationContext.getBean("unilibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = annotationConfigApplicationContext.getBean("schoollibrary",SchoolLibrary.class);
        Book book = annotationConfigApplicationContext.getBean("book",Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Viachaslau",book.getName());
        uniLibrary.addMagazine();
        //uniLibrary.returnMagazine();
        //uniLibrary.addBook();
        //uniLibrary.getMagazine();
        //uniLibrary.returnBook();
        //schoolLibrary.getBook();
        annotationConfigApplicationContext.close();
    }
}
