package AOP;

import org.springframework.stereotype.Component;

@Component("schoollibrary")
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Мы берём книгу из SchoolLibrary");

    }
}
