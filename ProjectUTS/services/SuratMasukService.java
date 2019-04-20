package services;

import java.util.*;
import entity.*;

public class SuratMasukService {

    private static List<SuratMasuk> data = new LinkedList<SuratMasuk>();

    public void tambahData(SuratMasuk surmas) {
        data.add(surmas);
        System.out.println("Data Telah Tersimapn");
    }

    public void ubahData(SuratMasuk surmas) {
        int idx = data.indexOf(surmas);
        if(idx >= 0) {
            data.set(idx,surmas);
            System.out.println("Data Berhasil Diubah");
        }
    }

    public void hapusData(String nomor) {
        int idx = data.indexOf(new SuratMasuk(nomor, "", "", "", "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("Data Berhasil Dihapus");
        }
    }

    public void showData() {
        System.out.println("\n--= Data Surat Masuk =--");
        int urutan = 1;
        for (SuratMasuk surmas : data) {
            System.out.println("Data ke-" + urutan++);
            System.out.println(" NOMOR : " + surmas.getNomor());
            System.out.println(" TANGGAL : " + surmas.getTanggal());
            System.out.println(" PENGIRIM : " + surmas.getPengirim());
            System.out.println(" PERIHAL : " + surmas.getPerihal());
            System.out.println(" LAMPIRAN : " + surmas.getLampiran());
            System.out.println(" KETERANGAN : " + surmas.getKeterangan());
        }
    }
}