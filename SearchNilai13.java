import java.util.Scanner;
public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, key, hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan di input : ");
        nilai = sc.nextInt();

        int [] arrNilai = new int[nilai];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i] ) {
                hasil = i;
            }
        }
        if (key == arrNilai[hasil] ) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("\nNilai yang di cari tidak di temukan!");
        }
    }
}
