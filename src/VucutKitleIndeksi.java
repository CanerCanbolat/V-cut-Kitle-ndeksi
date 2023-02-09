import  java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int  kilo ;
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        double boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz : ");
        kilo = input.nextInt();
        double vik = kilo /(boy*boy);
        System.out.print("Kilonuz : "+ kilo +"kg" +"\nBoyunuz : " + boy + "metre" + "\n Vücut Kitle İndeksiniz : " + vik  );
    }
}
