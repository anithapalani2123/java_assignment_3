package question3;
public class example
{
    public static void main(String[] args)
    {
        Sports spo = new Sports();
        System.out.println(spo.getName());
        spo.getNumberOfTeamMembers();
        Soccer soc = new Soccer();
        System.out.println(soc.getName());
        soc.getNumberOfTeamMembers();
    }
}