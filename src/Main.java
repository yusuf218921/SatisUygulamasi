public class Main extends Static {

    public static void main(String[] args) throws InterruptedException {
        while (loop)
        {
            menu = new MainMenu();
            menu.menu();

            if (UserLogin)
            {
                loop = true;
                menu = new UserMenu();
                menu.menu();
                UserLogin=false;
                loop = true;
            }
        }


    }
}