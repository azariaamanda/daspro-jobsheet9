import java.util.Scanner;
public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc2.nextInt();

        int[] nilaiMhs = new int[jmlMhs]; 
        double total = 0;
        double rata2Lulus, rata2TdkLulus, totalMhsLulus=0, totalMhsTdkLulus=0;
        int lulus=0, tidakLulus=0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc2.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                totalMhsLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalMhsTdkLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }
        rata2Lulus = totalMhsLulus/lulus;
        rata2TdkLulus = totalMhsTdkLulus/tidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
    }
}
