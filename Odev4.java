import java.util.Arrays;
import java.util.Scanner;
public class Odev4 {
    public static void main(String[] args) {
        System.out.println("1 = Ana menü \n2 = Arama \n3 = Profil");
        Scanner scanner = new Scanner(System.in);
        int secilenSayfa = scanner.nextInt();
        scanner.close();

        Kategori meyveSebze = new Kategori(" Meyve & Sebze ");
        Kategori atistirmalik = new Kategori(" Atıştırmalık");
        Kategori kahvaltilik = new Kategori(" Kahvaltılık ");

        String[] kategoriler = { meyveSebze.kategoriAdi, atistirmalik.kategoriAdi, kahvaltilik.kategoriAdi};

        switch(secilenSayfa){

            case 1:
                for (int i=0; i<kategoriler.length; i++) {
                    System.out.println( i+1 + " = " + kategoriler[i] );

                }
                break;
        }
    }
}