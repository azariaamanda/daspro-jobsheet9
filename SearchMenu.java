import java.util.Scanner;

public class SearchMenu {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.println("====Daftar Menu====");
        for (int i = 0; i < menu.length; i++){
            System.out.println((i+1) + ". " + menu[i]);
        }

        System.out.print("Masukkan makanan/minuman yang ingin anda cari: ");
        String menuCari = sc2.nextLine();

        int makanan = -1;
        for (int i = 0; i < menu.length; i++){
            if (menuCari.equalsIgnoreCase(menu[i])){
                makanan = i;
                break;
            }
        }

        if (makanan != -1) {
            System.out.println("Makanan/minuman '" + menuCari + "' ditemukan dalam indeks ke-" + (makanan+1) + " pada menu.");
        } else {
            System.out.println("Makanan/minuman '" + menuCari + "' tidak ditemukan di menu.");
        }
        
    }
}