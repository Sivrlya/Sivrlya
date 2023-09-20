import java.util.Scanner;

public class BeliBarang {
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);

        int jumlahBarang = 0;
        int hargaBarang = 0;
        int total = 0;

        System.out.println("Masukkan Jumlah Item Yang Dibeli: ");
        int jumlah = input.nextInt();

        for(int i = 1;i<= jumlah; i++) {
            System.out.println("Masukkan Nama Barang: ");
            String namaBarang = input.next();

            System.out.println("Masukkan Harga Barang: ");
            hargaBarang = input.nextInt();

            System.out.println("Masukkan Jumlah Barang Yang Dibeli: ");
            jumlahBarang = input.nextInt();

            System.out.println("=========");
            total += hargaBarang * jumlahBarang;
        }
        System.out.println("Jumlah Barang Yang Dibeli "+ jumlah);
        
        System.out.println("Total Pembelian "+ total);
            
            

    }
    
}
