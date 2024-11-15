import java.util.Scanner;
public class SearchNilai02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc2.nextInt();

        int[] arrNilai = new int[banyakNilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc2.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc2.nextInt();

        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]){
                hasil = i;
                break;
            }
        }

        if (hasil>=0){
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
        } else {
            System.out.println("Nilai yang dicaritidak ditemukan.");
        }

        // awal percobaan sebelum dimodifikasi
        // int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        // int key = 90;
        // int hasil = 0;
        // for (int i = 0; i < arrNilai.length; i++) {
        //     if (key == arrNilai[i]){
        //         hasil = i;
        //         break;
        //     }
        // }
        // System.out.println();
        // System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        // System.out.println();
    }
}
