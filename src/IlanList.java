public class IlanList extends Static{

    public void List() {
        for(Ilan ilan: ilanlar)
        {
            System.out.println("\n\n\nİlan ID: "+ilan.getIlanID());
            System.out.println("İlan Başlık: "+ilan.getBaslik());
            System.out.println("İlan Açıklaması: " + ilan.getAciklama());
            System.out.println("İlan Fiyat: " + ilan.getFiyat());
        }
    }
    public void ListUser(){
        for (Ilan ilan:ilanlar)
        {
            if (ilanlar.get(ilanKayitId).getUserID()==users.get(registerId).getId())
            {
                System.out.println("\n\n\nİlan ID: "+ilan.getIlanID());
                System.out.println("İlan Başlık: "+ilan.getBaslik());
                System.out.println("İlan Açıklaması: " + ilan.getAciklama());
                System.out.println("İlan Fiyat: " + ilan.getFiyat());
            }

        }
    }

    public void ListOtomobil(){
        for(Otomobil otomobil: otomobiller)
        {
            System.out.println("\n\n\nİlan ID: "+otomobil.getIlanID());
            System.out.println("İlan Başlık: "+otomobil.getBaslik());
            System.out.println("İlan Açıklaması: " + otomobil.getAciklama());
            System.out.println("İlan Fiyat: " + otomobil.getFiyat());
        }
    }
    public void ListMotosiklet(){
        for(Otomobil otomobil: otomobiller)
        {
            System.out.println("\n\n\nİlan ID: "+otomobil.getIlanID());
            System.out.println("İlan Başlık: "+otomobil.getBaslik());
            System.out.println("İlan Açıklaması: " + otomobil.getAciklama());
            System.out.println("İlan Fiyat: " + otomobil.getFiyat());
        }
    }
}
