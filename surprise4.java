
package surprise;

import java.util.Scanner;

/**
 *
 * @author bhasa
 */
public class surprise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama , nomor, kelas ;
        char grade ;
        double nilaitugas , nilaiuts , nilaikuis , nilaiuas , nilaiakhir;
        System.out.println("===== Menghitung Nilai Siswa=====");
        System.out.println("====SMK Telkom Malang====");
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.print("Masukan Nomor Absen : ");
        nomor = input.nextLine();
        System.out.print("Masukan Kelas : ");
        kelas = input.nextLine();
        System.out.print("Nilai tugas : ");
        nilaitugas = input.nextInt();
        System.out.print("Nilai kuis : ");
        nilaikuis = input.nextInt();
        System.out.print("Nilai uts : ");
        nilaiuts = input.nextInt();
        System.out.print("Nilai uas : ");
        nilaiuas = input.nextInt();
        nilaiakhir = (0.15 * nilaitugas + 0.20 * nilaikuis + 0.30 * nilaiuts + 0.35 * nilaiuas);
        if (nilaiakhir >= 85 && nilaiakhir <=100){
            grade = 'A';
        }
        else if (nilaiakhir > 75 && nilaiakhir < 85){
            grade = 'B';
        }
        else if (nilaiakhir > 65 && nilaiakhir < 75){
            grade = 'C';
        }
        else if (nilaiakhir > 50 && nilaiakhir < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("=================");
            System.out.println("Nama : "+nama);
            System.out.println("Nomor : "+nomor);
            System.out.println("Kelas : "+kelas);
            System.out.println("grade : "+grade);
            System.out.println("memiliki nilai akhir : "+nilaiakhir);
            System.out.println("...dinyatakan Lulus...");
            
        }
        else {
            System.out.println("=================");
            System.out.println("Nama : "+nama);
            System.out.println("Nomor : "+nomor);
            System.out.println("Kelas : "+kelas);
            System.out.println("grade : "+grade);
            System.out.println("memiliki nilai akhir : "+nilaiakhir);
            System.out.println("...dinyatakan Tidak Lulus...");
        }  
    }
}
