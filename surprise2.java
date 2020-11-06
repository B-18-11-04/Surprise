
package surprise;

import java.util.Scanner;

/**
 *
 * @author bhasa
 */
public class surprise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] tujuan = {"1.Malang", "2.Blitar", "3.Kediri", "4.Tulungagung"};
        String jawaban, jawaban2;
        int harga1, harga2, harga3, harga4, harga5, harga6, jumlah, totalharga = 0, totalpembayaran = 0, kembalian;
        
        harga1 = 15000;
        harga2 = 20000;
        harga3 = 13000;
        harga4 = 16000;
        harga5 = 14000;
        harga6 = 17000;
        
        System.out.println("---Selamat Datang Di PT KAI Indonesia---");
        System.out.println("--Silahkan Tentukan Tujuan Anda--");
        System.out.println("-Daftar Tujuan-");
        
        for (int a = 0; a < tujuan.length; a++)
        System.out.println(tujuan[a]);
        System.out.println("<<< isikan nama tujuan >>>");
        System.out.print("Tujuan Yang Dipilih : ");
        jawaban = keyboard.nextLine();
        
        if (jawaban.equalsIgnoreCase("Malang")){
        System.out.println("Jenis Kelas Kereta :");
        System.out.println("Eksekutif : Rp."+harga2);
        System.out.println("Ekonomi : Rp."+harga1);
        System.out.println("---------------------------");
        System.out.println("<<< isikan jenis kelas >>>");
        System.out.print("Jenis Kelas Yang Dipilih : ");
        jawaban2 = keyboard.nextLine();
            if (jawaban2.equalsIgnoreCase("Eksekutif")){
        System.out.print("Jumlah tiket : ");
        jumlah = keyboard.nextInt();
        System.out.println("---------------------------");
        totalharga = harga2*jumlah;
        System.out.println("Total Harga : Rp."+totalharga);
        System.out.print("Nominal Pembayaran : Rp.");
        totalpembayaran = keyboard.nextInt();
                if (totalpembayaran >= totalharga){
        kembalian = totalpembayaran-totalharga;
        System.out.println("Kembalian : "+kembalian);
        System.out.println("---------------------------");
        System.out.println("--Terimakasih--");
        System.out.println("---Selamat Menikmati Perjalanan Anda---");
                }else if (totalpembayaran < totalharga){
        System.out.println("...Maaf Nominal Yang Anda Masukkan Tidak Cukup...");
        System.out.println("Nominal anda kurang : Rp."+ (totalharga-totalpembayaran));
        }
            }else if(jawaban2.equalsIgnoreCase("Ekonomi")){
        System.out.print("Jumlah tiket : ");
        jumlah = keyboard.nextInt();
        System.out.println("---------------------------");
        totalharga = harga1*jumlah;
        System.out.println("Total Harga : Rp."+totalharga);
        System.out.print("Nominal Pembayaran : Rp.");
        totalpembayaran = keyboard.nextInt();
                if (totalpembayaran >= totalharga){
        kembalian = totalpembayaran-totalharga;
        System.out.println("Kembalian : "+kembalian);
        System.out.println("---------------------------");
        System.out.println("--Terimakasih--");
        System.out.println("---Selamat Menikmati Perjalanan Anda---");
                }else if (totalpembayaran < totalharga){
            System.out.println("...Maaf Nominal Yang Anda Masukkan Tidak Cukup...");
            System.out.println("Nominal anda kurang : Rp."+ (totalharga-totalpembayaran));
        }
            }else{
             System.out.println("...Pilihan Anda Tidak Tersedia...");
        }
        }else if (jawaban.equalsIgnoreCase("Blitar")){
        System.out.println("Jenis Kelas Kereta :");
        System.out.println("Eksekutif : Rp."+harga4);
        System.out.println("Ekonomi : Rp."+harga3);
        System.out.println("---------------------------");
        System.out.println("<<< isikan jenis kelas >>>");
        System.out.print("Jenis Kelas Yang Dipilih : ");
        jawaban2 = keyboard.nextLine();
         if (jawaban2.equalsIgnoreCase("Eksekutif")){
        System.out.print("Jumlah tiket : ");
        jumlah = keyboard.nextInt();
        System.out.println("---------------------------");
        totalharga = harga4*jumlah;
        System.out.println("Total Harga : Rp."+totalharga);
        System.out.print("Nominal Pembayaran : Rp.");
        totalpembayaran = keyboard.nextInt();
        if (totalpembayaran >= totalharga){
        kembalian = totalpembayaran-totalharga;
        System.out.println("Kembalian : "+kembalian);
        System.out.println("---------------------------");
        System.out.println("--Terimakasih--");
        System.out.println("---Selamat Menikmati Perjalanan Anda---");
        }else if (totalpembayaran < totalharga){
        System.out.println("...Maaf Nominal Yang Anda Masukkan Tidak Cukup...");
        System.out.println("Nominal anda kurang : Rp."+ (totalharga-totalpembayaran));
        }
        }else if(jawaban2.equalsIgnoreCase("Ekonomi")){
        System.out.print("Jumlah tiket : ");
        jumlah = keyboard.nextInt();
        System.out.println("---------------------------");
        totalharga = harga3*jumlah;
        System.out.println("Total Harga : Rp."+totalharga);
        System.out.print("Nominal Pembayaran : Rp.");
        totalpembayaran = keyboard.nextInt();
        if (totalpembayaran >= totalharga){
        kembalian = totalpembayaran-totalharga;
        System.out.println("Kembalian : "+kembalian);
        System.out.println("---------------------------");
        System.out.println("--Terimakasih--");
        System.out.println("---Selamat Menikmati Perjalanan Anda---");
        }else if (totalpembayaran < totalharga){
            System.out.println("...Maaf Nominal Yang Anda Masukkan Tidak Cukup...");
            System.out.println("Nominal anda kurang : Rp."+ (totalharga-totalpembayaran));
        }
         }else{
             System.out.println("...Pilihan Anda Tidak Tersedia...");
        }
        }else if (jawaban.equalsIgnoreCase("Kediri")){
        System.out.println("Jenis Kelas Kereta :");
        System.out.println("Ekonomi : Rp."+harga5);
        System.out.println("---------------------------");
        System.out.println("<<< isikan jenis kelas >>>");
        System.out.print("Jenis Kelas Yang Dipilih : ");
        jawaban2 = keyboard.nextLine();
        if (jawaban2.equalsIgnoreCase("Ekonomi")){
        System.out.print("Jumlah tiket : ");
        jumlah = keyboard.nextInt();
        System.out.println("---------------------------");
        totalharga = harga5*jumlah;
        System.out.println("Total Harga : Rp."+totalharga);
        System.out.print("Nominal Pembayaran : Rp.");
        totalpembayaran = keyboard.nextInt();
        if (totalpembayaran >= totalharga){
        kembalian = totalpembayaran-totalharga;
        System.out.println("Kembalian : "+kembalian);
        System.out.println("---------------------------");
        System.out.println("--Terimakasih--");
        System.out.println("---Selamat Menikmati Perjalanan Anda---");
        }else if (totalpembayaran < totalharga){
        System.out.println("...Maaf Nominal Yang Anda Masukkan Tidak Cukup...");
        System.out.println("Nominal anda kurang : Rp."+ (totalharga-totalpembayaran));
        }
        }else{
        System.out.println("...Pilihan Anda Tidak Tersedia...");
         }
        }else if (jawaban.equalsIgnoreCase("Tulungagung")){
        System.out.println("Jenis Kelas Kereta :");
        System.out.println("Ekonomi : Rp."+harga6);
        System.out.println("---------------------------");
        System.out.println("<<< isikan jenis kelas >>>");
        System.out.print("Jenis Kelas Yang Dipilih : ");
        jawaban2 = keyboard.nextLine();
        if (jawaban2.equalsIgnoreCase("Ekonomi")){
        System.out.print("Jumlah tiket : ");
        jumlah = keyboard.nextInt();
        System.out.println("---------------------------");
        totalharga = harga6*jumlah;
        System.out.println("Total Harga : Rp."+totalharga);
        System.out.print("Nominal Pembayaran : Rp.");
        totalpembayaran = keyboard.nextInt();
        if (totalpembayaran >= totalharga){
        kembalian = totalpembayaran-totalharga;
        System.out.println("Kembalian : "+kembalian);
        System.out.println("---------------------------");
        System.out.println("--Terimakasih--");
        System.out.println("---Selamat Menikmati Perjalanan Anda---");
        }else if (totalpembayaran < totalharga){
        System.out.println("...Maaf Nominal Yang Anda Masukkan Tidak Cukup...");
        System.out.println("Nominal anda kurang : Rp."+ (totalharga-totalpembayaran));
        }
         }else{
         System.out.println("...Pilihan Anda Tidak Tersedia...");
        }
        }else{
        System.out.println("...Tujuan Tidak Tersedia...");
        }
    }    
}
