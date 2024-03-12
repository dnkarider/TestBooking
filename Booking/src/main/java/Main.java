import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Черновик", 2006, 352);
        System.out.println(book.isBig());
        System.out.println(book.matches("Черновик"));
        System.out.println(book.estimatePrice());
    }
}