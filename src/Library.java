import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Book> borrowedBooks;

    public Library() 
    {
        this.books = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
    }

    public void addBook(Book book) 
    {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void borrowBook(String title, Member member) 
    {
        int borrowedCount = (int) borrowedBooks.stream().filter(b -> b.isBorrowed()).count();
        int maxBooksAllowed = member instanceof Student ? ((Student) member).getMaxBooksAllowed() : ((Faculty) member).getMaxBooksAllowed();

        if (borrowedCount >= maxBooksAllowed) 
        {
            System.out.println(member.getName() + " has already reached the borrowing limit.");
            return;
        }

        for (Book book : books) 
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
            {
                if (book.isBorrowed()) 
                {
                    System.out.println("Sorry, the book \"" + title + "\" is already borrowed.");
                } 
                else 
                {
                    book.borrowBook();
                    borrowedBooks.add(book);
                    System.out.println(member.getName() + " has borrowed \"" + title + "\".");
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void displayBooks() 
    {
        if (books.isEmpty()) 
        {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in the Library:");
        for (Book book : books) 
        {
            book.show();
            System.out.println("--------------------");
        }
    }
}
