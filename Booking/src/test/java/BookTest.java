import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    Book book = new Book("Черновик", 2006, 352);
    @Test
    public void isBigTest(){
        Book book = new Book("Черновик", 2006, 352);
        boolean tf = book.isBig();
        Assertions.assertFalse(tf);
    }
    @Test
    public void constructorBookTest(){
        Book book = new Book("Черновик", 2006, 352);
        boolean tf = (book.title.equals("Черновик") && book.releaseYear == 2006 && book.pages == 352);
        Assertions.assertTrue(tf);
    }
    @Test
    public void estimatePriceTest(){
        int priceTest = book.estimatePrice();
        Assertions.assertEquals(priceTest, 369);
    }
    @Test
    public void matchesTest(){
        String authorSearch = book.matches("Нил Стивенсон");
        Assertions.assertNotEquals("Нет книги по вашему запросу", authorSearch);
    }
}
