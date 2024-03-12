public class Book {
    String title;
    int releaseYear;
    int pages;

    Author author = new Author("Сергей", "Лукьяненко", 10);

    public Book(String title, int releaseYear, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    public boolean isBig() {
        boolean tf;
        if (pages > 500) {
            tf = true;
        } else {
            tf = false;
        }
        return tf;
    }

    public String matches(String word) {
        if (title.contains(word)) {
            return title;
        } else if (author.name.contains(word)) {
            return author.name;
        } else if (author.surname.contains(word)) {
            return author.surname;
        } else return "Книги по вашему запросу нет";
    }

    public int estimatePrice() {
        double price;
        if (250 > Math.floor(pages / 3 * Math.sqrt(author.rating))) {
            price = 250;
            return (int) price;
        } else {
            price = Math.floor(pages / 3 * Math.sqrt(author.rating));
            return (int) price;
        }
    }
}
