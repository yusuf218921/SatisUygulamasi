import java.awt.*;
import java.util.Scanner;

public class MainMenu extends Main {


    public void Menu()
    {
        secim = -1;

        while(secim != 0)
        {
            System.out.println("************ SATIŞ UYGULAMASINA HOŞGELDİNİZ ************ ");
            System.out.println("[1] Giriş Yap");
            System.out.println("[2] Kayıt Ol");
            System.out.println("[3] Çıkış Yap");
            System.out.println("\nLütfen seçiminizi yapınız: ");
            secim = scanner.nextInt();

            switch (secim)
            {
                case 1:
                    
                    break;
                case 2:
                    System.out.println();
                    break;
            }
        }

    }


}
