import java.util.Scanner;

public class NotOrt {

        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("Lütfen Matematik Notunuzu Giriniz:");
            double mat= scan.nextDouble();
            System.out.println("Lütfen Fizik Notunuzu Giriniz:");
            double fizik= scan.nextDouble();
            System.out.println("Lütfen Kimya Notunuzu Giriniz:");
            double kimya= scan.nextDouble();
            System.out.println("Lütfen Türkçe Notunuzu Giriniz:");
            double turkce= scan.nextDouble();
            System.out.println("Lütfen Tarih Notunuzu Giriniz:");
            double tarih= scan.nextDouble();
            System.out.println("Lütfen Müzik Notunuzu Giriniz:");
            double muzik= scan.nextDouble();
            double notOrtslaması= (mat+fizik+kimya+turkce+tarih+muzik)/6;
            System.out.println(notOrtslaması >60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");

        }

}
