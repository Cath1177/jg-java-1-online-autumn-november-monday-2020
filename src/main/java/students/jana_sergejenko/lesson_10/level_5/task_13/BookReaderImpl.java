package students.jana_sergejenko.lesson_10.level_5.task_13;

import java.util.Arrays;

public class BookReaderImpl implements BookReader {
    private final Book[] books = new Book[10];
    private int i = 0;

    @Override
    public boolean save(Book book) {
        if (!findByTitleAndAuthor(book.getTitle(), book.getAuthor())) {
            if((book.getTitle()!=" ")&&(book.getAuthor()!=" ")) {
                books[i] = book;
                i++;
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        System.out.println("save" + Arrays.toString(books));
    }

    @Override
    public boolean findByTitleAndAuthor(String title, String author) {
        for (Book book : books) {
            if ((book != null && (book.getTitle().equals(title)) && (book.getAuthor().equals(author)))) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        BookReader test = new BookReaderImpl();
        Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        test.printAll();
        Book book1 = new Book("Becoming", "Michelle Obama");
        test.save(book1);
        test.printAll();
        Book book2 = new Book("American Grown", "James Green");
        test.save(book2);
        test.printAll();
        Book book3 = new Book("One way", "James Green");
        test.save(book3);
        test.printAll();
    }
}