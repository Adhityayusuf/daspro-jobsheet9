import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlPesan, total = 0, jmlHarga, uang;

        System.out.println("==== INPUTAN PEMBELIAN ====");
        System.out.print("\nMasukkan Jumlah pesanan     : ");
        jmlPesan = sc.nextInt();
        sc.nextLine();
        System.out.println();

        String [] makan = new String [jmlPesan];
        int [] harga = new int [jmlPesan];
        int [] Jumlah = new int [jmlPesan];
        for (int i = 0; i < jmlPesan; i++) {
            System.out.print("Nama Makanan / Minuman ke-" + (i + 1) + " : ");
            makan[i] = sc.nextLine();
            System.out.print("Masukkan Jumnlah barang     : ");
            Jumlah[i] = sc.nextInt();
            System.out.print("Masukkan Harga satuan       : ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            jmlHarga = harga[i] * Jumlah[i];
            total += jmlHarga;
        }
        System.out.println("\n==== INPUTAN SELESAI ====");
        System.out.println("\n==== HASIL INPUTAN ====");
        System.out.println();
        for (int i = 0; i < jmlPesan; i++) {
            System.out.println("Pesanan ke-" + (i+1) + "     : " + makan[i]);
            System.out.println("Harga Pesanan    : " + harga[i] + " x " + Jumlah[i] + " adalah = " + (harga[i] * Jumlah[i]));
        }
        System.out.println("Total pembayaran : " + total);
        System.out.print("Jumlah uang      : ");
        uang = sc.nextInt();
        System.out.println("Kembalian        : " + (uang - total));
        System.out.println("\n   ==== SELESAI ====");
    }
}
