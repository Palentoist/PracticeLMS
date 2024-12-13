import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        
        while (true) 
        {
            System.out.println("===== Library System Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Exit");
            
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(title, author, false);
                    library.addBook(newBook);
                    break;
                    
                case 2:
                    library.displayBooks();
                    break;
                    
                case 3:
                    System.out.print("Enter your name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Are you a Student or Faculty? (Enter 'Student' or 'Faculty'): ");
                    String memberType = scanner.nextLine();
                    Member member;
                    if (memberType.equalsIgnoreCase("Student")) 
                    {
                        member = new Student(1, memberName);
                    } 
                    else if (memberType.equalsIgnoreCase("Faculty")) 
                    {
                        member = new Faculty(2, memberName);
                    } 
                    else 
                    {
                        System.out.println("The Fuck You Typed ?");
                        break;
                    }
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle, member);
                    break;
                    
                case 4:
                    System.out.println("EXITING!!");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Try Again Bitch!!");
            }
        }
    }
}
