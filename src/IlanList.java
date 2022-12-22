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
            if (ilan.getUserID()==registerId)
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
            System.out.println("****** OTOMOBİL İLANLARI ******");
            System.out.println("\n\n\nİlan ID: "+otomobil.getIlanID());
            System.out.println("İlan Başlık: "+otomobil.getBaslik());
            System.out.println("İlan Açıklaması: " + otomobil.getAciklama());
            System.out.println("İlan Fiyat: " + otomobil.getFiyat());
        }
    }
    public void ListMotosiklet(){
        for(Motosiklet motosiklet:motosikletler)
        {
            System.out.println("****** MOTOSİKLET İLANLARI ******");
            System.out.println("\n\n\nİlan ID: "+ motosiklet.getIlanID());
            System.out.println("İlan Başlık: "+ motosiklet.getBaslik());
            System.out.println("İlan Açıklaması: " + motosiklet.getAciklama());
            System.out.println("İlan Fiyat: " + motosiklet.getFiyat());
        }
    }
    public void ListDaire(){
        for(Daire daire:daireler)
        {
            System.out.println("****** DAİRE İLANLARI ******");
            System.out.println("\n\n\nİlan ID: "+ daire.getIlanID());
            System.out.println("İlan Başlık: "+ daire.getBaslik());
            System.out.println("İlan Açıklaması: " + daire.getAciklama());
            System.out.println("İlan Fiyat: " + daire.getFiyat());
        }
    }
    public void ListArsa(){
        for(Arsa arsa:arsalar)
        {
            System.out.println("****** ARSA İLANLARI ******");
            System.out.println("\n\n\nİlan ID: "+ arsa.getIlanID());
            System.out.println("İlan Başlık: "+ arsa.getBaslik());
            System.out.println("İlan Açıklaması: " + arsa.getAciklama());
            System.out.println("İlan Fiyat: " + arsa.getFiyat());
        }
    }
}
