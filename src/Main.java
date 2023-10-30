import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ürünler ve fiyatları
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcıdan alınan kilogram miktarları
        System.out.print("Armut Kaç Kilo? : ");
        double kiloArmut = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double kiloElma = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double kiloDomates = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double kiloMuz = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double kiloPatlican = scanner.nextDouble();

        // Toplam tutarın hesaplanması
        double toplamTutar = (armutFiyat * kiloArmut) + (elmaFiyat * kiloElma) +
                (domatesFiyat * kiloDomates) + (muzFiyat * kiloMuz) +
                (patlicanFiyat * kiloPatlican);

        System.out.println("Toplam Tutar: " + String.format("%.2f", toplamTutar) + " TL");

    }
}