public class Vasita extends Ilan{

    private String marka;
    private String model;
    private String vitesTipi;
    private String renk;
    private int uretimYili;

    public Vasita()
    {
        setKategoriID(1);
    }


    public String getMarka(){ return marka; }
    public String getModel(){ return model; }
    public String getVitesTipi(){ return vitesTipi; }
    public String getRenk(){ return renk; }
    public int getUretimYili(){ return uretimYili;}

    public void setMarka(String marka){ this.marka = marka; }
    public void setModel(String model){ this.model = model; }
    public void setVitesTipi(String vitesTipi){ this.vitesTipi = vitesTipi; }
    public void setRenk(String renk){ this.renk = renk; }
    public void setUretimYili(int uretimYili){ this.uretimYili = uretimYili;}




}
