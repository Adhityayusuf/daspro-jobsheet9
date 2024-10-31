import java.util.Scanner;   
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, tertinggi = 0, terendah = 100;
        double rata;
        
        System.out.println("      ====== INPUT NILAI MAHASISWA ======");
        System.out.print("Jumlah Nilai Mahasiswa yang akan diinput : ");
        int mahasiswa = sc.nextInt();

        int [] nilai = new int[mahasiswa];
        for (int i = 0; i < mahasiswa; i++) {
            System.out.print("Masukkan Nilai ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
            if (nilai [i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println();
        System.out.println("====== HASIL PENGINPUTAN NILAI MAHASISWA ======");
        for (int i = 0; i < mahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }
        rata = total / mahasiswa;
        System.out.println("Rata-rata Nilai Mahasiswa: " + rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("              ====== SELESAI ======");
    }
}