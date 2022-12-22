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

    public void daireCreate(){
        String baslik=null , aciklama,odaSayisi,isitma,adres;
        int fiyat,mkare,binaYas,katSayisi,aidat;
        boolean kredi;
        boolean check = true;
        while (check) {
            System.out.println("Daire İlanı Oluşturmaktasınız.\n\n");
            System.out.println("İlan Başlığı: ");
            baslik = scanner.next();

            if (new IlanQuery(baslik).createQuery(ilanlar)) {
                System.out.println("Tekrar denemek ister misiniz? (evet/hayır)");
                String secim = scanner.next().toLowerCase();
                if (secim.equals("hayır")) {
                    check = false;
                }
            }

        System.out.println("İlanınızın Açıklamasını Giriniz: ");
        aciklama = scanner.next();
        System.out.println("Dairenizin Oda Sayısını Giriniz: ");
        odaSayisi = scanner.next();
        System.out.println("Dairenizin Isıtma Şekli: ");
        isitma = scanner.next();
        System.out.println("Dairenizin Adresi: ");
        adres = scanner.next();
        System.out.println("Dairenizin Metrekaresini Giriniz: ");
        mkare = scanner.nextInt();
        System.out.println("Dairenizin Bulunduğu Bina Yaşı: ");
        binaYas = scanner.nextInt();
        System.out.println("Dairenizin Kat Sayısı: ");
        katSayisi = scanner.nextInt();
        System.out.println("Dairenizin Bulunduğu Binanın Aidatı : ");
        aidat = scanner.nextInt();
        System.out.println("Dairenizin Krediye Uygunluk Durumu: ");
        kredi = scanner.nextBoolean();
        System.out.println("Dairenizin Fiyatı: ");
        fiyat = scanner.nextInt();

        daireler.add(new Daire());
        daireler.get(ilanKayitId).setIlanID(ilanKayitId);
        daireler.get(ilanKayitId).setBaslik(baslik);
        daireler.get(ilanKayitId).setAciklama(aciklama);
        daireler.get(ilanKayitId).setOdaSayisi(odaSayisi);
        daireler.get(ilanKayitId).setIsitma(isitma);
        daireler.get(ilanKayitId).setAdres(adres);
        daireler.get(ilanKayitId).setMkare(mkare);
        daireler.get(ilanKayitId).setBinaYas(binaYas);
        daireler.get(ilanKayitId).setKatSayisi(katSayisi);
        daireler.get(ilanKayitId).setAidat(aidat);
        daireler.get(ilanKayitId).setKredi(kredi);
        daireler.get(ilanKayitId).setFiyat(fiyat);
        ilanKayitId++;
        check = false;

     }
    }
    public void arsaCreate(){
        String baslik=null , aciklama, imarDurum;
        int fiyat,mkare,mkareFiyat;
        boolean kredi;
        boolean check = true;
        while (check) {

            System.out.println("Daire İlanı Oluşturmaktasınız.\n\n");
            System.out.println("İlan Başlığı: ");
            baslik = scanner.next();

            if (new IlanQuery(baslik).createQuery(ilanlar)) {
                System.out.println("Tekrar denemek ister misiniz? (evet/hayır)");
                String secim = scanner.next().toLowerCase();
                if (secim.equals("hayır")) {
                    check = false;
                }
            }

            System.out.println("İlanınızın Açıklamasını Giriniz: ");
            aciklama = scanner.next();
            System.out.println("Arsanızın İmar Durumunu Giriniz: ");
            imarDurum = scanner.next();
            System.out.println("Dairenizin Metrekaresini Giriniz: ");
            mkare = scanner.nextInt();
            System.out.println("Dairenizin Krediye Uygunluk Durumu: ");
            kredi = scanner.nextBoolean();
            System.out.println("Dairenizin Fiyatı: ");
            fiyat = scanner.nextInt();
            mkareFiyat = fiyat/mkare;

            arsalar.add(new Arsa());
            arsalar.get(ilanKayitId).setIlanID(ilanKayitId);
            arsalar.get(ilanKayitId).setBaslik(baslik);
            arsalar.get(ilanKayitId).setAciklama(aciklama);
            arsalar.get(ilanKayitId).setImarDurum(imarDurum);
            arsalar.get(ilanKayitId).setMkare(mkare);
            arsalar.get(ilanKayitId).setKredi(kredi);
            arsalar.get(ilanKayitId).setFiyat(fiyat);
            arsalar.get(ilanKayitId).setmKareFiyat(mkare,fiyat);
            ilanKayitId++;
            check = false;

        }

    }
}


