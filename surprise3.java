
package surprise;

import java.util.Scanner;

/**
 *
 * @author bhasa
 */
public class surprise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[] laptop = {"1.Asus", "2.Acer", "3.Hp", "4.Dell", "5.Macbook"};
        int[] hargabarang = {170000,150000,160000,140000,180000};
        int harga, jumlah, total, diskon, kembalian, bayar;
        
        System.out.println("---Selamat Datang Di Toko Kami---");
        System.out.println("--Silahkan pilih laptop yang diinginkan--");
        System.out.println("-Daftar Laptop-");
        for (int a = 0; a < laptop.length; a++)
        System.out.println(laptop[a]+" : "+hargabarang[a]);
        System.out.println("--------------------------");
        System.out.print("Masukkan Harga Barang : ");
        harga = input.nextInt();
        System.out.print("Masukkan Jumlah Barang : ");
        jumlah = input.nextInt();

        total = jumlah * harga;
        
        if (total >= 300000) {
            diskon = total *  15 / 100;
            total = total - diskon;
            System.out.println("Diskon = 15%");
            System.out.println("Total Yang Dibayar = Rp."+total);
            System.out.print("Nominal Yang Dibayarkan : Rp.");
            bayar = input.nextInt();
            kembalian = bayar-total;
            System.out.println("Kembalian : Rp."+kembalian);
            System.out.println("--Terimakasih Atas Kunjungan Anda--");
        }else if(total >= 200000) {
            diskon = total * 10 / 100;
            total = total - diskon;
            System.out.println("Diskon = 10%");
            System.out.println("Total Yang Dibayar = Rp."+total);
            System.out.print("Nominal Yang Dibayarkan : Rp.");
            bayar = input.nextInt();
            kembalian = bayar-total;
            System.out.println("Kembalian : Rp."+kembalian);
            System.out.println("--Terimakasih Atas Kunjungan Anda--");
        }else if(total >= 100000){
            diskon = total * 5 / 100;
            total = total - diskon;
            System.out.println("Diskon = 5%");
            System.out.println("Total Yang Dibayar = Rp."+total);
            System.out.print("Nominal Yang Dibayarkan : Rp.");
            bayar = input.nextInt();
            kembalian = bayar-total;
            System.out.println("Kembalian : Rp."+kembalian);
            System.out.println("--Terimakasih Atas Kunjungan Anda--");
        }
        else{
            System.out.println("Total Yang Dibayar = Rp."+total);
            System.out.print("Nominal Yang Dibayarkan : Rp.");
            bayar = input.nextInt();
            kembalian = bayar-total;
            System.out.println("Kembalian : Rp."+kembalian);
            System.out.println("--Terimakasih Atas Kunjungan Anda--");
        }
    }
}
