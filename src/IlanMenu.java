public class IlanMenu extends MainMenu{
    @Override
    public void Menu()
    {
     int check = -1;

     while (check!=0)
     {
         System.out.println("****** İLAN OLUŞTUR ******");
         System.out.println("\n\ni) İlan oluşturma sayfasına hoşgeldiniz.\n\n");
         System.out.println("[1] Vasıta");
         System.out.println("[2] Emlak");
         System.out.println("[3] Hesap Menüsüne Dön");
         System.out.println("[4] Ana Menüye Dön");
         System.out.println("\nSeçiminizi yapınız: ");
         check = scanner.nextInt();

         switch (check)
         {
             case 1:

                 break;

         }

     }

    }
}
