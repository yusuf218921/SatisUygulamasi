public class UserMenu extends Main
{
    public void Menu()
    {
        secim = -1;
        while(secim != 0)
        {
            System.out.println("\nİyi Günler");
            System.out.println(users.get(loginId).getFirstName() + " " + users.get(loginId).getLastName().toUpperCase());
        }
    }
}
