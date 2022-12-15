import java.awt.*;
import java.util.Scanner;


public class MainMenu extends Main {

    public void Menu() throws InterruptedException {
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
                    if (new AccountCreate().loginAccountCheck(accounts,registerId))
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Giriş için yönlendiriliyorsunuz..");
                        try {
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e){
                            throw new RuntimeException(e);
                        }
                        new AccountLogin().Login();


                        System.out.println("");
                    }

                    break;
                case 2:
                    System.out.println("********** KAYIT OL **********\n");
                    new AccountRegister().Register();
                    System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
                    Thread.sleep(1000);

                    break;

                case 3:
                    System.out.println("Uygulamamızı kullandığınız için teşekkürler..");
                    System.out.println("Çıkış Yapılıyor....");
                    secim = 0;
                    break;
                default:
                    System.out.println("Yanlış Seçim Yaptınız Lütfen Tekrar Deneyiniz..");
                    break;
            }
        }

    }


}
