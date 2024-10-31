import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlPesan, total = 0;

        System.out.print("Masukkan Jumlah pesanan     : ");
        jmlPesan = sc.nextInt();
        sc.nextLine();

        String [] makan = new String [jmlPesan];
        int [] harga = new int [jmlPesan];
        for (int i = 0; i < jmlPesan; i++) {
            System.out.print("Nama Makanan / Minuman ke-" + (i + 1) + " : ");
            makan[i] = sc.nextLine();
            System.out.print("Masukkan Harga              : ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            total += harga[i];
        }
        System.out.println();
        for (int i = 0; i < jmlPesan; i++) {
            System.out.println("Pesanan ke-" + (i+1) + "  : " + makan[i]);
            System.out.println("Harga Pesanan : " + harga[i]);
        }
        System.out.println("Total pembayaran : " + total);
    }
}
