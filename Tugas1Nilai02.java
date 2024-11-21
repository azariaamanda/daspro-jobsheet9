import java.util.Scanner;
public class Tugas1Nilai02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai mahasiswa yang akan diinput: ");
        int banyakNilai = sc2.nextInt();

        int[] nilaiMhs = new int[banyakNilai];
        int totalNilai = 0, tertinggi = 0, terendah = 100;
        double rataNilai=0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + ": ");
            nilaiMhs[i] = sc2.nextInt();
            if (nilaiMhs[i] > tertinggi){
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah){ 
                terendah = nilaiMhs[i];
            }
            totalNilai += nilaiMhs[i];
        }

        System.out.println("----------------------------------");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke- " + (i+1) + ": " + nilaiMhs[i]);
        }
        rataNilai= totalNilai/banyakNilai;
        System.out.println("Nilai rata-rata mahasiswa: " + rataNilai);
        System.out.println("Nilai tertinggi mahasiswa: " + tertinggi);
        System.out.println("Nilai terendah mahasiswa: " + terendah);
    }
}
