import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        // Ensure the list is sorted
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);

            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Java Programming", "Author A"));
        library.addBook(new Book(2, "Python Programming", "Author B"));
        library.addBook(new Book(3, "Algorithms", "Author C"));

        // Testing linear search
        Book foundBook = library.linearSearchByTitle("Java Programming");
        if (foundBook != null) {
            System.out.println("Linear Search - Book found: " + foundBook);
        } else {
            System.out.println("Linear Search - Book not found");
        }

        // Testing binary search
        foundBook = library.binarySearchByTitle("Python Programming");
        if (foundBook != null) {
            System.out.println("Binary Search - Book found: " + foundBook);
        } else {
            System.out.println("Binary Search - Book not found");
        }
    }
}
