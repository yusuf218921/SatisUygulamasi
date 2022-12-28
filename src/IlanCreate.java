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
             otomobiller.get(otomobilSay).setIlanID(ilanKayitId);
             otomobiller.get(otomobilSay).setBaslik(baslik);
             otomobiller.get(otomobilSay).setAciklama(aciklama);
             otomobiller.get(otomobilSay).setMarka(marka);
             otomobiller.get(otomobilSay).setModel(model);
             otomobiller.get(otomobilSay).setUretimYili(uretimYili);
             otomobiller.get(otomobilSay).setVitesTipi(vitesTipi);
             otomobiller.get(otomobilSay).setRenk(renk);
             otomobiller.get(otomobilSay).setKasa(kasa);
             otomobiller.get(otomobilSay).setYakit(yakit);
             otomobiller.get(otomobilSay).setCekis(cekis);
             otomobiller.get(otomobilSay).setFiyat(fiyat);
             otomobiller.get(otomobilSay).setUserID(registerId);

             check = false;
             ilanlar.add(otomobiller.get(otomobilSay));
             otomobilSay++;
             ilanKayitId++;

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
            motosikletler.get(motosikletSay).setIlanID(ilanKayitId);
            motosikletler.get(motosikletSay).setBaslik(baslik);
            motosikletler.get(motosikletSay).setAciklama(aciklama);
            motosikletler.get(motosikletSay).setMarka(marka);
            motosikletler.get(motosikletSay).setModel(model);
            motosikletler.get(motosikletSay).setUretimYili(uretimYili);
            motosikletler.get(motosikletSay).setVitesTipi(vitesTipi);
            motosikletler.get(motosikletSay).setRenk(renk);
            motosikletler.get(motosikletSay).setMotorHacim(motorHacim);
            motosikletler.get(motosikletSay).setMotorTip(motorTip);
            motosikletler.get(motosikletSay).setFiyat(fiyat);
            motosikletler.get(motosikletSay).setUserID(registerId);
            motosikletSay++;
            ilanKayitId++;
            check = false;
            ilanlar.addAll(motosikletler);
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
        daireler.get(daireSay).setIlanID(ilanKayitId);
        daireler.get(daireSay).setBaslik(baslik);
        daireler.get(daireSay).setAciklama(aciklama);
        daireler.get(daireSay).setOdaSayisi(odaSayisi);
        daireler.get(daireSay).setIsitma(isitma);
        daireler.get(daireSay).setAdres(adres);
        daireler.get(daireSay).setMkare(mkare);
        daireler.get(daireSay).setBinaYas(binaYas);
        daireler.get(daireSay).setKatSayisi(katSayisi);
        daireler.get(daireSay).setAidat(aidat);
        daireler.get(daireSay).setKredi(kredi);
        daireler.get(daireSay).setFiyat(fiyat);
        daireSay++;
        ilanKayitId++;
        check = false;
        ilanlar.addAll(daireler);
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
            arsalar.get(arsaSay).setIlanID(ilanKayitId);
            arsalar.get(arsaSay).setBaslik(baslik);
            arsalar.get(arsaSay).setAciklama(aciklama);
            arsalar.get(arsaSay).setImarDurum(imarDurum);
            arsalar.get(arsaSay).setMkare(mkare);
            arsalar.get(arsaSay).setKredi(kredi);
            arsalar.get(arsaSay).setFiyat(fiyat);
            arsalar.get(arsaSay).setmKareFiyat(mkare,fiyat);
            arsaSay++;
            ilanKayitId++;
            check = false;
            ilanlar.addAll(arsalar);
        }

    }

}


