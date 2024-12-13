public class Student extends Member 
{
    private int maxBooksAllowed = 5; 

    public Student(int memberId, String name) 
    {
        super(memberId, name, "Student");
    }

    public int getMaxBooksAllowed() 
    {
        return maxBooksAllowed;
    }

    @Override
    public void showInfo() 
    {
        super.showInfo();
        System.out.println("Max Books Allowed: " + maxBooksAllowed);
    }
}
