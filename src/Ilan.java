public class Ilan
{

    private int ilanID;
    private int kategoriID;

    private int userID;
    public String baslik;
    public String aciklama;
    public int fiyat;


    public int getIlanID(){ return ilanID; }
    public int getKategoriID() {return kategoriID; }
    public int getUserID() { return userID; }
    public String getBaslik() {return baslik; }
    public String getAciklama() {return aciklama; }
    public int getFiyat(){return fiyat; }

    public void setIlanID(int ilanID){ this.ilanID = ilanID; }
    public void setKategoriID(int kategoriID){ this.kategoriID = kategoriID; }
    public void setUserID(int userID){ this.userID = userID; }
    public void setBaslik(String baslik) {this.baslik = baslik;}
    public void setAciklama(String aciklama) {this.aciklama=aciklama;}
    public void setFiyat(int fiyat){ this.fiyat = fiyat; }



}
