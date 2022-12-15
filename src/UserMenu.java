public class UserMenu extends Main
{
    public void Menu()
    {
        secim = -1;
        while(secim != 0)
        {
            System.out.println("\nİyi Günler");
            System.out.println(users.get(loginId).getFirstName() + " " + users.get(loginId).getLastName().toUpperCase());

            System.out.println("\n[1] İlanlara Göz At");
            System.out.println("[2] İlan Oluştur");
            System.out.println("[3] İlan Sil");
            System.out.println("[4] İlanlarım");
            System.out.println("[5] Kullanıcı Bilgilerini Görüntüle");
            System.out.println("[6] Kullanıcı Bilgilerini Güncelle");
            System.out.println("[7] Hesaptan Çıkış Yap");
            System.out.println("[8] Uygulamadan Çıkış Yap\n");
            System.out.println("\nSeçiminizi yapınız: ");
            secim = scanner.nextInt();



        }
    }
}
