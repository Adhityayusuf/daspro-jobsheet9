import java.util.Scanner;
public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mhsLulus = 0, mhsTidakLulus = 0, nilaiLulus = 0, nilaiTdkLulus = 0, mahasiswa;
        double rataLulus, rataTdkLulus;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        mahasiswa = sc.nextInt();

        int [] nilaiMhs = new int [mahasiswa];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                nilaiLulus += nilaiMhs[i];
            } else {
                mhsTidakLulus++;
                nilaiTdkLulus += nilaiMhs[i];
            }
        }
        rataLulus = nilaiLulus / mhsLulus;
        rataTdkLulus = nilaiTdkLulus / mhsTidakLulus;
        System.out.println("Rata - rata nilai lulus : " + rataLulus);
        System.out.println("Rata - rata nilai tidak lulus : " + rataTdkLulus);
    }
}
