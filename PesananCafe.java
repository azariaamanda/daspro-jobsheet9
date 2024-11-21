import java.util.Scanner;
public class PesananCafe {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int pesanan = sc2.nextInt();
        sc2.nextLine();

        String[] namaPesanan = new String[pesanan];
        double[] hargaPesanan = new double[pesanan];
        double totalBiaya = 0;

        for (int i = 0; i < namaPesanan.length; i++){
            System.out.println("Pesanan ke-" + (i+1));
            System.out.print("Masukkan makanan/minuman yang anda pesan: ");
            namaPesanan[i] = sc2.nextLine();
        }
        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.print("Masukkan harga makanan/minuman pesanan ke-" + (i+1) + ": Rp ");
            hargaPesanan[i] = sc2.nextDouble();
        }
        for (int i = 0; i < namaPesanan.length; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("------------Daftar Pesanan------------");
        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.println("Pesanan ke-" + (i+1) + ": " + namaPesanan[i] + " Rp " + hargaPesanan[i]);
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Biaya: " + " Rp " + totalBiaya);
    }
}
