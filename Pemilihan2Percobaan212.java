import java.util.Scanner;
public class Pemilihan2Percobaan212 {

    public static void main(String[] args) {

    Scanner input12 = new Scanner (System.in);

    int pilihan_menu;
    double diskon, harga, totalBayar;
    String member, qris;

System.out.println("-------------------------");
System.out.println("===== MENU KAFE JTI =====");
System.out.println("-------------------------");
System.out.println("1. Ricebowl");
System.out.println("2. Ice Tea");
System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
System.out.println("-------------------------------------");
System.out.print("masukkan angka dari menu yang dipilih = ");
pilihan_menu = input12.nextInt();
input12.nextLine();
System.out.print("Apakah punya member (y/n) ? =");
member = input12.nextLine();
System.out.println("Apakah pembayaran menggunakan QRIS? (y/n) = ");
qris = input12.nextLine();
System. out.println("------------------------------------");


    

if (member.equals("y")) {
    diskon = 0.10;
    System.out.println("Besar diskon = 10%");
    if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
        
    } else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);
        
    } else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling = " + harga);
        
    }else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return;

    }
    
    totalBayar = harga - (harga*diskon);
    System.out.println("Total bayar setelah diskon = " + totalBayar);

    if (qris.equals("y")) {
        System.out.println("Total bayar = " + (totalBayar - 1000));
}
}else if (member.equals("n")) {
    if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);

    }else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);
        
    } else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling = " + harga);
        
    }else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return;
    }
        System.out.println("Total Harga = " + harga);
    if (qris.equals("y")) {
            System.out.println("Total Bayar = " + (harga - 1000));
        }
    
    }else {
        System.out.println("Member tidak valid");
       

    }
      

           
        }
        
}
