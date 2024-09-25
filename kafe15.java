import java.util.Scanner;

public class kafe15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        System.out.println("Pilih minuman yang ingin kamu beli:");
        System.out.println("1. Ekspresso  - Rp 10.000");
        System.out.println("2. Americano - Rp 14.000");
        System.out.println("3. Kopi Susu Gula Aren      - Rp 16.000");
        System.out.println("4. Mochaccino    - Rp 18.000");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihanBarang = util.nextInt();

        System.out.print("Masukkan total pembelian: ");
        double totalPembelian = util.nextDouble();

        System.out.print("Apakah Anda member? ");
        String isMember = util.next();

        double hargaBarang = 0;        

        switch (pilihanBarang) {
            case 1:
                hargaBarang = 10000;
                System.out.println("Anda memilih Ekspresso.");
                break;
            case 2:
                hargaBarang = 14000;
                System.out.println("Anda memilih Americano.");
                break;
            case 3:
                hargaBarang = 16000;
                System.out.println("Anda memilih Kopi Susu Gula Aren.");
                break;
            case 4:
                hargaBarang = 18000;
                System.out.println("Anda memilih Mochaccino.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        totalPembelian += hargaBarang;

        double diskon = 0.10;
        double totsetetlahdiskon;

        if (isMember.equals("ya")) {
            totsetetlahdiskon = totalPembelian - (totalPembelian * diskon);
            System.out.println("Diskon diberikan sebesar 10%");
        } else {
            totsetetlahdiskon = totalPembelian;
            System.out.println("Tidak ada diskon karena bukan member.");
        }

        util.close();

        System.out.println("total setelah diskon: " +  totsetetlahdiskon);
}
}
