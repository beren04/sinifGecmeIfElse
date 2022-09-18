package first;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        int mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        int fiz = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        int turk = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        int kim = input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        int music = input.nextInt();

        if ((mat + fiz + turk + kim + music) / 5 >= 55 && mat + fiz + turk + kim + music > 500 && mat + fiz + turk + kim + music < 0) {
            System.out.println("Sınıfı Geçtiniz!!!!");
        } else if ((mat + fiz + turk + kim + music) / 5 < 55) {
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Geçerli not giriniz");
        }
    }
}
