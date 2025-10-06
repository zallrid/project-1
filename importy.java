import java.util.Scanner;
public class importy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(7);
        System.out.println("Hello World");
        int hargaBarang = 10000;
        System.out.println("Harga barang: " + hargaBarang);
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();
        int totalHarga = hargaBarang * jumlahBarang;
        System.out.println("Total harga: " + totalHarga);
        scanner.close();

    }
}
