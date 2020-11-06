
package surprise;

import java.util.Scanner;

/**
 *
 * @author bhasa
 */
public class Surprise {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String nama, domisili, kelas, ttl, jawaban, nama1, domisili1, kelas1, ttl1, nisn1;
        int nisn, jawaban1 = 0045150207;
        nama1 = "Bashar Lentera Jihad Khawariq";
        domisili1 ="Blitar";
        kelas1 ="XRPL-8";
        ttl1 ="Malang,18-11-2004";
        nisn1 = "0045150207";
        
        System.out.println("<<< Selamat Datang >>>");
        System.out.println("----------------------");
        System.out.println("<<< Program Kartu Pelajar SMK Telkom Malang >>>");
        System.out.println("<<< Apakah anda sudah terdata ? >>>");
        System.out.println("Jawab Ya / Tidak");
        System.out.print("Jawaban : ");
        jawaban = keyboard.nextLine();
        
        if (jawaban.equalsIgnoreCase("Ya")) {
        System.out.println("<<<Silahkan Masukkan NISN Anda>>>");
        System.out.print("NISN : ");
        jawaban1 = keyboard.nextInt();
        
            if (jawaban1 == 0045150207) {
        System.out.println("--------------------");
        System.out.println("<<< Kartu Pelajar >>>");
        System.out.println("<<< SMK Telkom Malang >>>");
        System.out.println("NISN : "+nisn1);
        
        System.out.println("Nama : "+nama1);
        
        System.out.println("Domisili : "+domisili1);
        
        System.out.println("TTL : "+ttl1);
        
        System.out.println("Kelas : "+kelas1);
        
            } else if (jawaban1 != 0045150207);{
        System.out.println("NISN Tidak Terdaftar");
            }

        } else {
        if (jawaban.equalsIgnoreCase("Tidak")) {
        System.out.println("<<<Silahkan Daftarkan Diri Anda>>>");
        
        System.out.print("nama : ");
        nama = keyboard.nextLine();
        
        System.out.print("domisili : ");
        domisili = keyboard.nextLine();
        
        System.out.print("NISN : ");
        nisn = keyboard.nextInt();
        
        System.out.print("TTL : ");
        ttl = keyboard.next();
        
        System.out.print("Kelas : ");
        kelas = keyboard.nextLine();
        
        System.out.println("--------------------");
        System.out.println("<<< Kartu Pelajar >>>");
        System.out.println("<<< SMK Telkom Malang >>>");
        System.out.println("NISN : "+nisn);
        
        System.out.println("Nama : "+nama);
        
        System.out.println("Domisili : "+domisili);
        
        System.out.println("TTL : "+ttl);
        
        System.out.println("Kelas : "+kelas);
        }}
    }  
}