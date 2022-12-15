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
                otomobiller.add(new Otomobil());

             System.out.println("İlan Açıklaması: ");
             aciklama = scanner.next();
             System.out.println("Otomobil Markası: ");
             marka = scanner.next();
             System.out.println("Otomobil Modeli: ");
             model = scanner.next();
             System.out.println("Otomobil Üretim Yılı: ");
             uretimYili = scanner.nextInt();
             System.out.println("Otomobil Vites Tipi: ");
             vitesTipi = scanner.next();
             System.out.println("Otomobil Rengini Giriniz: ");
             renk = scanner.next();
             System.out.println("Otomobil Kasa Tipi: ");
             kasa = scanner.next();
             System.out.println("Otomobil Yakıt Tipi: ");
             yakit = scanner.next();
             System.out.println("Otomobil Çekiş Türünü");
             cekis = scanner.next();
             System.out.println("Satış Fiyatınızı Giriniz: ");
             fiyat = scanner.nextInt();

             otomobiller.get(ilanKayitId).setIlanID(ilanKayitId);
             otomobiller.get(ilanKayitId).setBaslik(baslik);
             otomobiller.get(ilanKayitId).setAciklama(aciklama);
             otomobiller.get(ilanKayitId).setMarka(marka);
             otomobiller.get(ilanKayitId).setModel(model);
             otomobiller.get(ilanKayitId).setUretimYili(uretimYili);
             otomobiller.get(ilanKayitId).setVitesTipi(vitesTipi);
             otomobiller.get(ilanKayitId).setRenk(renk);
             otomobiller.get(ilanKayitId).setKasa(kasa);
             otomobiller.get(ilanKayitId).setYakit(yakit);
             otomobiller.get(ilanKayitId).setCekis(cekis);
             otomobiller.get(ilanKayitId).setFiyat(fiyat);
             ilanKayitId++;


            }
        }
    }
}
