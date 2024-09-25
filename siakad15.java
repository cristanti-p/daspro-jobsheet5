import java.util.Scanner;

public class siakad15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nama,nim;
        char kelas;
        byte absen;
        double nilaikuis,nilaitugas,nilaiujian,nilaiakhir;
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();


        System.out.print("Masukkan nilai kuis: ");
        nilaikuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaitugas = sc.nextDouble();
        System.out.print("masukkan nilai ujian: ");
        nilaiujian = sc.nextDouble();
        

        nilaiakhir = (nilaikuis+nilaitugas+nilaiujian)/3;
        System.out.print("Nama:"+nama+"NIM:"+nim);
        System.out.print("Kelas:"+kelas+"Absen:"+absen);
        System.out.print("Nilai akhir"+nilaiakhir);


        // if (80 < nilaihuruf <= 100){

        }
        // int nilaihuruf;
        // switch (nilaihuruf>35){
        //     case  :
                
        //         break;
        
        //     default:
        //         break;
        }