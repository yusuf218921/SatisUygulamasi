import java.lang.invoke.MethodHandleInfo;
import java.util.ArrayList;

public class VasitaMenu extends IlanMenu implements Menu
{
    int secim = -1;

    @Override
    public void menu() {
        boolean kontrol = true;

        while (secim != 3) {
            System.out.println("Vasıta İlanı Oluşturmak İçin Kategori Seçiminizi Yapınız: ");
            System.out.println("[1] Otomobil");
            System.out.println("[2] Motosiklet");
            System.out.println("[3] Geri Dön");

            while (kontrol) {
                try {
                    secim = scanner.nextInt();
                    kontrol = false;
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("Sistemde bir hata ile karşılaşıldı...");
                    System.out.println("Lütfen Tekrar Deneyiniz.");

                }

                switch (secim) {
                    case 1:
                        new IlanCreate().otomobilCreate();
                        System.out.println("\n\n****** İLANINIZ YAYIMLANDI ****** ");
                        secim = 3;
                        break;

                }
            }
        }

    }
}
