
import java.util.ArrayList;
import java.util.Scanner;

public class Static {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    static ArrayList<Ilan> ilanlar = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();

    static ArrayList<Otomobil> otomobiller = new ArrayList<>();
    static ArrayList<Motosiklet> motosikletler = new ArrayList<>();

    static int secim = -1;
    static int loginId;
    static int ilanKayitId=0;
    static int registerId = 0;
    static boolean loop = true;
    static boolean UserLogin = false;
    static Menu menu;

    static String [] MainKategori = {"Emlak", "Vasıta"};
    static String [] VasitaKategori = {"Otomobil", "Motosiklet"};
    static String [] EmlakKategori = {"Daire","Arsa"};
}
