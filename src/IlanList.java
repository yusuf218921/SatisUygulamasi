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
}
