
public class Rekening {

    private String nasabah;
    private int noRek;
    private double saldo;
    private Transaksi[] daftarTransaksi;
    private int jumlahTransaksi;

    public Rekening(String nasabah, int noRek, double saldo) {
        this.nasabah = nasabah;
        this.noRek = noRek;
        this.saldo = saldo;
        daftarTransaksi = new Transaksi[100];
    }

    public String getNasabah() {
        return nasabah;
    }

    public int getNoRek() {
        return noRek;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }
    
    public void tarikUang(double x) {
        saldo = saldo - x;
        daftarTransaksi[jumlahTransaksi] = new Transaksi(noRek, 0, x);
        jumlahTransaksi++;
    }
    
    public void setorUang(double x) {
        saldo = saldo + x;
        daftarTransaksi[jumlahTransaksi] = new Transaksi(noRek, 1, x);
        jumlahTransaksi++;
    }
    
    public Transaksi getTransaksi(int i){
        return daftarTransaksi[i];
    }
    
}
