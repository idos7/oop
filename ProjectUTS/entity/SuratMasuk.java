package entity;

public class SuratMasuk {
    
    private String nomor;
    private String tanggal;
    private String pengirim;
    private String perihal;
    private String lampiran;
    private String keterangan;

    public SuratMasuk(String nomor, String tanggal, String pengirim, String perihal, String lampiran, String keterangan) {
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.pengirim = pengirim;
        this.perihal = perihal;
        this.lampiran = lampiran;
        this.keterangan = keterangan;
    }

    public boolean equals(Object object) {
        SuratMasuk surmas = (SuratMasuk) object;
        return nomor.equals(surmas.getNomor());
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPengirim() {
        return pengirim;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    public String getPerihal() {
        return perihal;
    }

    public void setPerihal(String perihal) {
        this.perihal = perihal;
    }

    public String getLampiran() {
        return lampiran;
    }

    public void setLampiran(String lampiran) {
        this.lampiran = lampiran;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

}