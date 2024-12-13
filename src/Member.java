public class Member 
{
    private int memberId;
    private String name;
    private String memberType; 

    public Member(int memberId, String name, String memberType) 
    {
        this.memberId = memberId;
        this.name = name;
        this.memberType = memberType;
    }

    public int getMemberId() 
    {
        return memberId;
    }

    public String getName() 
    {
        return name;
    }

    public String getMemberType() 
    {
        return memberType;
    }

    public void showInfo() 
    {
        System.out.println("MEMBER INFO");
        System.out.println("ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + memberType);
    }
}
