public class Book 
{
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author, boolean isBorrowed) 
    {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public boolean isBorrowed() 
    {
        return isBorrowed;
    }

    public void borrowBook() 
    {
        this.isBorrowed = true;
    }

    public void setBorrowed(boolean isBorrowed) 
    {
        this.isBorrowed = isBorrowed;
    }

    public void show() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));
    }
}
