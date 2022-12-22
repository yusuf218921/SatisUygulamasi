public class Emlak extends Ilan{

    int mkare;
    boolean kredi;

    public void setMkare(int mkare) { this.mkare = mkare; }
    public void setKredi(boolean kredi) { this.kredi = kredi; }

    public int getMkare(){return mkare;}
    public boolean getKredi(){ return kredi; }


    public Emlak(){ setKategoriID(2); }
}
