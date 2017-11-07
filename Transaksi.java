
public class Transaksi {
    private int noRek;
    private int jenis;
    private double jumlah;

    public Transaksi(int noRek, int jenis, double jumlah) {
        this.noRek = noRek;
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    public int getNoRek() {
        return noRek;
    }

    public void setNoRek(int noRek) {
        this.noRek = noRek;
    }

    public String getJenis() {
        if (jenis == 0) {
            return "Penarikan";
        } else {
            return "Penyetoran";
        }
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
}
