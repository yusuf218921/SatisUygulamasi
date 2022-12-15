import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static int secim = -1;
    static int loginId;
    static int registerId = 0;

    static Menu menu;

    public static void main(String[] args) throws InterruptedException {
        MainMenu deneme = new MainMenu();
        deneme.Menu();

    }
}