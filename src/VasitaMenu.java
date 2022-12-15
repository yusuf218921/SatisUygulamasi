import java.util.ArrayList;

public class VasitaMenu extends IlanMenu
{
    int secim = -1;
    @Override
    public void Menu()
    {
        while(secim!=3) {
            System.out.println("[1] Otomobil");
            System.out.println("[2] Vasıta");
            System.out.println("[3] Geri Dön");
            System.out.println("Seçiminizi yapınız: ");
            secim=scanner.nextInt();


            }
        }
    

}
