public class Faculty extends Member 
{
    private int maxBooksAllowed = 10; 

    public Faculty(int memberId, String name) 
    {
        super(memberId, name, "Faculty");
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
