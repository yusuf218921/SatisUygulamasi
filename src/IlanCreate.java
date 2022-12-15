public class IlanCreate extends Main{
    boolean check = true;

    public void otomobilCreate()
    {
        while (check)
        {
            String baslik,aciklama,marka,model,vitesTipi,renk,kasa,yakit,cekis;
            int fiyat,uretimYili;

            System.out.println("Otomobil İlanı Oluşturmaktasınız.\n\n");
            System.out.println("İlan Başlığı: ");
            baslik = scanner.next();
            if (new IlanQuery(baslik).createQuery(ilanlar))
            {
                System.out.println("Tekrar denemek ister misiniz? (evet/hayır)");
                String secim = scanner.next().toLowerCase();
                if (secim.equals("hayır"))
                {
                    check = false;
                }
            }
            else
            {
             System.out.println("İlan Açıklaması: ");
             aciklama = scanner.next();
             System.out.println("Otomobil Markası: ");
             marka = scanner.next();
             System.out.println("Otomobil Modeli: ");
             model = scanner.next();
             System.out.println("Otomobil Üretim Yılı: ");
             uretimYili = scanner.nextInt();
             System.out.println("");

            }
        }
    }
}
