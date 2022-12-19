public class IlanCreate extends Main{


    public void otomobilCreate()
    {
        boolean check = true;
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


             System.out.print("İlan Açıklaması: ");
             aciklama = scanner.next();
             System.out.print("Otomobil Markası: ");
             marka = scanner.next();
             System.out.print("Otomobil Modeli: ");
             model = scanner.next();
             System.out.print("Otomobil Üretim Yılı: ");
             uretimYili = scanner.nextInt();
             System.out.print("Otomobil Vites Tipi: ");
             vitesTipi = scanner.next();
             System.out.print("Otomobil Rengini Giriniz: ");
             renk = scanner.next();
             System.out.print("Otomobil Kasa Tipi: ");
             kasa = scanner.next();
             System.out.print("Otomobil Yakıt Tipi: ");
             yakit = scanner.next();
             System.out.print("Otomobil Çekiş Türünü");
             cekis = scanner.next();
             System.out.print("Satış Fiyatınızı Giriniz: ");
             fiyat = scanner.nextInt();

             otomobiller.add(new Otomobil());
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
             otomobiller.get(ilanKayitId).setUserID(registerId);
             ilanKayitId++;
             check = false;


        }
    }


    public void MotosikletCreate() {
        boolean check = true;


        String baslik, aciklama, marka, model, vitesTipi, renk, motorTip;
        int fiyat,uretimYili,motorHacim;
        while (check)
        {
        System.out.println("Motosiklet İlanı Oluşturmaktasınız.\n\n");
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

            System.out.print("İlan Açıklaması: ");
            aciklama = scanner.next();
            System.out.print("Motosiklet Markası: ");
            marka = scanner.next();
            System.out.print("Motosiklet Modeli: ");
            model = scanner.next();
            System.out.print("Motosiklet Üretim Yılı: ");
            uretimYili = scanner.nextInt();
            System.out.print("Motosiklet Vites Tipi: ");
            vitesTipi = scanner.next();
            System.out.print("Motosiklet Rengini Giriniz: ");
            renk = scanner.next();
            System.out.print("Motosiklet Motor Hacmi: ");
            motorHacim = scanner.nextInt();
            System.out.print("Motosiklet Motor Tipi: ");
            motorTip = scanner.next();
            System.out.print("Satış Fiyatınızı Giriniz: ");
            fiyat = scanner.nextInt();

            motosikletler.add(new Motosiklet());
            motosikletler.get(ilanKayitId).setIlanID(ilanKayitId);
            motosikletler.get(ilanKayitId).setBaslik(baslik);
            motosikletler.get(ilanKayitId).setAciklama(aciklama);
            motosikletler.get(ilanKayitId).setMarka(marka);
            motosikletler.get(ilanKayitId).setModel(model);
            motosikletler.get(ilanKayitId).setUretimYili(uretimYili);
            motosikletler.get(ilanKayitId).setVitesTipi(vitesTipi);
            motosikletler.get(ilanKayitId).setRenk(renk);
            motosikletler.get(ilanKayitId).setMotorHacim(motorHacim);
            motosikletler.get(ilanKayitId).setMotorTip(motorTip);
            motosikletler.get(ilanKayitId).setFiyat(fiyat);
            motosikletler.get(ilanKayitId).setUserID(registerId);
            ilanKayitId++;
            check = false;
        }
    }
}


