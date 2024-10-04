import java.util.Scanner;
public class tugasJobsheet612 {

    public static void main(String[] args) {
        
        Scanner input12 = new Scanner(System.in);

        String jenisBuku;
        double diskon, hargaAkhir;
        int jmlBuku, harga = 20000;

        System.out.println("Masukkan Jenis Buku : ");
        jenisBuku = input12.nextLine();
        System.out.println("Masukkan jumlah pembelian buku");
        jmlBuku = input12.nextInt();

    if (jenisBuku.equalsIgnoreCase("kamus") ) {
        diskon = 0.1 * harga;
        if (jmlBuku > 2) {
            diskon = 0.12 *harga;
            
        }else if (jmlBuku < 2) {
            diskon = 0.1 * harga;
           
        }
        hargaAkhir =  ((jmlBuku*harga) - (diskon*jmlBuku));
        System.out.println("harga akhir = " + hargaAkhir);
        
        
    }else if (jenisBuku.equalsIgnoreCase("novel")) {
        diskon = 0.07 * harga;
        if (jmlBuku > 3) {
            diskon = 0.09* harga;
            
        }else if (jmlBuku < 3) {
            diskon = 0.08 * harga;

        }
        hargaAkhir =  ((jmlBuku*harga) - (diskon*jmlBuku));
        System.out.println("harga akhir = " + hargaAkhir);
        
        
    }else {
        if (jmlBuku > 3) {
            diskon = 0.05 * harga;
            
        }else 
            diskon = 0;
            
        }
  
        hargaAkhir =  ((jmlBuku*harga) - (diskon*jmlBuku));
        System.out.println("harga akhir = " + hargaAkhir);
    }
    
}

