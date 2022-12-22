public class IlanDelete extends Main {
    public void deleteIlan(){
        System.out.println("\nSileceğiniz ilanınızın id'sini giriniz..");
        boolean kontrol = true;

        while (kontrol)
        {
            try
            {
                int secim = scanner.nextInt();


                kontrol=false;
            }
            catch (Exception e)
            {
                System.out.println("Bir Hata Oluştu...");
                System.out.println("Lütfen Tekrar Deneyiniz...");
                System.out.println("\nSileceğiniz ilanınızın id'sini giriniz..");
            }
        }
        for (Ilan ilan:ilanlar)
        {
            if(ilan.getIlanID()==secim && ilan.getUserID()==registerId)
            {
                ilanlar.remove(secim-1);
            }
            else
                System.out.println("Seçtiğiniz Id'ye Ait Bir İlanınız Bulunmamaktadır.");
        }


    }
}
