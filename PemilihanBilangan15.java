import java.util.Scanner;
/**
 * PemilihanBilangan15
 */
public class PemilihanBilangan15 {

    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka:  ");
        int angka = util.nextInt();
        String hasil;
        hasil = (angka % 2 == 0) ? "Termasuk bilangan genap" : "Termasuk bilangan negatif";
        System.out.println(angka + " adalah " + hasil);

        // if (angka % 2 == 0) 
        // {
        //     System.out.println("Angka " + angka + "termasuk bilangan genap");
        // }
        // else
        // {
        //     System.out.println("Angka " + angka + "termasuk bilangan ganjil");
        // }
        
    }
}