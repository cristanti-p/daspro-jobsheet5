import java.util.Scanner;
/**
 * pemilihanoperator15
 */
public class pemilihanoperator15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        
        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("masukkan angka 1: ");
        angka1 = util.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = util.nextDouble();
        System.out.print("Masukkan operator (+ - * :)");
        operator = util.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("hasil: " + hasil);
        } else if (operator == '-') {
            hasil = angka1 + angka2;
            System.out.println("hasil: " + hasil);
        } else if (operator == '*') {
            hasil = angka1 + angka2;
            System.out.println("hasil: " + hasil);
        } else if (operator == '/') {
            hasil = angka1 + angka2;
            System.out.println("hasil: " + hasil);
        } else {
            
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
    }
}    


