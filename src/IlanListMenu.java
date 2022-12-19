public class IlanListMenu extends MainMenu implements Menu{

    @Override
    public void menu()
    {
        int secim = 0;
        System.out.println("[1] Vasıta");
        System.out.println("[2] Emlak");
        System.out.println("Listelemek İstediğiniz İlan Kategorisini Seçiniz: ");
        secim = scanner.nextInt();

        switch (secim)
        {
            case 1:
                System.out.println("[1] Otomobil");
                System.out.println("[2] Motosiklet");
                System.out.println("Listelemek İstediğiniz İlan Türünü Seçiniz: ");
                secim = scanner.nextInt();
                switch (secim)
                {
                    case 1:
                            new IlanList().ListOtomobil();
                        break;
                }
                break;
            case 2:
                System.out.println("[1] Daire");
                System.out.println("[2] Arsa");
                System.out.println("Listelemek stediğiniz İlan Türünü Seçiniz: ");
                secim = scanner.nextInt();
                break;

        }
    }
}
