package AOP;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Book {

    @Value("Преступление и наказание")
    private String name;

    @Value("Ф.М. Достоевский")
    private String Author;

    @Value("1866")
    private int yearOfPublication;

    public String getAuthor() {
        return Author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }
}
