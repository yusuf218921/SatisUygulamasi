import java.io.IOException;

public class EmlakMenu extends IlanMenu implements Menu {

    int secim = -1;
    @Override
    public void menu(){

        boolean kontrol = true;


      while(secim != 3){
        System.out.println("Vasıta İlanı Oluşturmak İçin Kategori Seçiminizi Yapınız: ");
        System.out.println("[1] Daire");
        System.out.println("[2] Arsa");
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
        }

        switch (secim) {
            case 1:
                new IlanCreate().daireCreate();
                System.out.println("\n\n****** İLANINIZ YAYIMLANDI ****** ");
                try {
                    System.out.println("Devam etmek için ENTER tuşuna basınız...");
                    System.in.read();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                secim = 3;
                break;
            case 2:
                new IlanCreate().arsaCreate();
                System.out.println("\n\n****** İLANINIZ YAYIMLANDI ****** ");
                try {
                    System.out.println("Devam etmek için ENTER tuşuna basınız...");
                    System.in.read();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                secim = 3;
                break;
        }
     }
    }

}
