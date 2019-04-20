import services.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static SuratMasukService service;
    private static Scanner scanner;
    
    public static void main(String[] args) {
        service = new SuratMasukService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            showMenu();
            opsi = scanner.nextInt();
            seleksi(opsi);
        } while(opsi !=5);
    }

    private static void seleksi(int opsi) {
        switch(opsi) {
            case 1:
                callFormTambahData();
                break;
            case 2:
                callFormUbahData();
                break;
            case 3:
                callFormHapusData();
                break;
            case 4:
                service.showData();
                break;
        }
    }

    private static void callFormHapusData() {
        scanner = new Scanner(System.in);

        System.out.print("NOMOR : ");
        String nomor = scanner.nextLine();
        service.hapusData(nomor);
    }

    private static void callFormUbahData() {
        scanner = new Scanner(System.in);
        String nomor, tanggal, pengirim, perihal, lampiran, keterangan;

        System.out.println("\n-= Form Ubah Data =-");
        System.out.print("NOMOR : ");
        nomor = scanner.nextLine();
        System.out.print("TANGGAL : ");
        tanggal = scanner.nextLine();
        System.out.print("PENGIRIM : ");
        pengirim = scanner.nextLine();
        System.out.print("PERIHAL : ");
        perihal = scanner.nextLine();
        System.out.print("LAMPIRAN : ");
        lampiran = scanner.nextLine();
        System.out.print("KETERANGAN : ");
        keterangan = scanner.nextLine();
        service.ubahData(new SuratMasuk(nomor, tanggal, pengirim, perihal, lampiran, keterangan));
    }

    private static void callFormTambahData() {
        scanner = new Scanner(System.in);
        String nomor, tanggal, pengirim, perihal, lampiran, keterangan;

        System.out.println("\n-= Form Tambah Data =-");
        System.out.print("NOMOR : ");
        nomor = scanner.nextLine();
        System.out.print("TANGGAL : ");
        tanggal = scanner.nextLine();
        System.out.print("PENGIRIM : ");
        pengirim = scanner.nextLine();
        System.out.print("PERIHAL : ");
        perihal = scanner.nextLine();
        System.out.print("LAMPIRAN : ");
        lampiran = scanner.nextLine();
        System.out.print("KETERANGAN : ");
        keterangan = scanner.nextLine();
        service.tambahData(new SuratMasuk(nomor, tanggal, pengirim, perihal, lampiran, keterangan));
    }

    private static void showMenu() {
        System.out.println("\n--== Aplikasi Surat Masuk ==--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. Keluar");
        System.out.println("----------------------");
        System.out.print("Pilihan > ");
    }
}