import java.util.ArrayList;

public class IlanQuery {

    private String baslik;
    private String aciklama;

    IlanQuery(){};

    IlanQuery(String baslik){ this.baslik = baslik; }

    IlanQuery(String baslik, String aciklama)
    {
        this.baslik = baslik;
        this.aciklama = aciklama;
    }

    public boolean createQuery(ArrayList<Ilan> ilanlar)
    {
        for (Ilan ilan : ilanlar)
        {
            if (ilan.getBaslik().length() < 8)
            {
                System.out.println("İlan Başlığı 8 Karakterden Az Olamaz!");
                return true;
            }
        }
        return false;
    }




}
