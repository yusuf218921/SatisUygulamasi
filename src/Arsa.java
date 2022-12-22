public class Arsa extends Emlak{
    double mKareFiyat;
    String imarDurum;

    public void setmKareFiyat(int mkare,int fiyat) { this.mKareFiyat = fiyat/mkare; }
    public void setImarDurum(String imarDurum){ this.imarDurum=imarDurum; }

    public double getmKareFiyat() { return mKareFiyat; }
    public String getImarDurum() { return  imarDurum; }

}
